package com.ufc.fm.dbio.po;

import java.util.ArrayList;
import java.util.List;

public class FmAppoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmAppoExample() {
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

        public Criteria andAppoIdIsNull() {
            addCriterion("appo_id is null");
            return (Criteria) this;
        }

        public Criteria andAppoIdIsNotNull() {
            addCriterion("appo_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppoIdEqualTo(String value) {
            addCriterion("appo_id =", value, "appoId");
            return (Criteria) this;
        }

        public Criteria andAppoIdNotEqualTo(String value) {
            addCriterion("appo_id <>", value, "appoId");
            return (Criteria) this;
        }

        public Criteria andAppoIdGreaterThan(String value) {
            addCriterion("appo_id >", value, "appoId");
            return (Criteria) this;
        }

        public Criteria andAppoIdGreaterThanOrEqualTo(String value) {
            addCriterion("appo_id >=", value, "appoId");
            return (Criteria) this;
        }

        public Criteria andAppoIdLessThan(String value) {
            addCriterion("appo_id <", value, "appoId");
            return (Criteria) this;
        }

        public Criteria andAppoIdLessThanOrEqualTo(String value) {
            addCriterion("appo_id <=", value, "appoId");
            return (Criteria) this;
        }

        public Criteria andAppoIdLike(String value) {
            addCriterion("appo_id like", value, "appoId");
            return (Criteria) this;
        }

        public Criteria andAppoIdNotLike(String value) {
            addCriterion("appo_id not like", value, "appoId");
            return (Criteria) this;
        }

        public Criteria andAppoIdIn(List<String> values) {
            addCriterion("appo_id in", values, "appoId");
            return (Criteria) this;
        }

        public Criteria andAppoIdNotIn(List<String> values) {
            addCriterion("appo_id not in", values, "appoId");
            return (Criteria) this;
        }

        public Criteria andAppoIdBetween(String value1, String value2) {
            addCriterion("appo_id between", value1, value2, "appoId");
            return (Criteria) this;
        }

        public Criteria andAppoIdNotBetween(String value1, String value2) {
            addCriterion("appo_id not between", value1, value2, "appoId");
            return (Criteria) this;
        }

        public Criteria andAppoDtIsNull() {
            addCriterion("appo_dt is null");
            return (Criteria) this;
        }

        public Criteria andAppoDtIsNotNull() {
            addCriterion("appo_dt is not null");
            return (Criteria) this;
        }

        public Criteria andAppoDtEqualTo(String value) {
            addCriterion("appo_dt =", value, "appoDt");
            return (Criteria) this;
        }

        public Criteria andAppoDtNotEqualTo(String value) {
            addCriterion("appo_dt <>", value, "appoDt");
            return (Criteria) this;
        }

        public Criteria andAppoDtGreaterThan(String value) {
            addCriterion("appo_dt >", value, "appoDt");
            return (Criteria) this;
        }

        public Criteria andAppoDtGreaterThanOrEqualTo(String value) {
            addCriterion("appo_dt >=", value, "appoDt");
            return (Criteria) this;
        }

        public Criteria andAppoDtLessThan(String value) {
            addCriterion("appo_dt <", value, "appoDt");
            return (Criteria) this;
        }

        public Criteria andAppoDtLessThanOrEqualTo(String value) {
            addCriterion("appo_dt <=", value, "appoDt");
            return (Criteria) this;
        }

        public Criteria andAppoDtLike(String value) {
            addCriterion("appo_dt like", value, "appoDt");
            return (Criteria) this;
        }

        public Criteria andAppoDtNotLike(String value) {
            addCriterion("appo_dt not like", value, "appoDt");
            return (Criteria) this;
        }

        public Criteria andAppoDtIn(List<String> values) {
            addCriterion("appo_dt in", values, "appoDt");
            return (Criteria) this;
        }

        public Criteria andAppoDtNotIn(List<String> values) {
            addCriterion("appo_dt not in", values, "appoDt");
            return (Criteria) this;
        }

        public Criteria andAppoDtBetween(String value1, String value2) {
            addCriterion("appo_dt between", value1, value2, "appoDt");
            return (Criteria) this;
        }

        public Criteria andAppoDtNotBetween(String value1, String value2) {
            addCriterion("appo_dt not between", value1, value2, "appoDt");
            return (Criteria) this;
        }

        public Criteria andAppoPlaceIsNull() {
            addCriterion("appo_place is null");
            return (Criteria) this;
        }

        public Criteria andAppoPlaceIsNotNull() {
            addCriterion("appo_place is not null");
            return (Criteria) this;
        }

        public Criteria andAppoPlaceEqualTo(String value) {
            addCriterion("appo_place =", value, "appoPlace");
            return (Criteria) this;
        }

        public Criteria andAppoPlaceNotEqualTo(String value) {
            addCriterion("appo_place <>", value, "appoPlace");
            return (Criteria) this;
        }

        public Criteria andAppoPlaceGreaterThan(String value) {
            addCriterion("appo_place >", value, "appoPlace");
            return (Criteria) this;
        }

        public Criteria andAppoPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("appo_place >=", value, "appoPlace");
            return (Criteria) this;
        }

