package com.ufc.fm.dbio.po;

import java.util.ArrayList;
import java.util.List;

public class FmLoanApplicationHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmLoanApplicationHouseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andHouseIdIsNull() {
            addCriterion("house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(Integer value) {
            addCriterion("house_id =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(Integer value) {
            addCriterion("house_id <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(Integer value) {
            addCriterion("house_id >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_id >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(Integer value) {
            addCriterion("house_id <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("house_id <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<Integer> values) {
            addCriterion("house_id in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<Integer> values) {
            addCriterion("house_id not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(Integer value1, Integer value2) {
            addCriterion("house_id between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("house_id not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNull() {
            addCriterion("loan_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNotNull() {
            addCriterion("loan_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanIdEqualTo(String value) {
            addCriterion("loan_id =", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotEqualTo(String value) {
            addCriterion("loan_id <>", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThan(String value) {
            addCriterion("loan_id >", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThanOrEqualTo(String value) {
            addCriterion("loan_id >=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThan(String value) {
            addCriterion("loan_id <", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThanOrEqualTo(String value) {
            addCriterion("loan_id <=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLike(String value) {
            addCriterion("loan_id like", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotLike(String value) {
            addCriterion("loan_id not like", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIn(List<String> values) {
            addCriterion("loan_id in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotIn(List<String> values) {
            addCriterion("loan_id not in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdBetween(String value1, String value2) {
            addCriterion("loan_id between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotBetween(String value1, String value2) {
            addCriterion("loan_id not between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andHouseAddrIsNull() {
            addCriterion("house_addr is null");
            return (Criteria) this;
        }

        public Criteria andHouseAddrIsNotNull() {
            addCriterion("house_addr is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAddrEqualTo(String value) {
            addCriterion("house_addr =", value, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrNotEqualTo(String value) {
            addCriterion("house_addr <>", value, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrGreaterThan(String value) {
            addCriterion("house_addr >", value, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrGreaterThanOrEqualTo(String value) {
            addCriterion("house_addr >=", value, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrLessThan(String value) {
            addCriterion("house_addr <", value, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrLessThanOrEqualTo(String value) {
            addCriterion("house_addr <=", value, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrLike(String value) {
            addCriterion("house_addr like", value, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrNotLike(String value) {
            addCriterion("house_addr not like", value, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrIn(List<String> values) {
            addCriterion("house_addr in", values, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrNotIn(List<String> values) {
            addCriterion("house_addr not in", values, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrBetween(String value1, String value2) {
            addCriterion("house_addr between", value1, value2, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrNotBetween(String value1, String value2) {
            addCriterion("house_addr not between", value1, value2, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postcode not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andCellNameIsNull() {
            addCriterion("cell_name is null");
            return (Criteria) this;
        }

        public Criteria andCellNameIsNotNull() {
            addCriterion("cell_name is not null");
            return (Criteria) this;
        }

        public Criteria andCellNameEqualTo(String value) {
            addCriterion("cell_name =", value, "cellName");
            return (Criteria) this;
        }

        public Criteria andCellNameNotEqualTo(String value) {
            addCriterion("cell_name <>", value, "cellName");
            return (Criteria) this;
        }

        public Criteria andCellNameGreaterThan(String value) {
            addCriterion("cell_name >", value, "cellName");
            return (Criteria) this;
        }

        public Criteria andCellNameGreaterThanOrEqualTo(String value) {
            addCriterion("cell_name >=", value, "cellName");
            return (Criteria) this;
        }

        public Criteria andCellNameLessThan(String value) {
            addCriterion("cell_name <", value, "cellName");
            return (Criteria) this;
        }

        public Criteria andCellNameLessThanOrEqualTo(String value) {
            addCriterion("cell_name <=", value, "cellName");
            return (Criteria) this;
        }

        public Criteria andCellNameLike(String value) {
            addCriterion("cell_name like", value, "cellName");
            return (Criteria) this;
        }

        public Criteria andCellNameNotLike(String value) {
            addCriterion("cell_name not like", value, "cellName");
            return (Criteria) this;
        }

        public Criteria andCellNameIn(List<String> values) {
            addCriterion("cell_name in", values, "cellName");
            return (Criteria) this;
        }

        public Criteria andCellNameNotIn(List<String> values) {
            addCriterion("cell_name not in", values, "cellName");
            return (Criteria) this;
        }

        public Criteria andCellNameBetween(String value1, String value2) {
            addCriterion("cell_name between", value1, value2, "cellName");
            return (Criteria) this;
        }

        public Criteria andCellNameNotBetween(String value1, String value2) {
            addCriterion("cell_name not between", value1, value2, "cellName");
            return (Criteria) this;
        }

        public Criteria andHouseNumIsNull() {
            addCriterion("house_num is null");
            return (Criteria) this;
        }

        public Criteria andHouseNumIsNotNull() {
            addCriterion("house_num is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNumEqualTo(String value) {
            addCriterion("house_num =", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumNotEqualTo(String value) {
            addCriterion("house_num <>", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumGreaterThan(String value) {
            addCriterion("house_num >", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumGreaterThanOrEqualTo(String value) {
            addCriterion("house_num >=", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumLessThan(String value) {
            addCriterion("house_num <", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumLessThanOrEqualTo(String value) {
            addCriterion("house_num <=", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumLike(String value) {
            addCriterion("house_num like", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumNotLike(String value) {
            addCriterion("house_num not like", value, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumIn(List<String> values) {
            addCriterion("house_num in", values, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumNotIn(List<String> values) {
            addCriterion("house_num not in", values, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumBetween(String value1, String value2) {
            addCriterion("house_num between", value1, value2, "houseNum");
            return (Criteria) this;
        }

        public Criteria andHouseNumNotBetween(String value1, String value2) {
            addCriterion("house_num not between", value1, value2, "houseNum");
            return (Criteria) this;
        }

        public Criteria andBuilderIsNull() {
            addCriterion("builder is null");
            return (Criteria) this;
        }

        public Criteria andBuilderIsNotNull() {
            addCriterion("builder is not null");
            return (Criteria) this;
        }

        public Criteria andBuilderEqualTo(String value) {
            addCriterion("builder =", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderNotEqualTo(String value) {
            addCriterion("builder <>", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderGreaterThan(String value) {
            addCriterion("builder >", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderGreaterThanOrEqualTo(String value) {
            addCriterion("builder >=", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderLessThan(String value) {
            addCriterion("builder <", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderLessThanOrEqualTo(String value) {
            addCriterion("builder <=", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderLike(String value) {
            addCriterion("builder like", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderNotLike(String value) {
            addCriterion("builder not like", value, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderIn(List<String> values) {
            addCriterion("builder in", values, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderNotIn(List<String> values) {
            addCriterion("builder not in", values, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderBetween(String value1, String value2) {
            addCriterion("builder between", value1, value2, "builder");
            return (Criteria) this;
        }

        public Criteria andBuilderNotBetween(String value1, String value2) {
            addCriterion("builder not between", value1, value2, "builder");
            return (Criteria) this;
        }

        public Criteria andComplTimeIsNull() {
            addCriterion("compl_time is null");
            return (Criteria) this;
        }

        public Criteria andComplTimeIsNotNull() {
            addCriterion("compl_time is not null");
            return (Criteria) this;
        }

        public Criteria andComplTimeEqualTo(String value) {
            addCriterion("compl_time =", value, "complTime");
            return (Criteria) this;
        }

        public Criteria andComplTimeNotEqualTo(String value) {
            addCriterion("compl_time <>", value, "complTime");
            return (Criteria) this;
        }

        public Criteria andComplTimeGreaterThan(String value) {
            addCriterion("compl_time >", value, "complTime");
            return (Criteria) this;
        }

        public Criteria andComplTimeGreaterThanOrEqualTo(String value) {
            addCriterion("compl_time >=", value, "complTime");
            return (Criteria) this;
        }

        public Criteria andComplTimeLessThan(String value) {
            addCriterion("compl_time <", value, "complTime");
            return (Criteria) this;
        }

        public Criteria andComplTimeLessThanOrEqualTo(String value) {
            addCriterion("compl_time <=", value, "complTime");
            return (Criteria) this;
        }

        public Criteria andComplTimeLike(String value) {
            addCriterion("compl_time like", value, "complTime");
            return (Criteria) this;
        }

        public Criteria andComplTimeNotLike(String value) {
            addCriterion("compl_time not like", value, "complTime");
            return (Criteria) this;
        }

        public Criteria andComplTimeIn(List<String> values) {
            addCriterion("compl_time in", values, "complTime");
            return (Criteria) this;
        }

        public Criteria andComplTimeNotIn(List<String> values) {
            addCriterion("compl_time not in", values, "complTime");
            return (Criteria) this;
        }

        public Criteria andComplTimeBetween(String value1, String value2) {
            addCriterion("compl_time between", value1, value2, "complTime");
            return (Criteria) this;
        }

        public Criteria andComplTimeNotBetween(String value1, String value2) {
            addCriterion("compl_time not between", value1, value2, "complTime");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNull() {
            addCriterion("trans_type is null");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNotNull() {
            addCriterion("trans_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransTypeEqualTo(String value) {
            addCriterion("trans_type =", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotEqualTo(String value) {
            addCriterion("trans_type <>", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThan(String value) {
            addCriterion("trans_type >", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThanOrEqualTo(String value) {
            addCriterion("trans_type >=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThan(String value) {
            addCriterion("trans_type <", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThanOrEqualTo(String value) {
            addCriterion("trans_type <=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLike(String value) {
            addCriterion("trans_type like", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotLike(String value) {
            addCriterion("trans_type not like", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeIn(List<String> values) {
            addCriterion("trans_type in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotIn(List<String> values) {
            addCriterion("trans_type not in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeBetween(String value1, String value2) {
            addCriterion("trans_type between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotBetween(String value1, String value2) {
            addCriterion("trans_type not between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andHouseAgeIsNull() {
            addCriterion("house_age is null");
            return (Criteria) this;
        }

        public Criteria andHouseAgeIsNotNull() {
            addCriterion("house_age is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAgeEqualTo(String value) {
            addCriterion("house_age =", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeNotEqualTo(String value) {
            addCriterion("house_age <>", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeGreaterThan(String value) {
            addCriterion("house_age >", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeGreaterThanOrEqualTo(String value) {
            addCriterion("house_age >=", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeLessThan(String value) {
            addCriterion("house_age <", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeLessThanOrEqualTo(String value) {
            addCriterion("house_age <=", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeLike(String value) {
            addCriterion("house_age like", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeNotLike(String value) {
            addCriterion("house_age not like", value, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeIn(List<String> values) {
            addCriterion("house_age in", values, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeNotIn(List<String> values) {
            addCriterion("house_age not in", values, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeBetween(String value1, String value2) {
            addCriterion("house_age between", value1, value2, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseAgeNotBetween(String value1, String value2) {
            addCriterion("house_age not between", value1, value2, "houseAge");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNull() {
            addCriterion("house_type is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNotNull() {
            addCriterion("house_type is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeEqualTo(String value) {
            addCriterion("house_type =", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotEqualTo(String value) {
            addCriterion("house_type <>", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThan(String value) {
            addCriterion("house_type >", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("house_type >=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThan(String value) {
            addCriterion("house_type <", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThanOrEqualTo(String value) {
            addCriterion("house_type <=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLike(String value) {
            addCriterion("house_type like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotLike(String value) {
            addCriterion("house_type not like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIn(List<String> values) {
            addCriterion("house_type in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotIn(List<String> values) {
            addCriterion("house_type not in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeBetween(String value1, String value2) {
            addCriterion("house_type between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotBetween(String value1, String value2) {
            addCriterion("house_type not between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andBuildAreaIsNull() {
            addCriterion("build_area is null");
            return (Criteria) this;
        }

        public Criteria andBuildAreaIsNotNull() {
            addCriterion("build_area is not null");
            return (Criteria) this;
        }

        public Criteria andBuildAreaEqualTo(String value) {
            addCriterion("build_area =", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaNotEqualTo(String value) {
            addCriterion("build_area <>", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaGreaterThan(String value) {
            addCriterion("build_area >", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaGreaterThanOrEqualTo(String value) {
            addCriterion("build_area >=", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaLessThan(String value) {
            addCriterion("build_area <", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaLessThanOrEqualTo(String value) {
            addCriterion("build_area <=", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaLike(String value) {
            addCriterion("build_area like", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaNotLike(String value) {
            addCriterion("build_area not like", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaIn(List<String> values) {
            addCriterion("build_area in", values, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaNotIn(List<String> values) {
            addCriterion("build_area not in", values, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaBetween(String value1, String value2) {
            addCriterion("build_area between", value1, value2, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaNotBetween(String value1, String value2) {
            addCriterion("build_area not between", value1, value2, "buildArea");
            return (Criteria) this;
        }

        public Criteria andDownPayIsNull() {
            addCriterion("down_pay is null");
            return (Criteria) this;
        }

        public Criteria andDownPayIsNotNull() {
            addCriterion("down_pay is not null");
            return (Criteria) this;
        }

        public Criteria andDownPayEqualTo(String value) {
            addCriterion("down_pay =", value, "downPay");
            return (Criteria) this;
        }

        public Criteria andDownPayNotEqualTo(String value) {
            addCriterion("down_pay <>", value, "downPay");
            return (Criteria) this;
        }

        public Criteria andDownPayGreaterThan(String value) {
            addCriterion("down_pay >", value, "downPay");
            return (Criteria) this;
        }

        public Criteria andDownPayGreaterThanOrEqualTo(String value) {
            addCriterion("down_pay >=", value, "downPay");
            return (Criteria) this;
        }

        public Criteria andDownPayLessThan(String value) {
            addCriterion("down_pay <", value, "downPay");
            return (Criteria) this;
        }

        public Criteria andDownPayLessThanOrEqualTo(String value) {
            addCriterion("down_pay <=", value, "downPay");
            return (Criteria) this;
        }

        public Criteria andDownPayLike(String value) {
            addCriterion("down_pay like", value, "downPay");
            return (Criteria) this;
        }

        public Criteria andDownPayNotLike(String value) {
            addCriterion("down_pay not like", value, "downPay");
            return (Criteria) this;
        }

        public Criteria andDownPayIn(List<String> values) {
            addCriterion("down_pay in", values, "downPay");
            return (Criteria) this;
        }

        public Criteria andDownPayNotIn(List<String> values) {
            addCriterion("down_pay not in", values, "downPay");
            return (Criteria) this;
        }

        public Criteria andDownPayBetween(String value1, String value2) {
            addCriterion("down_pay between", value1, value2, "downPay");
            return (Criteria) this;
        }

        public Criteria andDownPayNotBetween(String value1, String value2) {
            addCriterion("down_pay not between", value1, value2, "downPay");
            return (Criteria) this;
        }

        public Criteria andHousePriceIsNull() {
            addCriterion("house_price is null");
            return (Criteria) this;
        }

        public Criteria andHousePriceIsNotNull() {
            addCriterion("house_price is not null");
            return (Criteria) this;
        }

        public Criteria andHousePriceEqualTo(String value) {
            addCriterion("house_price =", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotEqualTo(String value) {
            addCriterion("house_price <>", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceGreaterThan(String value) {
            addCriterion("house_price >", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceGreaterThanOrEqualTo(String value) {
            addCriterion("house_price >=", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceLessThan(String value) {
            addCriterion("house_price <", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceLessThanOrEqualTo(String value) {
            addCriterion("house_price <=", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceLike(String value) {
            addCriterion("house_price like", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotLike(String value) {
            addCriterion("house_price not like", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceIn(List<String> values) {
            addCriterion("house_price in", values, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotIn(List<String> values) {
            addCriterion("house_price not in", values, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceBetween(String value1, String value2) {
            addCriterion("house_price between", value1, value2, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotBetween(String value1, String value2) {
            addCriterion("house_price not between", value1, value2, "housePrice");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}