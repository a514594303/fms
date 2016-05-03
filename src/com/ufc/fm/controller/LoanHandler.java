package com.ufc.fm.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ufc.comm.util.SpringContextUtil;
import com.ufc.fm.controller.po.ErrorCode;
import com.ufc.fm.controller.po.ReqMsgHeader;
import com.ufc.fm.controller.po.RspMsgHeader;
import com.ufc.fm.dbio.po.FmLoan;
import com.ufc.fm.dbio.po.FmLoanApplicationCar;
import com.ufc.fm.dbio.po.FmLoanApplicationHouse;
import com.ufc.fm.dbio.po.FmLoanApplicationRenov;
import com.ufc.fm.dbio.po.FmLoanColl;
import com.ufc.fm.dbio.po.FmLoanContact;
import com.ufc.fm.dbio.po.FmLoanGcn;
import com.ufc.fm.dbio.po.FmLoanGuran;
import com.ufc.fm.dbio.po.FmLoanMortg;
import com.ufc.fm.dbio.po.FmLoanProgress;
import com.ufc.fm.engine.JsonHelper;
import com.ufc.fm.engine.ReflectDbioPo;
import com.ufc.fm.service.LoanService;


/**
 * 
 * @ClassName: LoanHandler
 * @Description: TODO
 * @author: disp
 * @date 2015-10-20 下午3:01:41
 * @version 1.0
 * 
 */
/**
 * @Description: 增加贷款信息列表查询功能，申请单提交保存功能
 * @author: yyh
 * @date 2015-12-18 下午3:01:41
 * @version 1.1
 * 
 */

@Controller
@RequestMapping("/fmapp/v1/loan")
public class LoanHandler extends BaseController {

	@Autowired
	@Qualifier("loanService")
	private LoanService loanService;

	@RequestMapping(value = "/showprod")
	public ModelAndView doShowprod(HttpServletRequest request,ReqMsgHeader reqMsgHeader) throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();

		StringBuilder hostUrl = new StringBuilder();
		hostUrl.append(request.getScheme()).append("://").append(request.getServerName()).append(":").append(request.getServerPort()).append(request.getContextPath());
		
		ArrayList<Map<String, Object>> resultQuery = new ArrayList<Map<String, Object>>();

		Map<String, Object> p1 = new HashMap<String, Object>();
		p1.put("name", "个人贷款A");
		p1.put("imgurl", hostUrl+"/images/loan/root_flow_0.png");
		p1.put("remark", "用于AAAAA的贷款");
		Map<String, Object> p2 = new HashMap<String, Object>();
		p2.put("name", "个人贷款B");
		p2.put("imgurl", hostUrl+"/images/loan/root_flow_2.png");
		p2.put("remark", "用于BBBBB的贷款");
		Map<String, Object> p3 = new HashMap<String, Object>();
		p3.put("name", "个人贷款C");
		p3.put("imgurl", hostUrl+"/images/loan/root_flow_3.png");
		p3.put("remark", "用于CCCCC的贷款");

		resultQuery.add(p1);
		resultQuery.add(p2);
		resultQuery.add(p3);

