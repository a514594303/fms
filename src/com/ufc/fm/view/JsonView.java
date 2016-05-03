package com.ufc.fm.view;

import java.io.ByteArrayOutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.AbstractView;
import com.google.gson.*;
import com.ufc.fm.controller.BaseController;

/**
 * 
* @ClassName: RenderJsonView  
* @Description: TODO  
* @author: disp  
* @date 2015-9-25 下午2:49:58  
* @version 1.0  
*
 */
public class JsonView extends AbstractView {

	private boolean formatPrint;
	
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		
		// Build json document.		
		Gson gsf = null;
		if(! isFormatPrint()){
			gsf = new Gson();
		}
		else{
			gsf = new GsonBuilder().setPrettyPrinting().create();
		}
		String str = gsf.toJson(model.get("jsonView"));
		//System.out.println("return:\n" + str);	
		BaseController.logger.debug("return:\n" + str);

		ByteArrayOutputStream baos = createTemporaryOutputStream();
		baos.write(str.getBytes());  
		
		response.setContentType("application/json;charset=UTF-8");
		//response.setContentType("text/html;charset=UTF-8");
		response.getWriter().write(str);	
		
		// Flush to HTTP response.
		//writeToResponse(response, baos);			
	}

	public boolean isFormatPrint() {
		return formatPrint;
	}

	public void setFormatPrint(boolean formatPrint) {
		this.formatPrint = formatPrint;
	}
}
