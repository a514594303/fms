package com.ufc.fm.dbio.po;

import java.util.ArrayList;
import java.util.List;

public class FmLoanApplicationCarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmLoanApplicationCarExample() {
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

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Integer value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Integer value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Integer value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Integer value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Integer> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Integer> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Integer value1, Integer value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_id not between", value1, value2, "carId");
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

        public Criteria andDealerNameIsNull() {
            addCriterion("dealer_name is null");
            return (Criteria) this;
        }

        public Criteria andDealerNameIsNotNull() {
            addCriterion("dealer_name is not null");
            return (Criteria) this;
        }

        public Criteria andDealerNameEqualTo(String value) {
            addCriterion("dealer_name =", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotEqualTo(String value) {
            addCriterion("dealer_name <>", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThan(String value) {
            addCriterion("dealer_name >", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_name >=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThan(String value) {
            addCriterion("dealer_name <", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThanOrEqualTo(String value) {
            addCriterion("dealer_name <=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLike(String value) {
            addCriterion("dealer_name like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotLike(String value) {
            addCriterion("dealer_name not like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameIn(List<String> values) {
            addCriterion("dealer_name in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotIn(List<String> values) {
            addCriterion("dealer_name not in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameBetween(String value1, String value2) {
            addCriterion("dealer_name between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotBetween(String value1, String value2) {
            addCriterion("dealer_name not between", value1, value2, "dealerName");
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

        public Criteria andVehBrandIsNull() {
            addCriterion("veh_brand is null");
            return (Criteria) this;
        }

        public Criteria andVehBrandIsNotNull() {
            addCriterion("veh_brand is not null");
            return (Criteria) this;
        }

        public Criteria andVehBrandEqualTo(String value) {
            addCriterion("veh_brand =", value, "vehBrand");
            return (Criteria) this;
        }

        public Criteria andVehBrandNotEqualTo(String value) {
            addCriterion("veh_brand <>", value, "vehBrand");
            return (Criteria) this;
        }

        public Criteria andVehBrandGreaterThan(String value) {
            addCriterion("veh_brand >", value, "vehBrand");
            return (Criteria) this;
        }

        public Criteria andVehBrandGreaterThanOrEqualTo(String value) {
            addCriterion("veh_brand >=", value, "vehBrand");
            return (Criteria) this;
        }

        public Criteria andVehBrandLessThan(String value) {
            addCriterion("veh_brand <", value, "vehBrand");
            return (Criteria) this;
        }

        public Criteria andVehBrandLessThanOrEqualTo(String value) {
            addCriterion("veh_brand <=", value, "vehBrand");
            return (Criteria) this;
        }

        public Criteria andVehBrandLike(String value) {
            addCriterion("veh_brand like", value, "vehBrand");
            return (Criteria) this;
        }

        public Criteria andVehBrandNotLike(String value) {
            addCriterion("veh_brand not like", value, "vehBrand");
            return (Criteria) this;
        }

        public Criteria andVehBrandIn(List<String> values) {
            addCriterion("veh_brand in", values, "vehBrand");
            return (Criteria) this;
        }

        public Criteria andVehBrandNotIn(List<String> values) {
            addCriterion("veh_brand not in", values, "vehBrand");
            return (Criteria) this;
        }

        public Criteria andVehBrandBetween(String value1, String value2) {
            addCriterion("veh_brand between", value1, value2, "vehBrand");
            return (Criteria) this;
        }

        public Criteria andVehBrandNotBetween(String value1, String value2) {
            addCriterion("veh_brand not between", value1, value2, "vehBrand");
            return (Criteria) this;
        }

        public Criteria andVehModelIsNull() {
            addCriterion("veh_model is null");
            return (Criteria) this;
        }

        public Criteria andVehModelIsNotNull() {
            addCriterion("veh_model is not null");
            return (Criteria) this;
        }

        public Criteria andVehModelEqualTo(String value) {
            addCriterion("veh_model =", value, "vehModel");
            return (Criteria) this;
        }

        public Criteria andVehModelNotEqualTo(String value) {
            addCriterion("veh_model <>", value, "vehModel");
            return (Criteria) this;
        }

        public Criteria andVehModelGreaterThan(String value) {
            addCriterion("veh_model >", value, "vehModel");
            return (Criteria) this;
        }

        public Criteria andVehModelGreaterThanOrEqualTo(String value) {
            addCriterion("veh_model >=", value, "vehModel");
            return (Criteria) this;
        }

        public Criteria andVehModelLessThan(String value) {
            addCriterion("veh_model <", value, "vehModel");
            return (Criteria) this;
        }

        public Criteria andVehModelLessThanOrEqualTo(String value) {
            addCriterion("veh_model <=", value, "vehModel");
            return (Criteria) this;
        }

        public Criteria andVehModelLike(String value) {
            addCriterion("veh_model like", value, "vehModel");
            return (Criteria) this;
        }

        public Criteria andVehModelNotLike(String value) {
            addCriterion("veh_model not like", value, "vehModel");
            return (Criteria) this;
        }

        public Criteria andVehModelIn(List<String> values) {
            addCriterion("veh_model in", values, "vehModel");
            return (Criteria) this;
        }

        public Criteria andVehModelNotIn(List<String> values) {
            addCriterion("veh_model not in", values, "vehModel");
            return (Criteria) this;
        }

        public Criteria andVehModelBetween(String value1, String value2) {
            addCriterion("veh_model between", value1, value2, "vehModel");
            return (Criteria) this;
        }

        public Criteria andVehModelNotBetween(String value1, String value2) {
            addCriterion("veh_model not between", value1, value2, "vehModel");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPurDateIsNull() {
            addCriterion("pur_date is null");
            return (Criteria) this;
        }

        public Criteria andPurDateIsNotNull() {
            addCriterion("pur_date is not null");
            return (Criteria) this;
        }

        public Criteria andPurDateEqualTo(String value) {
            addCriterion("pur_date =", value, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateNotEqualTo(String value) {
            addCriterion("pur_date <>", value, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateGreaterThan(String value) {
            addCriterion("pur_date >", value, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateGreaterThanOrEqualTo(String value) {
            addCriterion("pur_date >=", value, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateLessThan(String value) {
            addCriterion("pur_date <", value, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateLessThanOrEqualTo(String value) {
            addCriterion("pur_date <=", value, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateLike(String value) {
            addCriterion("pur_date like", value, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateNotLike(String value) {
            addCriterion("pur_date not like", value, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateIn(List<String> values) {
            addCriterion("pur_date in", values, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateNotIn(List<String> values) {
            addCriterion("pur_date not in", values, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateBetween(String value1, String value2) {
            addCriterion("pur_date between", value1, value2, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateNotBetween(String value1, String value2) {
            addCriterion("pur_date not between", value1, value2, "purDate");
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