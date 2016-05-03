package com.ufc.fm.rbac.po;

import java.util.ArrayList;
import java.util.List;

public class FmResPermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmResPermissionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeIsNull() {
            addCriterion("PERMISSION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeIsNotNull() {
            addCriterion("PERMISSION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeEqualTo(String value) {
            addCriterion("PERMISSION_TYPE =", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotEqualTo(String value) {
            addCriterion("PERMISSION_TYPE <>", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeGreaterThan(String value) {
            addCriterion("PERMISSION_TYPE >", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION_TYPE >=", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeLessThan(String value) {
            addCriterion("PERMISSION_TYPE <", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION_TYPE <=", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeLike(String value) {
            addCriterion("PERMISSION_TYPE like", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotLike(String value) {
            addCriterion("PERMISSION_TYPE not like", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeIn(List<String> values) {
            addCriterion("PERMISSION_TYPE in", values, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotIn(List<String> values) {
            addCriterion("PERMISSION_TYPE not in", values, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeBetween(String value1, String value2) {
            addCriterion("PERMISSION_TYPE between", value1, value2, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotBetween(String value1, String value2) {
            addCriterion("PERMISSION_TYPE not between", value1, value2, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNull() {
            addCriterion("PERMISSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNotNull() {
            addCriterion("PERMISSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdEqualTo(String value) {
            addCriterion("PERMISSION_ID =", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotEqualTo(String value) {
            addCriterion("PERMISSION_ID <>", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThan(String value) {
            addCriterion("PERMISSION_ID >", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION_ID >=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThan(String value) {
            addCriterion("PERMISSION_ID <", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION_ID <=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLike(String value) {
            addCriterion("PERMISSION_ID like", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotLike(String value) {
            addCriterion("PERMISSION_ID not like", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIn(List<String> values) {
            addCriterion("PERMISSION_ID in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotIn(List<String> values) {
            addCriterion("PERMISSION_ID not in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdBetween(String value1, String value2) {
            addCriterion("PERMISSION_ID between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotBetween(String value1, String value2) {
            addCriterion("PERMISSION_ID not between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdIsNull() {
            addCriterion("RESOURCES_ID is null");
            return (Criteria) this;
        }

        public Criteria andResourcesIdIsNotNull() {
            addCriterion("RESOURCES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesIdEqualTo(String value) {
            addCriterion("RESOURCES_ID =", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdNotEqualTo(String value) {
            addCriterion("RESOURCES_ID <>", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdGreaterThan(String value) {
            addCriterion("RESOURCES_ID >", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCES_ID >=", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdLessThan(String value) {
            addCriterion("RESOURCES_ID <", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdLessThanOrEqualTo(String value) {
            addCriterion("RESOURCES_ID <=", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdLike(String value) {
            addCriterion("RESOURCES_ID like", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdNotLike(String value) {
            addCriterion("RESOURCES_ID not like", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdIn(List<String> values) {
            addCriterion("RESOURCES_ID in", values, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdNotIn(List<String> values) {
            addCriterion("RESOURCES_ID not in", values, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdBetween(String value1, String value2) {
            addCriterion("RESOURCES_ID between", value1, value2, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdNotBetween(String value1, String value2) {
            addCriterion("RESOURCES_ID not between", value1, value2, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andBlackWhiteIsNull() {
            addCriterion("BLACK_WHITE is null");
            return (Criteria) this;
        }

        public Criteria andBlackWhiteIsNotNull() {
            addCriterion("BLACK_WHITE is not null");
            return (Criteria) this;
        }

        public Criteria andBlackWhiteEqualTo(String value) {
            addCriterion("BLACK_WHITE =", value, "blackWhite");
            return (Criteria) this;
        }

        public Criteria andBlackWhiteNotEqualTo(String value) {
            addCriterion("BLACK_WHITE <>", value, "blackWhite");
            return (Criteria) this;
        }

        public Criteria andBlackWhiteGreaterThan(String value) {
            addCriterion("BLACK_WHITE >", value, "blackWhite");
            return (Criteria) this;
        }

        public Criteria andBlackWhiteGreaterThanOrEqualTo(String value) {
            addCriterion("BLACK_WHITE >=", value, "blackWhite");
            return (Criteria) this;
        }

        public Criteria andBlackWhiteLessThan(String value) {
            addCriterion("BLACK_WHITE <", value, "blackWhite");
            return (Criteria) this;
        }

        public Criteria andBlackWhiteLessThanOrEqualTo(String value) {
            addCriterion("BLACK_WHITE <=", value, "blackWhite");
            return (Criteria) this;
        }

        public Criteria andBlackWhiteLike(String value) {
            addCriterion("BLACK_WHITE like", value, "blackWhite");
            return (Criteria) this;
        }

        public Criteria andBlackWhiteNotLike(String value) {
            addCriterion("BLACK_WHITE not like", value, "blackWhite");
            return (Criteria) this;
        }

        public Criteria andBlackWhiteIn(List<String> values) {
            addCriterion("BLACK_WHITE in", values, "blackWhite");
            return (Criteria) this;
        }

        public Criteria andBlackWhiteNotIn(List<String> values) {
            addCriterion("BLACK_WHITE not in", values, "blackWhite");
            return (Criteria) this;
        }

        public Criteria andBlackWhiteBetween(String value1, String value2) {
            addCriterion("BLACK_WHITE between", value1, value2, "blackWhite");
            return (Criteria) this;
        }

        public Criteria andBlackWhiteNotBetween(String value1, String value2) {
            addCriterion("BLACK_WHITE not between", value1, value2, "blackWhite");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("REMARK1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("REMARK1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("REMARK1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("REMARK1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("REMARK1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("REMARK1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("REMARK1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("REMARK1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("REMARK1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("REMARK1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("REMARK1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("REMARK1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("REMARK1 not between", value1, value2, "remark1");
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