		return makeResultMav(rspMsgHeader, result, resultQuery);

	}

	/*
	 * 1 贷款用途 daikuanyt 见字典列表 2 贷款期限 daikuanqx 见字典列表1~5 3 还款方式 huankuanfs 见字典列表
	 * 4 抵押方式 diyafs 见字典列表
	 * 
	 * 1 基础利率 jichull
	 */
	@RequestMapping(value = "/scheme1")
	public ModelAndView doScheme1(ReqMsgHeader reqMsgHeader, String daikuanyt, String daikuanqx, String huankuanfs, String diyafs) throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();

		int nIndex = 0;

		if (daikuanqx == null || daikuanqx.isEmpty()) {
			// rspMsgHeader.setStatus(ErrorCode.PARAMETER_ERROR);
			// rspMsgHeader.setErrorMsg("传递参数不符");
		} else {

			try {

				int n = Integer.parseInt(daikuanqx);
				if (n >= 1 && n <= 6) {
					nIndex = n - 1;
				}

			} catch (NumberFormatException ex) {
				// rspMsgHeader.setStatus(ErrorCode.PARAMETER_ERROR);
				// rspMsgHeader.setErrorMsg("传递参数不符");
			}
		}

		String[] interestRate = { "9.0", "8.1", "7.5", "6.2", "5.3", "4.6" };
		result.put("jichull", interestRate[nIndex]);

		return makeResultMav(rspMsgHeader, result);

	}

	/*
	 * 请求参数： 序号 参数内容 Json TAG 取值 备注 1 贷款利率 daikuanll 例如：5.3，6.0 2 贷款金额 daikuanje
	 * 3 贷款期限 daikuanqx 4 还款方式 huankuanfs 见字典列表 5 起始还款日期 qishihkrq
	 * 
	 * 应答参数： 序号 参数内容 Json TAG 取值 备注 1 每一期内容 DATALIST 对象数组,包含： 还款日期huankuanrq
	 * 还款总金额 hankuanzje 本金 benjin 利息 lixi 贷款余额 daikuanye 2 累计金额 leijije
	 */

	@RequestMapping(value = "/scheme2")
	public ModelAndView doScheme2(ReqMsgHeader reqMsgHeader, String daikuanll, String daikuanje, String daikuanqx, String huankuanfs, String qishihkrq) throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();

		// 暂按照12万，一年12期，开始日期20150123
		ArrayList<Map<String, Object>> resultQuery = new ArrayList<Map<String, Object>>();

		long lAmount = 120000;
		for (int n = 1; n <= 12; n++) {
			Map<String, Object> rec = new HashMap<String, Object>();

			rec.put("huankuanrq", String.format("2015%02d23", n));
			rec.put("hankuanzje", "10500");
			rec.put("benjin", "10000");
			rec.put("lixi", "500");
			rec.put("daikuanye", lAmount - (n * 10000));

			resultQuery.add(rec);
		}

		result.put("leijije", "12600");
		return makeResultMav(rspMsgHeader, result, resultQuery);

	}

	@RequestMapping(value = "/apply")
	public ModelAndView doApply(ReqMsgHeader reqMsgHeader, String cust_id) throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();

		rspMsgHeader.setStatus("0000");
		rspMsgHeader.setErrorMsg("apply");

		return makeResultMav(rspMsgHeader, result);

	}

	@RequestMapping(value = "/apply_saveinfo3")
	public ModelAndView doApplySaveinfo(ReqMsgHeader reqMsgHeader, String jsondata) throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();

		logger.debug("body:" + jsondata);

		Map<String, Map<String, Object>> mvm = JsonHelper.mvmFromJson(jsondata);
		if (mvm == null) {
			rspMsgHeader.setStatus(ErrorCode.PARAMETER_ERROR);
			rspMsgHeader.setErrorMsg("传递参数不符");
		} else {
			Map<String, Object> tmp = mvm.get("daikuanrxx");
			if (tmp != null) {
				logger.debug("daikuanrxx-> shengri:" + tmp.get("shengri"));
				logger.debug("daikuanrxx-> zhengjianhm:" + tmp.get("zhengjianhm"));
			}

			rspMsgHeader.setStatus("0000");
			result.put("cust_id", "202");

		}

		return makeResultMav(rspMsgHeader, result);

	}

	@RequestMapping(value = "/apply_saveimg")
	public ModelAndView doApplySaveimg(HttpServletRequest request, ReqMsgHeader reqMsgHeader, String cust_id, String imgtype) throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();

		if (cust_id == null || cust_id.isEmpty() || imgtype == null || imgtype.isEmpty()) {

			rspMsgHeader.setStatus(ErrorCode.PARAMETER_ERROR);
			rspMsgHeader.setErrorMsg("传递参数不符");
		} else {

			try {
				logger.debug("cust_id:" + cust_id);
				logger.debug("imgtype:" + imgtype);

				List<String> imgUrlList = uploadImageFiles(request, "loan", imgtype);
				for (String imgUrl : imgUrlList) {
					logger.debug("imgurl:" + imgUrl);
					// 将cust_id,imgurl,imgtype关联，并删除已有关联，保存入库
				}

			} catch (Exception e) {
				e.printStackTrace();
				rspMsgHeader.setStatus(ErrorCode.SYSTEM_ERROR);
				rspMsgHeader.setErrorMsg("上传文件失败");
			}

		}

		return makeResultMav(rspMsgHeader, result);

	}

	// e-signature
	@RequestMapping(value = "/apply_es")
	public ModelAndView doApplyES(ReqMsgHeader reqMsgHeader, String cust_id) throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();

		rspMsgHeader.setStatus("0000");
		rspMsgHeader.setErrorMsg("apply_es");

		return makeResultMav(rspMsgHeader, result);

	}

	@RequestMapping(value = "/progress")
	public ModelAndView doProgress(ReqMsgHeader reqMsgHeader, String start_date, String end_date, String cust_id, String cust_name, String identity_card, String loan_status) throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();
		List<Map<String, Object>> resultRec = null;

		List<FmLoanProgress> prog = loanService.inquireProgress(reqMsgHeader.getUserName(), start_date, end_date, cust_id, cust_name, identity_card, loan_status);

		resultRec = new ArrayList<Map<String, Object>>();

		if (prog != null && prog.size() > 0) {
			for (int n = 0; n < prog.size(); n++) {
				FmLoanProgress rec = prog.get(n);
				Map<String, Object> temp = new HashMap<String, Object>();
				temp.put("cust_id", rec.getCustId());
				temp.put("cust_name", rec.getCustName());
				temp.put("loan_date", rec.getLoanDate());
				temp.put("loan_amount", rec.getLoanAmount());
				temp.put("loan_status", rec.getLoanStatus());
				temp.put("loan_rejreason", rec.getLoanRejreason());
				resultRec.add(temp);
			}

		}

		return makeResultMav(rspMsgHeader, result, resultRec);

	}

	// 贷款信息列表查询
	// http://ufc-pc:8080/financialmobile_server/fmapp/v1/loan/QueryLoanList
	// 单个查询后加参数：http://ufc-pc:8080/financialmobile_server/fmapp/v1/loan/QueryLoanList?loan_id=201501
	// ...
	@RequestMapping(value = "/QueryLoanList")
	public ModelAndView QueryLoanList(ReqMsgHeader reqMsgHeader, String loan_id) throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();

		List<Map<String, Object>> resultQuery = null;

		List<FmLoan> fmLoanList = loanService.QueryListLoan(loan_id);
		if (fmLoanList.size() > 0) {
			resultQuery = new ArrayList<Map<String, Object>>();
			for (FmLoan loan : fmLoanList) {
				resultQuery.add(ReflectDbioPo.fmPo2Map(loan));
			}
		}
		return makeResultMav(rspMsgHeader, result, resultQuery);
	}

	// 7.贷款申请单信息
	@RequestMapping(value = "/apply_saveinfo")
	public ModelAndView Applysaveinfo(ReqMsgHeader reqMsgHeader, String jsondata) throws Exception {

		RspMsgHeader rspMsgHeader = makeRspMsgHeader();
		Map<String, Object> result = makeResultMap();

		logger.debug("body:" + jsondata);
		Map<String, Map<String, Object>> mvm = JsonHelper.mvmFromJson(jsondata);

		if (mvm == null) {
			rspMsgHeader.setStatus(ErrorCode.PARAMETER_ERROR);
			rspMsgHeader.setErrorMsg("传递参数不符");
		} else {

			// 1.判断客户号，并将客户号添加到map中，
			Map<String, Object> tmp_daikuanrxx = mvm.get("daikuanrxx");
			if (tmp_daikuanrxx != null) {
				logger.debug("daikuanrxx-> cust_id:" + tmp_daikuanrxx.get("cust_id"));
				String cust_id = (String) tmp_daikuanrxx.get("cust_id");
				rspMsgHeader.setStatus("0000");
				result.put("cust_id", cust_id);
			}

			// 2.获取贷款信息，并将贷款信息单号loan_id添加到map中，
			Map<String, Object> tmp_daikuanxx = mvm.get("daikuanxx");
			if (tmp_daikuanxx != null) {
				FmLoan fmLoan = new FmLoan();
				// 添加字段参数
				fmLoan.setCustId((String) result.get("cust_id"));
				fmLoan.setLoanAmount((String) tmp_daikuanxx.get("daikuanje"));
				fmLoan.setContact((String) (mvm.get("lianxirxx").get("name")));
				fmLoan.setLoanApplication("购房贷款");
				fmLoan.setLoanPeriod((String) tmp_daikuanxx.get("daikuanqx"));
				fmLoan.setMortMode("质押担保" + (String) tmp_daikuanxx.get("zhiyafs"));
				fmLoan.setRate((String) tmp_daikuanxx.get("daikuanll"));
				fmLoan.setBankName((String) tmp_daikuanxx.get("jieshoukhh"));
				fmLoan.setAccountName((String) tmp_daikuanxx.get("jieshouhm"));
				fmLoan.setRecAccount((String) tmp_daikuanxx.get("jieshouzh"));
				fmLoan.setRepAccount((String) tmp_daikuanxx.get("huankuanzh"));
				fmLoan.setRepMethod((String) tmp_daikuanxx.get("huankuanfs"));
				fmLoan.setRepType((String) tmp_daikuanxx.get("huankuanzl"));
				// fmLoan.setTaskId((String) tmp_daikuanxx.get(""));
				// 返回loan_id
				int load_id = loanService.AddLoan(fmLoan);

				result.put("load_id", load_id);
			}

			// 3.联系人信息
			Map<String, Object> tmp_lianxirxx = mvm.get("lianxirxx");
			if (tmp_lianxirxx != null) {

				FmLoanContact loanContact = new FmLoanContact();
				// 添加字段参数
				loanContact.setLoanId(String.valueOf(result.get("load_id")));
				loanContact.setCompanyAddr((String) tmp_lianxirxx.get("company_addr"));
				loanContact.setCompanyPhone((String) tmp_lianxirxx.get("company_phone"));
				loanContact.setCompanyPostcode((String) tmp_lianxirxx.get("company_postcode"));
				loanContact.setGender((String) tmp_lianxirxx.get("gender"));
				loanContact.setHomeAddr((String) tmp_lianxirxx.get("home_addr"));
				loanContact.setHomePhone((String) tmp_lianxirxx.get("home_phone"));
				loanContact.setHomePost((String) tmp_lianxirxx.get("home_postcode"));
				loanContact.setMobilePhone((String) tmp_lianxirxx.get("mobile_phone"));
				loanContact.setName((String) tmp_lianxirxx.get("name"));
				loanContact.setRelation((String) tmp_lianxirxx.get("relation"));

				// 返回loanContact_id
				int loanContact_id = loanService.AddLoanContact(loanContact);
				result.put("mortg_id", loanContact_id);
			}

			// 4-1.贷款用途-购房贷款信息
			Map<String, Object> tmp_goufangdkxx = mvm.get("goufangdkxx");
			if (tmp_goufangdkxx != null) {

				FmLoanApplicationHouse house = new FmLoanApplicationHouse();
				// 添加字段参数
				house.setLoanId(String.valueOf(result.get("load_id")));
				house.setCellName((String) tmp_goufangdkxx.get("fangchanzj"));
				house.setHouseNum((String) tmp_goufangdkxx.get("fanghao"));
				house.setBuildArea((String) tmp_goufangdkxx.get("jianzhumj"));
				house.setHouseAge((String) tmp_goufangdkxx.get("fangling"));
				house.setHouseAddr((String) tmp_goufangdkxx.get("fangwudz"));
				house.setHouseType((String) tmp_goufangdkxx.get("fangwulb"));
				house.setTransType((String) tmp_goufangdkxx.get("jiaoyilb"));
				house.setComplTime((String) tmp_goufangdkxx.get("jungongsj"));
				house.setBuilder((String) tmp_goufangdkxx.get("kaifashangmc"));
				house.setDownPay((String) tmp_goufangdkxx.get("shoufuje"));
				house.setPostcode((String) tmp_goufangdkxx.get("youzhengbm"));

				// 返回house_id
				int house_id = loanService.AddLoanHouse(house);
				result.put("house_id", house_id);
			}

			// 4-2.贷款用途-购车贷款信息
			Map<String, Object> tmp_gouchedkxx = mvm.get("gouchedkxx");
			if (tmp_gouchedkxx != null) {

				FmLoanApplicationCar car = new FmLoanApplicationCar();
				// 添加字段参数
				car.setLoanId(String.valueOf(result.get("load_id")));
				car.setDealerName((String) tmp_gouchedkxx.get("jingxiaoshangmc"));
				car.setPhone((String) tmp_gouchedkxx.get("lianxidh"));
				car.setPrice((String) tmp_gouchedkxx.get("goumaijg"));
				car.setPurDate((String) tmp_gouchedkxx.get("goumairq"));
				car.setVehBrand((String) tmp_gouchedkxx.get("cheliangppxh"));
				car.setVehModel((String) tmp_gouchedkxx.get("cheliangppxh"));
				// 返回car_id
				int car_id = loanService.AddLoanCar(car);
				result.put("car_id", car_id);
			}

			// 4-2.贷款用途-装修贷款信息
			Map<String, Object> tmp_zhuangxiudkxx = mvm.get("zhuangxiudkxx");
			if (tmp_zhuangxiudkxx != null) {

				FmLoanApplicationRenov renov = new FmLoanApplicationRenov();
				// 添加字段参数
				renov.setLoanId(String.valueOf(result.get("load_id")));
				renov.setDecName((String) tmp_zhuangxiudkxx.get("zhangxiushangmc"));
				renov.setDecPrice((String) tmp_zhuangxiudkxx.get("zhuangxiuzj"));
				renov.setPhone((String) tmp_zhuangxiudkxx.get("lainxidh"));

				// 返回renov_id
				int renov_id = loanService.AddLoanRenov(renov);
				result.put("renov_id", renov_id);
			}

			// 5-1.抵押方式-质押担保
			Map<String, Object> tmp_zhiyadb = mvm.get("zhiyadb");
			if (tmp_zhiyadb != null) {

				FmLoanMortg mortg = new FmLoanMortg();
				// 添加字段参数
				mortg.setLoanId(String.valueOf(result.get("load_id")));
				mortg.setCny((String) tmp_zhiyadb.get("bizhong"));
				mortg.setPledgeName((String) tmp_zhiyadb.get("zhiyapinmc"));
				mortg.setPledgePrice1((String) tmp_zhiyadb.get("zhiyapinjz1"));
				mortg.setPledgePrice2((String) tmp_zhiyadb.get("zhiyapinjz2"));
				mortg.setVouNum1((String) tmp_zhiyadb.get("pingzhenghm1"));
				mortg.setVouNum2((String) tmp_zhiyadb.get("pingzhenghm2"));
				// 返回mortg_id
				int mortg_id = loanService.AddLoanMortg(mortg);
				result.put("mortg_id", mortg_id);
			}

			// 5-2.抵押方式-抵押担保
			Map<String, Object> tmp_diyadb = mvm.get("diyadb");
			if (tmp_diyadb != null) {

				FmLoanColl coll = new FmLoanColl();
				// 添加字段参数
				coll.setLoanId(String.valueOf(result.get("load_id")));
				coll.setCarBrand((String) tmp_diyadb.get("qicheppxh"));
				coll.setCarModel((String) tmp_diyadb.get("qicheppxh"));
				coll.setCarPrice((String) tmp_diyadb.get("qichegj"));
				coll.setCollType((String) tmp_diyadb.get("diyapinlx"));
				coll.setCollValue((String) tmp_diyadb.get("diyapinjz"));
				coll.setDrivLicNum((String) tmp_diyadb.get("xingshizhengh"));
				coll.setEngNum((String) tmp_diyadb.get("fadongjih"));
				coll.setOwner((String) tmp_diyadb.get("diyapinsyq"));
				coll.setRealEstateAddr1((String) tmp_diyadb.get("budongchandz1"));
				coll.setRealEstateAddr2((String) tmp_diyadb.get("budongchandz2"));
				coll.setRealEstateArea1((String) tmp_diyadb.get("budongchanmj1"));
				coll.setRealEstateArea2((String) tmp_diyadb.get("budongchanmj2"));
				coll.setRealEstateName1((String) tmp_diyadb.get("budongchanmc1"));
				coll.setRealEstateName2((String) tmp_diyadb.get("budongchanmc2"));
				coll.setRealEstateNum1((String) tmp_diyadb.get("budongchanqzbh1"));
				coll.setRealEstateNum2((String) tmp_diyadb.get("budongchanqzbh2"));
				coll.setRealEstatePostcode1((String) tmp_diyadb.get("budongchanyb1"));
				coll.setRealEstatePostcode2((String) tmp_diyadb.get("budongchanyb2"));

				// 返回coll_id
				int coll_id = loanService.AddLoanColl(coll);
				result.put("mortg_id", coll_id);
			}

			// 5-3.抵押方式-保证担保（自然人）
			Map<String, Object> tmp_baozhendb1 = mvm.get("baozhendb1");
			if (tmp_baozhendb1 != null) {

				FmLoanGuran guran = new FmLoanGuran();
				// 添加字段参数
				guran.setLoanId(String.valueOf(result.get("load_id")));
				guran.setBirthday((String) tmp_baozhendb1.get("shengri"));
				guran.setCertNum((String) tmp_baozhendb1.get("zhengjianhm"));
				guran.setCertType((String) tmp_baozhendb1.get("zhangjianlx"));
				guran.setCommAddr((String) tmp_baozhendb1.get("tongxundz"));
				guran.setCompany((String) tmp_baozhendb1.get("gongzuodw"));
				guran.setGender((String) tmp_baozhendb1.get("xingbie"));
				guran.setGurantee((String) tmp_baozhendb1.get("danbaorenmc"));
				guran.setMobile((String) tmp_baozhendb1.get("lainxidh"));
				guran.setSalary((String) tmp_baozhendb1.get("yuejunsr"));
				guran.setTelephone((String) tmp_baozhendb1.get("yuejunsr"));

				// 返回guran_id
				int guran_id = loanService.AddLoanGuran(guran);
				result.put("guran_id", guran_id);

			}

			// 5-4.抵押方式-保证担保（法人）
			Map<String, Object> tmp_baozhengdb2 = mvm.get("baozhengdb2");
			if (tmp_baozhengdb2 != null) {

				FmLoanGcn gcn = new FmLoanGcn();
				// 添加字段参数
				gcn.setLoanId(String.valueOf(result.get("load_id")));
				gcn.setAddr((String) tmp_baozhengdb2.get("dizhi"));
				gcn.setCompanyCode((String) tmp_baozhengdb2.get("qiyedm"));
				gcn.setCreditGrade((String) tmp_baozhengdb2.get("xingyongdj"));
				gcn.setGuarCompanyName((String) tmp_baozhengdb2.get("baozhengrenmc"));
				gcn.setGuarCompanyPhone((String) tmp_baozhengdb2.get("lianxidh"));
				gcn.setRegCapital((String) tmp_baozhengdb2.get("zhucejb"));

				// 返回gcn_id
				int gcn_id = loanService.AddLoanGcn(gcn);
				result.put("gcn_id", gcn_id);

			}
		}

		return makeResultMav(rspMsgHeader, result);
	}

}
