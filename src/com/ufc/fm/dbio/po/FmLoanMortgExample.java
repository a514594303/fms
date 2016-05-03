package com.ufc.fm.dbio.po;

import java.util.ArrayList;
import java.util.List;

public class FmLoanMortgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmLoanMortgExample() {
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

        public Criteria andMortIdIsNull() {
            addCriterion("mort_id is null");
            return (Criteria) this;
        }

        public Criteria andMortIdIsNotNull() {
            addCriterion("mort_id is not null");
            return (Criteria) this;
        }

        public Criteria andMortIdEqualTo(Integer value) {
            addCriterion("mort_id =", value, "mortId");
            return (Criteria) this;
        }

        public Criteria andMortIdNotEqualTo(Integer value) {
            addCriterion("mort_id <>", value, "mortId");
            return (Criteria) this;
        }

        public Criteria andMortIdGreaterThan(Integer value) {
            addCriterion("mort_id >", value, "mortId");
            return (Criteria) this;
        }

        public Criteria andMortIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mort_id >=", value, "mortId");
            return (Criteria) this;
        }

        public Criteria andMortIdLessThan(Integer value) {
            addCriterion("mort_id <", value, "mortId");
            return (Criteria) this;
        }

        public Criteria andMortIdLessThanOrEqualTo(Integer value) {
            addCriterion("mort_id <=", value, "mortId");
            return (Criteria) this;
        }

        public Criteria andMortIdIn(List<Integer> values) {
            addCriterion("mort_id in", values, "mortId");
            return (Criteria) this;
        }

        public Criteria andMortIdNotIn(List<Integer> values) {
            addCriterion("mort_id not in", values, "mortId");
            return (Criteria) this;
        }

        public Criteria andMortIdBetween(Integer value1, Integer value2) {
            addCriterion("mort_id between", value1, value2, "mortId");
            return (Criteria) this;
        }

        public Criteria andMortIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mort_id not between", value1, value2, "mortId");
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

        public Criteria andPledgeNameIsNull() {
            addCriterion("pledge_name is null");
            return (Criteria) this;
        }

        public Criteria andPledgeNameIsNotNull() {
            addCriterion("pledge_name is not null");
            return (Criteria) this;
        }

        public Criteria andPledgeNameEqualTo(String value) {
            addCriterion("pledge_name =", value, "pledgeName");
            return (Criteria) this;
        }

        public Criteria andPledgeNameNotEqualTo(String value) {
            addCriterion("pledge_name <>", value, "pledgeName");
            return (Criteria) this;
        }

        public Criteria andPledgeNameGreaterThan(String value) {
            addCriterion("pledge_name >", value, "pledgeName");
            return (Criteria) this;
        }

        public Criteria andPledgeNameGreaterThanOrEqualTo(String value) {
            addCriterion("pledge_name >=", value, "pledgeName");
            return (Criteria) this;
        }

        public Criteria andPledgeNameLessThan(String value) {
            addCriterion("pledge_name <", value, "pledgeName");
            return (Criteria) this;
        }

        public Criteria andPledgeNameLessThanOrEqualTo(String value) {
            addCriterion("pledge_name <=", value, "pledgeName");
            return (Criteria) this;
        }

        public Criteria andPledgeNameLike(String value) {
            addCriterion("pledge_name like", value, "pledgeName");
            return (Criteria) this;
        }

        public Criteria andPledgeNameNotLike(String value) {
            addCriterion("pledge_name not like", value, "pledgeName");
            return (Criteria) this;
        }

        public Criteria andPledgeNameIn(List<String> values) {
            addCriterion("pledge_name in", values, "pledgeName");
            return (Criteria) this;
        }

        public Criteria andPledgeNameNotIn(List<String> values) {
            addCriterion("pledge_name not in", values, "pledgeName");
            return (Criteria) this;
        }

        public Criteria andPledgeNameBetween(String value1, String value2) {
            addCriterion("pledge_name between", value1, value2, "pledgeName");
            return (Criteria) this;
        }

        public Criteria andPledgeNameNotBetween(String value1, String value2) {
            addCriterion("pledge_name not between", value1, value2, "pledgeName");
            return (Criteria) this;
        }

        public Criteria andCnyIsNull() {
            addCriterion("cny is null");
            return (Criteria) this;
        }

        public Criteria andCnyIsNotNull() {
            addCriterion("cny is not null");
            return (Criteria) this;
        }

        public Criteria andCnyEqualTo(String value) {
            addCriterion("cny =", value, "cny");
            return (Criteria) this;
        }

        public Criteria andCnyNotEqualTo(String value) {
            addCriterion("cny <>", value, "cny");
            return (Criteria) this;
        }

        public Criteria andCnyGreaterThan(String value) {
            addCriterion("cny >", value, "cny");
            return (Criteria) this;
        }

        public Criteria andCnyGreaterThanOrEqualTo(String value) {
            addCriterion("cny >=", value, "cny");
            return (Criteria) this;
        }

        public Criteria andCnyLessThan(String value) {
            addCriterion("cny <", value, "cny");
            return (Criteria) this;
        }

        public Criteria andCnyLessThanOrEqualTo(String value) {
            addCriterion("cny <=", value, "cny");
            return (Criteria) this;
        }

        public Criteria andCnyLike(String value) {
            addCriterion("cny like", value, "cny");
            return (Criteria) this;
        }

        public Criteria andCnyNotLike(String value) {
            addCriterion("cny not like", value, "cny");
            return (Criteria) this;
        }

        public Criteria andCnyIn(List<String> values) {
            addCriterion("cny in", values, "cny");
            return (Criteria) this;
        }

        public Criteria andCnyNotIn(List<String> values) {
            addCriterion("cny not in", values, "cny");
            return (Criteria) this;
        }

        public Criteria andCnyBetween(String value1, String value2) {
            addCriterion("cny between", value1, value2, "cny");
            return (Criteria) this;
        }

        public Criteria andCnyNotBetween(String value1, String value2) {
            addCriterion("cny not between", value1, value2, "cny");
            return (Criteria) this;
        }

        public Criteria andVouNum1IsNull() {
            addCriterion("vou_num1 is null");
            return (Criteria) this;
        }

        public Criteria andVouNum1IsNotNull() {
            addCriterion("vou_num1 is not null");
            return (Criteria) this;
        }

        public Criteria andVouNum1EqualTo(String value) {
            addCriterion("vou_num1 =", value, "vouNum1");
            return (Criteria) this;
        }

        public Criteria andVouNum1NotEqualTo(String value) {
            addCriterion("vou_num1 <>", value, "vouNum1");
            return (Criteria) this;
        }

        public Criteria andVouNum1GreaterThan(String value) {
            addCriterion("vou_num1 >", value, "vouNum1");
            return (Criteria) this;
        }

        public Criteria andVouNum1GreaterThanOrEqualTo(String value) {
            addCriterion("vou_num1 >=", value, "vouNum1");
            return (Criteria) this;
        }

        public Criteria andVouNum1LessThan(String value) {
            addCriterion("vou_num1 <", value, "vouNum1");
            return (Criteria) this;
        }

        public Criteria andVouNum1LessThanOrEqualTo(String value) {
            addCriterion("vou_num1 <=", value, "vouNum1");
            return (Criteria) this;
        }

        public Criteria andVouNum1Like(String value) {
            addCriterion("vou_num1 like", value, "vouNum1");
            return (Criteria) this;
        }

        public Criteria andVouNum1NotLike(String value) {
            addCriterion("vou_num1 not like", value, "vouNum1");
            return (Criteria) this;
        }

        public Criteria andVouNum1In(List<String> values) {
            addCriterion("vou_num1 in", values, "vouNum1");
            return (Criteria) this;
        }

        public Criteria andVouNum1NotIn(List<String> values) {
            addCriterion("vou_num1 not in", values, "vouNum1");
            return (Criteria) this;
        }

        public Criteria andVouNum1Between(String value1, String value2) {
            addCriterion("vou_num1 between", value1, value2, "vouNum1");
            return (Criteria) this;
        }

        public Criteria andVouNum1NotBetween(String value1, String value2) {
            addCriterion("vou_num1 not between", value1, value2, "vouNum1");
            return (Criteria) this;
        }

        public Criteria andPledgePrice1IsNull() {
            addCriterion("pledge_price1 is null");
            return (Criteria) this;
        }

        public Criteria andPledgePrice1IsNotNull() {
            addCriterion("pledge_price1 is not null");
            return (Criteria) this;
        }

        public Criteria andPledgePrice1EqualTo(String value) {
            addCriterion("pledge_price1 =", value, "pledgePrice1");
            return (Criteria) this;
        }

        public Criteria andPledgePrice1NotEqualTo(String value) {
            addCriterion("pledge_price1 <>", value, "pledgePrice1");
            return (Criteria) this;
        }

        public Criteria andPledgePrice1GreaterThan(String value) {
            addCriterion("pledge_price1 >", value, "pledgePrice1");
            return (Criteria) this;
        }

        public Criteria andPledgePrice1GreaterThanOrEqualTo(String value) {
            addCriterion("pledge_price1 >=", value, "pledgePrice1");
            return (Criteria) this;
        }

        public Criteria andPledgePrice1LessThan(String value) {
            addCriterion("pledge_price1 <", value, "pledgePrice1");
            return (Criteria) this;
        }

        public Criteria andPledgePrice1LessThanOrEqualTo(String value) {
            addCriterion("pledge_price1 <=", value, "pledgePrice1");
            return (Criteria) this;
        }

        public Criteria andPledgePrice1Like(String value) {
            addCriterion("pledge_price1 like", value, "pledgePrice1");
            return (Criteria) this;
        }

        public Criteria andPledgePrice1NotLike(String value) {
            addCriterion("pledge_price1 not like", value, "pledgePrice1");
            return (Criteria) this;
        }

        public Criteria andPledgePrice1In(List<String> values) {
            addCriterion("pledge_price1 in", values, "pledgePrice1");
            return (Criteria) this;
        }

        public Criteria andPledgePrice1NotIn(List<String> values) {
            addCriterion("pledge_price1 not in", values, "pledgePrice1");
            return (Criteria) this;
        }

        public Criteria andPledgePrice1Between(String value1, String value2) {
            addCriterion("pledge_price1 between", value1, value2, "pledgePrice1");
            return (Criteria) this;
        }

        public Criteria andPledgePrice1NotBetween(String value1, String value2) {
            addCriterion("pledge_price1 not between", value1, value2, "pledgePrice1");
            return (Criteria) this;
        }

        public Criteria andVouNum2IsNull() {
            addCriterion("vou_num2 is null");
            return (Criteria) this;
        }

        public Criteria andVouNum2IsNotNull() {
            addCriterion("vou_num2 is not null");
            return (Criteria) this;
        }

        public Criteria andVouNum2EqualTo(String value) {
            addCriterion("vou_num2 =", value, "vouNum2");
            return (Criteria) this;
        }

        public Criteria andVouNum2NotEqualTo(String value) {
            addCriterion("vou_num2 <>", value, "vouNum2");
            return (Criteria) this;
        }

        public Criteria andVouNum2GreaterThan(String value) {
            addCriterion("vou_num2 >", value, "vouNum2");
            return (Criteria) this;
        }

        public Criteria andVouNum2GreaterThanOrEqualTo(String value) {
            addCriterion("vou_num2 >=", value, "vouNum2");
            return (Criteria) this;
        }

        public Criteria andVouNum2LessThan(String value) {
            addCriterion("vou_num2 <", value, "vouNum2");
            return (Criteria) this;
        }

        public Criteria andVouNum2LessThanOrEqualTo(String value) {
            addCriterion("vou_num2 <=", value, "vouNum2");
            return (Criteria) this;
        }

        public Criteria andVouNum2Like(String value) {
            addCriterion("vou_num2 like", value, "vouNum2");
            return (Criteria) this;
        }

        public Criteria andVouNum2NotLike(String value) {
            addCriterion("vou_num2 not like", value, "vouNum2");
            return (Criteria) this;
        }

        public Criteria andVouNum2In(List<String> values) {
            addCriterion("vou_num2 in", values, "vouNum2");
            return (Criteria) this;
        }

        public Criteria andVouNum2NotIn(List<String> values) {
            addCriterion("vou_num2 not in", values, "vouNum2");
            return (Criteria) this;
        }

        public Criteria andVouNum2Between(String value1, String value2) {
            addCriterion("vou_num2 between", value1, value2, "vouNum2");
            return (Criteria) this;
        }

        public Criteria andVouNum2NotBetween(String value1, String value2) {
            addCriterion("vou_num2 not between", value1, value2, "vouNum2");
            return (Criteria) this;
        }

        public Criteria andPledgePrice2IsNull() {
            addCriterion("pledge_price2 is null");
            return (Criteria) this;
        }

        public Criteria andPledgePrice2IsNotNull() {
            addCriterion("pledge_price2 is not null");
            return (Criteria) this;
        }

        public Criteria andPledgePrice2EqualTo(String value) {
            addCriterion("pledge_price2 =", value, "pledgePrice2");
            return (Criteria) this;
        }

        public Criteria andPledgePrice2NotEqualTo(String value) {
            addCriterion("pledge_price2 <>", value, "pledgePrice2");
            return (Criteria) this;
        }

        public Criteria andPledgePrice2GreaterThan(String value) {
            addCriterion("pledge_price2 >", value, "pledgePrice2");
            return (Criteria) this;
        }

        public Criteria andPledgePrice2GreaterThanOrEqualTo(String value) {
            addCriterion("pledge_price2 >=", value, "pledgePrice2");
            return (Criteria) this;
        }

        public Criteria andPledgePrice2LessThan(String value) {
            addCriterion("pledge_price2 <", value, "pledgePrice2");
            return (Criteria) this;
        }

        public Criteria andPledgePrice2LessThanOrEqualTo(String value) {
            addCriterion("pledge_price2 <=", value, "pledgePrice2");
            return (Criteria) this;
        }

        public Criteria andPledgePrice2Like(String value) {
            addCriterion("pledge_price2 like", value, "pledgePrice2");
            return (Criteria) this;
        }

        public Criteria andPledgePrice2NotLike(String value) {
            addCriterion("pledge_price2 not like", value, "pledgePrice2");
            return (Criteria) this;
        }

        public Criteria andPledgePrice2In(List<String> values) {
            addCriterion("pledge_price2 in", values, "pledgePrice2");
            return (Criteria) this;
        }

        public Criteria andPledgePrice2NotIn(List<String> values) {
            addCriterion("pledge_price2 not in", values, "pledgePrice2");
            return (Criteria) this;
        }

        public Criteria andPledgePrice2Between(String value1, String value2) {
            addCriterion("pledge_price2 between", value1, value2, "pledgePrice2");
            return (Criteria) this;
        }

        public Criteria andPledgePrice2NotBetween(String value1, String value2) {
            addCriterion("pledge_price2 not between", value1, value2, "pledgePrice2");
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