        public Criteria andAppoPlaceLessThan(String value) {
            addCriterion("appo_place <", value, "appoPlace");
            return (Criteria) this;
        }

        public Criteria andAppoPlaceLessThanOrEqualTo(String value) {
            addCriterion("appo_place <=", value, "appoPlace");
            return (Criteria) this;
        }

        public Criteria andAppoPlaceLike(String value) {
            addCriterion("appo_place like", value, "appoPlace");
            return (Criteria) this;
        }

        public Criteria andAppoPlaceNotLike(String value) {
            addCriterion("appo_place not like", value, "appoPlace");
            return (Criteria) this;
        }

        public Criteria andAppoPlaceIn(List<String> values) {
            addCriterion("appo_place in", values, "appoPlace");
            return (Criteria) this;
        }

        public Criteria andAppoPlaceNotIn(List<String> values) {
            addCriterion("appo_place not in", values, "appoPlace");
            return (Criteria) this;
        }

        public Criteria andAppoPlaceBetween(String value1, String value2) {
            addCriterion("appo_place between", value1, value2, "appoPlace");
            return (Criteria) this;
        }

        public Criteria andAppoPlaceNotBetween(String value1, String value2) {
            addCriterion("appo_place not between", value1, value2, "appoPlace");
            return (Criteria) this;
        }

        public Criteria andAppoStatusIsNull() {
            addCriterion("appo_status is null");
            return (Criteria) this;
        }

        public Criteria andAppoStatusIsNotNull() {
            addCriterion("appo_status is not null");
            return (Criteria) this;
        }

        public Criteria andAppoStatusEqualTo(String value) {
            addCriterion("appo_status =", value, "appoStatus");
            return (Criteria) this;
        }

        public Criteria andAppoStatusNotEqualTo(String value) {
            addCriterion("appo_status <>", value, "appoStatus");
            return (Criteria) this;
        }

        public Criteria andAppoStatusGreaterThan(String value) {
            addCriterion("appo_status >", value, "appoStatus");
            return (Criteria) this;
        }

        public Criteria andAppoStatusGreaterThanOrEqualTo(String value) {
            addCriterion("appo_status >=", value, "appoStatus");
            return (Criteria) this;
        }

        public Criteria andAppoStatusLessThan(String value) {
            addCriterion("appo_status <", value, "appoStatus");
            return (Criteria) this;
        }

        public Criteria andAppoStatusLessThanOrEqualTo(String value) {
            addCriterion("appo_status <=", value, "appoStatus");
            return (Criteria) this;
        }

        public Criteria andAppoStatusLike(String value) {
            addCriterion("appo_status like", value, "appoStatus");
            return (Criteria) this;
        }

        public Criteria andAppoStatusNotLike(String value) {
            addCriterion("appo_status not like", value, "appoStatus");
            return (Criteria) this;
        }

        public Criteria andAppoStatusIn(List<String> values) {
            addCriterion("appo_status in", values, "appoStatus");
            return (Criteria) this;
        }

        public Criteria andAppoStatusNotIn(List<String> values) {
            addCriterion("appo_status not in", values, "appoStatus");
            return (Criteria) this;
        }

        public Criteria andAppoStatusBetween(String value1, String value2) {
            addCriterion("appo_status between", value1, value2, "appoStatus");
            return (Criteria) this;
        }

        public Criteria andAppoStatusNotBetween(String value1, String value2) {
            addCriterion("appo_status not between", value1, value2, "appoStatus");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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