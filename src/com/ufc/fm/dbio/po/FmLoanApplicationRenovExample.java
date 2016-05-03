package com.ufc.fm.dbio.po;

import java.util.ArrayList;
import java.util.List;

public class FmLoanApplicationRenovExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmLoanApplicationRenovExample() {
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

        public Criteria andRenIdIsNull() {
            addCriterion("ren_id is null");
            return (Criteria) this;
        }

        public Criteria andRenIdIsNotNull() {
            addCriterion("ren_id is not null");
            return (Criteria) this;
        }

        public Criteria andRenIdEqualTo(Integer value) {
            addCriterion("ren_id =", value, "renId");
            return (Criteria) this;
        }

        public Criteria andRenIdNotEqualTo(Integer value) {
            addCriterion("ren_id <>", value, "renId");
            return (Criteria) this;
        }

        public Criteria andRenIdGreaterThan(Integer value) {
            addCriterion("ren_id >", value, "renId");
            return (Criteria) this;
        }

        public Criteria andRenIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ren_id >=", value, "renId");
            return (Criteria) this;
        }

        public Criteria andRenIdLessThan(Integer value) {
            addCriterion("ren_id <", value, "renId");
            return (Criteria) this;
        }

        public Criteria andRenIdLessThanOrEqualTo(Integer value) {
            addCriterion("ren_id <=", value, "renId");
            return (Criteria) this;
        }

        public Criteria andRenIdIn(List<Integer> values) {
            addCriterion("ren_id in", values, "renId");
            return (Criteria) this;
        }

        public Criteria andRenIdNotIn(List<Integer> values) {
            addCriterion("ren_id not in", values, "renId");
            return (Criteria) this;
        }

        public Criteria andRenIdBetween(Integer value1, Integer value2) {
            addCriterion("ren_id between", value1, value2, "renId");
            return (Criteria) this;
        }

        public Criteria andRenIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ren_id not between", value1, value2, "renId");
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

        public Criteria andDecNameIsNull() {
            addCriterion("dec_name is null");
            return (Criteria) this;
        }

        public Criteria andDecNameIsNotNull() {
            addCriterion("dec_name is not null");
            return (Criteria) this;
        }

        public Criteria andDecNameEqualTo(String value) {
            addCriterion("dec_name =", value, "decName");
            return (Criteria) this;
        }

        public Criteria andDecNameNotEqualTo(String value) {
            addCriterion("dec_name <>", value, "decName");
            return (Criteria) this;
        }

        public Criteria andDecNameGreaterThan(String value) {
            addCriterion("dec_name >", value, "decName");
            return (Criteria) this;
        }

        public Criteria andDecNameGreaterThanOrEqualTo(String value) {
            addCriterion("dec_name >=", value, "decName");
            return (Criteria) this;
        }

        public Criteria andDecNameLessThan(String value) {
            addCriterion("dec_name <", value, "decName");
            return (Criteria) this;
        }

        public Criteria andDecNameLessThanOrEqualTo(String value) {
            addCriterion("dec_name <=", value, "decName");
            return (Criteria) this;
        }

        public Criteria andDecNameLike(String value) {
            addCriterion("dec_name like", value, "decName");
            return (Criteria) this;
        }

        public Criteria andDecNameNotLike(String value) {
            addCriterion("dec_name not like", value, "decName");
            return (Criteria) this;
        }

        public Criteria andDecNameIn(List<String> values) {
            addCriterion("dec_name in", values, "decName");
            return (Criteria) this;
        }

        public Criteria andDecNameNotIn(List<String> values) {
            addCriterion("dec_name not in", values, "decName");
            return (Criteria) this;
        }

        public Criteria andDecNameBetween(String value1, String value2) {
            addCriterion("dec_name between", value1, value2, "decName");
            return (Criteria) this;
        }

        public Criteria andDecNameNotBetween(String value1, String value2) {
            addCriterion("dec_name not between", value1, value2, "decName");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andDecPriceIsNull() {
            addCriterion("dec_price is null");
            return (Criteria) this;
        }

        public Criteria andDecPriceIsNotNull() {
            addCriterion("dec_price is not null");
            return (Criteria) this;
        }

        public Criteria andDecPriceEqualTo(String value) {
            addCriterion("dec_price =", value, "decPrice");
            return (Criteria) this;
        }

        public Criteria andDecPriceNotEqualTo(String value) {
            addCriterion("dec_price <>", value, "decPrice");
            return (Criteria) this;
        }

        public Criteria andDecPriceGreaterThan(String value) {
            addCriterion("dec_price >", value, "decPrice");
            return (Criteria) this;
        }

        public Criteria andDecPriceGreaterThanOrEqualTo(String value) {
            addCriterion("dec_price >=", value, "decPrice");
            return (Criteria) this;
        }

        public Criteria andDecPriceLessThan(String value) {
            addCriterion("dec_price <", value, "decPrice");
            return (Criteria) this;
        }

        public Criteria andDecPriceLessThanOrEqualTo(String value) {
            addCriterion("dec_price <=", value, "decPrice");
            return (Criteria) this;
        }

        public Criteria andDecPriceLike(String value) {
            addCriterion("dec_price like", value, "decPrice");
            return (Criteria) this;
        }

        public Criteria andDecPriceNotLike(String value) {
            addCriterion("dec_price not like", value, "decPrice");
            return (Criteria) this;
        }

        public Criteria andDecPriceIn(List<String> values) {
            addCriterion("dec_price in", values, "decPrice");
            return (Criteria) this;
        }

        public Criteria andDecPriceNotIn(List<String> values) {
            addCriterion("dec_price not in", values, "decPrice");
            return (Criteria) this;
        }

        public Criteria andDecPriceBetween(String value1, String value2) {
            addCriterion("dec_price between", value1, value2, "decPrice");
            return (Criteria) this;
        }

        public Criteria andDecPriceNotBetween(String value1, String value2) {
            addCriterion("dec_price not between", value1, value2, "decPrice");
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