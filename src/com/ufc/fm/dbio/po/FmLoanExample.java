package com.ufc.fm.dbio.po;

import java.util.ArrayList;
import java.util.List;

public class FmLoanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmLoanExample() {
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

        public Criteria andLoanIdIsNull() {
            addCriterion("loan_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNotNull() {
            addCriterion("loan_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanIdEqualTo(Integer value) {
            addCriterion("loan_id =", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotEqualTo(Integer value) {
            addCriterion("loan_id <>", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThan(Integer value) {
            addCriterion("loan_id >", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_id >=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThan(Integer value) {
            addCriterion("loan_id <", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThanOrEqualTo(Integer value) {
            addCriterion("loan_id <=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIn(List<Integer> values) {
            addCriterion("loan_id in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotIn(List<Integer> values) {
            addCriterion("loan_id not in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdBetween(Integer value1, Integer value2) {
            addCriterion("loan_id between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_id not between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("cust_id like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("cust_id not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("task_id like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("task_id not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(String value) {
            addCriterion("loan_amount =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(String value) {
            addCriterion("loan_amount <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(String value) {
            addCriterion("loan_amount >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(String value) {
            addCriterion("loan_amount >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(String value) {
            addCriterion("loan_amount <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(String value) {
            addCriterion("loan_amount <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLike(String value) {
            addCriterion("loan_amount like", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotLike(String value) {
            addCriterion("loan_amount not like", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<String> values) {
            addCriterion("loan_amount in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<String> values) {
            addCriterion("loan_amount not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(String value1, String value2) {
            addCriterion("loan_amount between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(String value1, String value2) {
            addCriterion("loan_amount not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIsNull() {
            addCriterion("loan_period is null");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIsNotNull() {
            addCriterion("loan_period is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodEqualTo(String value) {
            addCriterion("loan_period =", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotEqualTo(String value) {
            addCriterion("loan_period <>", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodGreaterThan(String value) {
            addCriterion("loan_period >", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("loan_period >=", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodLessThan(String value) {
            addCriterion("loan_period <", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodLessThanOrEqualTo(String value) {
            addCriterion("loan_period <=", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodLike(String value) {
            addCriterion("loan_period like", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotLike(String value) {
            addCriterion("loan_period not like", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIn(List<String> values) {
            addCriterion("loan_period in", values, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotIn(List<String> values) {
            addCriterion("loan_period not in", values, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodBetween(String value1, String value2) {
            addCriterion("loan_period between", value1, value2, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotBetween(String value1, String value2) {
            addCriterion("loan_period not between", value1, value2, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(String value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(String value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(String value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(String value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(String value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(String value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLike(String value) {
            addCriterion("rate like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotLike(String value) {
            addCriterion("rate not like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<String> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<String> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(String value1, String value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(String value1, String value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRepMethodIsNull() {
            addCriterion("rep_method is null");
            return (Criteria) this;
        }

        public Criteria andRepMethodIsNotNull() {
            addCriterion("rep_method is not null");
            return (Criteria) this;
        }

        public Criteria andRepMethodEqualTo(String value) {
            addCriterion("rep_method =", value, "repMethod");
            return (Criteria) this;
        }

        public Criteria andRepMethodNotEqualTo(String value) {
            addCriterion("rep_method <>", value, "repMethod");
            return (Criteria) this;
        }

        public Criteria andRepMethodGreaterThan(String value) {
            addCriterion("rep_method >", value, "repMethod");
            return (Criteria) this;
        }

        public Criteria andRepMethodGreaterThanOrEqualTo(String value) {
            addCriterion("rep_method >=", value, "repMethod");
            return (Criteria) this;
        }

        public Criteria andRepMethodLessThan(String value) {
            addCriterion("rep_method <", value, "repMethod");
            return (Criteria) this;
        }

        public Criteria andRepMethodLessThanOrEqualTo(String value) {
            addCriterion("rep_method <=", value, "repMethod");
            return (Criteria) this;
        }

        public Criteria andRepMethodLike(String value) {
            addCriterion("rep_method like", value, "repMethod");
            return (Criteria) this;
        }

        public Criteria andRepMethodNotLike(String value) {
            addCriterion("rep_method not like", value, "repMethod");
            return (Criteria) this;
        }

        public Criteria andRepMethodIn(List<String> values) {
            addCriterion("rep_method in", values, "repMethod");
            return (Criteria) this;
        }

        public Criteria andRepMethodNotIn(List<String> values) {
            addCriterion("rep_method not in", values, "repMethod");
            return (Criteria) this;
        }

        public Criteria andRepMethodBetween(String value1, String value2) {
            addCriterion("rep_method between", value1, value2, "repMethod");
            return (Criteria) this;
        }

        public Criteria andRepMethodNotBetween(String value1, String value2) {
            addCriterion("rep_method not between", value1, value2, "repMethod");
            return (Criteria) this;
        }

        public Criteria andRepTypeIsNull() {
            addCriterion("rep_type is null");
            return (Criteria) this;
        }

        public Criteria andRepTypeIsNotNull() {
            addCriterion("rep_type is not null");
            return (Criteria) this;
        }

        public Criteria andRepTypeEqualTo(String value) {
            addCriterion("rep_type =", value, "repType");
            return (Criteria) this;
        }

        public Criteria andRepTypeNotEqualTo(String value) {
            addCriterion("rep_type <>", value, "repType");
            return (Criteria) this;
        }

        public Criteria andRepTypeGreaterThan(String value) {
            addCriterion("rep_type >", value, "repType");
            return (Criteria) this;
        }

        public Criteria andRepTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rep_type >=", value, "repType");
            return (Criteria) this;
        }

        public Criteria andRepTypeLessThan(String value) {
            addCriterion("rep_type <", value, "repType");
            return (Criteria) this;
        }

        public Criteria andRepTypeLessThanOrEqualTo(String value) {
            addCriterion("rep_type <=", value, "repType");
            return (Criteria) this;
        }

        public Criteria andRepTypeLike(String value) {
            addCriterion("rep_type like", value, "repType");
            return (Criteria) this;
        }

        public Criteria andRepTypeNotLike(String value) {
            addCriterion("rep_type not like", value, "repType");
            return (Criteria) this;
        }

        public Criteria andRepTypeIn(List<String> values) {
            addCriterion("rep_type in", values, "repType");
            return (Criteria) this;
        }

        public Criteria andRepTypeNotIn(List<String> values) {
            addCriterion("rep_type not in", values, "repType");
            return (Criteria) this;
        }

        public Criteria andRepTypeBetween(String value1, String value2) {
            addCriterion("rep_type between", value1, value2, "repType");
            return (Criteria) this;
        }

        public Criteria andRepTypeNotBetween(String value1, String value2) {
            addCriterion("rep_type not between", value1, value2, "repType");
            return (Criteria) this;
        }

        public Criteria andRepAccountIsNull() {
            addCriterion("rep_account is null");
            return (Criteria) this;
        }

        public Criteria andRepAccountIsNotNull() {
            addCriterion("rep_account is not null");
            return (Criteria) this;
        }

        public Criteria andRepAccountEqualTo(String value) {
            addCriterion("rep_account =", value, "repAccount");
            return (Criteria) this;
        }

        public Criteria andRepAccountNotEqualTo(String value) {
            addCriterion("rep_account <>", value, "repAccount");
            return (Criteria) this;
        }

        public Criteria andRepAccountGreaterThan(String value) {
            addCriterion("rep_account >", value, "repAccount");
            return (Criteria) this;
        }

        public Criteria andRepAccountGreaterThanOrEqualTo(String value) {
            addCriterion("rep_account >=", value, "repAccount");
            return (Criteria) this;
        }

        public Criteria andRepAccountLessThan(String value) {
            addCriterion("rep_account <", value, "repAccount");
            return (Criteria) this;
        }

        public Criteria andRepAccountLessThanOrEqualTo(String value) {
            addCriterion("rep_account <=", value, "repAccount");
            return (Criteria) this;
        }

        public Criteria andRepAccountLike(String value) {
            addCriterion("rep_account like", value, "repAccount");
            return (Criteria) this;
        }

        public Criteria andRepAccountNotLike(String value) {
            addCriterion("rep_account not like", value, "repAccount");
            return (Criteria) this;
        }

        public Criteria andRepAccountIn(List<String> values) {
            addCriterion("rep_account in", values, "repAccount");
            return (Criteria) this;
        }

        public Criteria andRepAccountNotIn(List<String> values) {
            addCriterion("rep_account not in", values, "repAccount");
            return (Criteria) this;
        }

        public Criteria andRepAccountBetween(String value1, String value2) {
            addCriterion("rep_account between", value1, value2, "repAccount");
            return (Criteria) this;
        }

        public Criteria andRepAccountNotBetween(String value1, String value2) {
            addCriterion("rep_account not between", value1, value2, "repAccount");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationIsNull() {
            addCriterion("loan_application is null");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationIsNotNull() {
            addCriterion("loan_application is not null");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationEqualTo(String value) {
            addCriterion("loan_application =", value, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationNotEqualTo(String value) {
            addCriterion("loan_application <>", value, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationGreaterThan(String value) {
            addCriterion("loan_application >", value, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationGreaterThanOrEqualTo(String value) {
            addCriterion("loan_application >=", value, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationLessThan(String value) {
            addCriterion("loan_application <", value, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationLessThanOrEqualTo(String value) {
            addCriterion("loan_application <=", value, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationLike(String value) {
            addCriterion("loan_application like", value, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationNotLike(String value) {
            addCriterion("loan_application not like", value, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationIn(List<String> values) {
            addCriterion("loan_application in", values, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationNotIn(List<String> values) {
            addCriterion("loan_application not in", values, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationBetween(String value1, String value2) {
            addCriterion("loan_application between", value1, value2, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andLoanApplicationNotBetween(String value1, String value2) {
            addCriterion("loan_application not between", value1, value2, "loanApplication");
            return (Criteria) this;
        }

        public Criteria andMortModeIsNull() {
            addCriterion("mort_mode is null");
            return (Criteria) this;
        }

        public Criteria andMortModeIsNotNull() {
            addCriterion("mort_mode is not null");
            return (Criteria) this;
        }

        public Criteria andMortModeEqualTo(String value) {
            addCriterion("mort_mode =", value, "mortMode");
            return (Criteria) this;
        }

        public Criteria andMortModeNotEqualTo(String value) {
            addCriterion("mort_mode <>", value, "mortMode");
            return (Criteria) this;
        }

        public Criteria andMortModeGreaterThan(String value) {
            addCriterion("mort_mode >", value, "mortMode");
            return (Criteria) this;
        }

        public Criteria andMortModeGreaterThanOrEqualTo(String value) {
            addCriterion("mort_mode >=", value, "mortMode");
            return (Criteria) this;
        }

        public Criteria andMortModeLessThan(String value) {
            addCriterion("mort_mode <", value, "mortMode");
            return (Criteria) this;
        }

        public Criteria andMortModeLessThanOrEqualTo(String value) {
            addCriterion("mort_mode <=", value, "mortMode");
            return (Criteria) this;
        }

        public Criteria andMortModeLike(String value) {
            addCriterion("mort_mode like", value, "mortMode");
            return (Criteria) this;
        }

        public Criteria andMortModeNotLike(String value) {
            addCriterion("mort_mode not like", value, "mortMode");
            return (Criteria) this;
        }

        public Criteria andMortModeIn(List<String> values) {
            addCriterion("mort_mode in", values, "mortMode");
            return (Criteria) this;
        }

        public Criteria andMortModeNotIn(List<String> values) {
            addCriterion("mort_mode not in", values, "mortMode");
            return (Criteria) this;
        }

        public Criteria andMortModeBetween(String value1, String value2) {
            addCriterion("mort_mode between", value1, value2, "mortMode");
            return (Criteria) this;
        }

        public Criteria andMortModeNotBetween(String value1, String value2) {
            addCriterion("mort_mode not between", value1, value2, "mortMode");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andRecAccountIsNull() {
            addCriterion("rec_account is null");
            return (Criteria) this;
        }

        public Criteria andRecAccountIsNotNull() {
            addCriterion("rec_account is not null");
            return (Criteria) this;
        }

        public Criteria andRecAccountEqualTo(String value) {
            addCriterion("rec_account =", value, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountNotEqualTo(String value) {
            addCriterion("rec_account <>", value, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountGreaterThan(String value) {
            addCriterion("rec_account >", value, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountGreaterThanOrEqualTo(String value) {
            addCriterion("rec_account >=", value, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountLessThan(String value) {
            addCriterion("rec_account <", value, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountLessThanOrEqualTo(String value) {
            addCriterion("rec_account <=", value, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountLike(String value) {
            addCriterion("rec_account like", value, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountNotLike(String value) {
            addCriterion("rec_account not like", value, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountIn(List<String> values) {
            addCriterion("rec_account in", values, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountNotIn(List<String> values) {
            addCriterion("rec_account not in", values, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountBetween(String value1, String value2) {
            addCriterion("rec_account between", value1, value2, "recAccount");
            return (Criteria) this;
        }

        public Criteria andRecAccountNotBetween(String value1, String value2) {
            addCriterion("rec_account not between", value1, value2, "recAccount");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
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