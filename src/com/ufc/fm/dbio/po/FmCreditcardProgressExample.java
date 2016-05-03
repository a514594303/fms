package com.ufc.fm.dbio.po;

import java.util.ArrayList;
import java.util.List;

public class FmCreditcardProgressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmCreditcardProgressExample() {
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

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("CUST_ID like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("CUST_ID not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("CUST_NAME =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("CUST_NAME <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("CUST_NAME >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NAME >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("CUST_NAME <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_NAME <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("CUST_NAME like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("CUST_NAME not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("CUST_NAME in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("CUST_NAME not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("CUST_NAME between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("CUST_NAME not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCcDateIsNull() {
            addCriterion("CC_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCcDateIsNotNull() {
            addCriterion("CC_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCcDateEqualTo(String value) {
            addCriterion("CC_DATE =", value, "ccDate");
            return (Criteria) this;
        }

        public Criteria andCcDateNotEqualTo(String value) {
            addCriterion("CC_DATE <>", value, "ccDate");
            return (Criteria) this;
        }

        public Criteria andCcDateGreaterThan(String value) {
            addCriterion("CC_DATE >", value, "ccDate");
            return (Criteria) this;
        }

        public Criteria andCcDateGreaterThanOrEqualTo(String value) {
            addCriterion("CC_DATE >=", value, "ccDate");
            return (Criteria) this;
        }

        public Criteria andCcDateLessThan(String value) {
            addCriterion("CC_DATE <", value, "ccDate");
            return (Criteria) this;
        }

        public Criteria andCcDateLessThanOrEqualTo(String value) {
            addCriterion("CC_DATE <=", value, "ccDate");
            return (Criteria) this;
        }

        public Criteria andCcDateLike(String value) {
            addCriterion("CC_DATE like", value, "ccDate");
            return (Criteria) this;
        }

        public Criteria andCcDateNotLike(String value) {
            addCriterion("CC_DATE not like", value, "ccDate");
            return (Criteria) this;
        }

        public Criteria andCcDateIn(List<String> values) {
            addCriterion("CC_DATE in", values, "ccDate");
            return (Criteria) this;
        }

        public Criteria andCcDateNotIn(List<String> values) {
            addCriterion("CC_DATE not in", values, "ccDate");
            return (Criteria) this;
        }

        public Criteria andCcDateBetween(String value1, String value2) {
            addCriterion("CC_DATE between", value1, value2, "ccDate");
            return (Criteria) this;
        }

        public Criteria andCcDateNotBetween(String value1, String value2) {
            addCriterion("CC_DATE not between", value1, value2, "ccDate");
            return (Criteria) this;
        }

        public Criteria andCcStatusIsNull() {
            addCriterion("CC_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCcStatusIsNotNull() {
            addCriterion("CC_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCcStatusEqualTo(String value) {
            addCriterion("CC_STATUS =", value, "ccStatus");
            return (Criteria) this;
        }

        public Criteria andCcStatusNotEqualTo(String value) {
            addCriterion("CC_STATUS <>", value, "ccStatus");
            return (Criteria) this;
        }

        public Criteria andCcStatusGreaterThan(String value) {
            addCriterion("CC_STATUS >", value, "ccStatus");
            return (Criteria) this;
        }

        public Criteria andCcStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CC_STATUS >=", value, "ccStatus");
            return (Criteria) this;
        }

        public Criteria andCcStatusLessThan(String value) {
            addCriterion("CC_STATUS <", value, "ccStatus");
            return (Criteria) this;
        }

        public Criteria andCcStatusLessThanOrEqualTo(String value) {
            addCriterion("CC_STATUS <=", value, "ccStatus");
            return (Criteria) this;
        }

        public Criteria andCcStatusLike(String value) {
            addCriterion("CC_STATUS like", value, "ccStatus");
            return (Criteria) this;
        }

        public Criteria andCcStatusNotLike(String value) {
            addCriterion("CC_STATUS not like", value, "ccStatus");
            return (Criteria) this;
        }

        public Criteria andCcStatusIn(List<String> values) {
            addCriterion("CC_STATUS in", values, "ccStatus");
            return (Criteria) this;
        }

        public Criteria andCcStatusNotIn(List<String> values) {
            addCriterion("CC_STATUS not in", values, "ccStatus");
            return (Criteria) this;
        }

        public Criteria andCcStatusBetween(String value1, String value2) {
            addCriterion("CC_STATUS between", value1, value2, "ccStatus");
            return (Criteria) this;
        }

        public Criteria andCcStatusNotBetween(String value1, String value2) {
            addCriterion("CC_STATUS not between", value1, value2, "ccStatus");
            return (Criteria) this;
        }

        public Criteria andCcRejreasonIsNull() {
            addCriterion("CC_REJREASON is null");
            return (Criteria) this;
        }

        public Criteria andCcRejreasonIsNotNull() {
            addCriterion("CC_REJREASON is not null");
            return (Criteria) this;
        }

        public Criteria andCcRejreasonEqualTo(String value) {
            addCriterion("CC_REJREASON =", value, "ccRejreason");
            return (Criteria) this;
        }

        public Criteria andCcRejreasonNotEqualTo(String value) {
            addCriterion("CC_REJREASON <>", value, "ccRejreason");
            return (Criteria) this;
        }

        public Criteria andCcRejreasonGreaterThan(String value) {
            addCriterion("CC_REJREASON >", value, "ccRejreason");
            return (Criteria) this;
        }

        public Criteria andCcRejreasonGreaterThanOrEqualTo(String value) {
            addCriterion("CC_REJREASON >=", value, "ccRejreason");
            return (Criteria) this;
        }

        public Criteria andCcRejreasonLessThan(String value) {
            addCriterion("CC_REJREASON <", value, "ccRejreason");
            return (Criteria) this;
        }

        public Criteria andCcRejreasonLessThanOrEqualTo(String value) {
            addCriterion("CC_REJREASON <=", value, "ccRejreason");
            return (Criteria) this;
        }

        public Criteria andCcRejreasonLike(String value) {
            addCriterion("CC_REJREASON like", value, "ccRejreason");
            return (Criteria) this;
        }

        public Criteria andCcRejreasonNotLike(String value) {
            addCriterion("CC_REJREASON not like", value, "ccRejreason");
            return (Criteria) this;
        }

        public Criteria andCcRejreasonIn(List<String> values) {
            addCriterion("CC_REJREASON in", values, "ccRejreason");
            return (Criteria) this;
        }

        public Criteria andCcRejreasonNotIn(List<String> values) {
            addCriterion("CC_REJREASON not in", values, "ccRejreason");
            return (Criteria) this;
        }

        public Criteria andCcRejreasonBetween(String value1, String value2) {
            addCriterion("CC_REJREASON between", value1, value2, "ccRejreason");
            return (Criteria) this;
        }

        public Criteria andCcRejreasonNotBetween(String value1, String value2) {
            addCriterion("CC_REJREASON not between", value1, value2, "ccRejreason");
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