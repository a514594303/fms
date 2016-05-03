package com.ufc.fm.dbio.po;

import java.util.ArrayList;
import java.util.List;

public class FmLoanCollExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmLoanCollExample() {
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

        public Criteria andCollIdIsNull() {
            addCriterion("coll_id is null");
            return (Criteria) this;
        }

        public Criteria andCollIdIsNotNull() {
            addCriterion("coll_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollIdEqualTo(Integer value) {
            addCriterion("coll_id =", value, "collId");
            return (Criteria) this;
        }

        public Criteria andCollIdNotEqualTo(Integer value) {
            addCriterion("coll_id <>", value, "collId");
            return (Criteria) this;
        }

        public Criteria andCollIdGreaterThan(Integer value) {
            addCriterion("coll_id >", value, "collId");
            return (Criteria) this;
        }

        public Criteria andCollIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coll_id >=", value, "collId");
            return (Criteria) this;
        }

        public Criteria andCollIdLessThan(Integer value) {
            addCriterion("coll_id <", value, "collId");
            return (Criteria) this;
        }

        public Criteria andCollIdLessThanOrEqualTo(Integer value) {
            addCriterion("coll_id <=", value, "collId");
            return (Criteria) this;
        }

        public Criteria andCollIdIn(List<Integer> values) {
            addCriterion("coll_id in", values, "collId");
            return (Criteria) this;
        }

        public Criteria andCollIdNotIn(List<Integer> values) {
            addCriterion("coll_id not in", values, "collId");
            return (Criteria) this;
        }

        public Criteria andCollIdBetween(Integer value1, Integer value2) {
            addCriterion("coll_id between", value1, value2, "collId");
            return (Criteria) this;
        }

        public Criteria andCollIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coll_id not between", value1, value2, "collId");
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

        public Criteria andCollTypeIsNull() {
            addCriterion("coll_type is null");
            return (Criteria) this;
        }

        public Criteria andCollTypeIsNotNull() {
            addCriterion("coll_type is not null");
            return (Criteria) this;
        }

        public Criteria andCollTypeEqualTo(String value) {
            addCriterion("coll_type =", value, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeNotEqualTo(String value) {
            addCriterion("coll_type <>", value, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeGreaterThan(String value) {
            addCriterion("coll_type >", value, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeGreaterThanOrEqualTo(String value) {
            addCriterion("coll_type >=", value, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeLessThan(String value) {
            addCriterion("coll_type <", value, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeLessThanOrEqualTo(String value) {
            addCriterion("coll_type <=", value, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeLike(String value) {
            addCriterion("coll_type like", value, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeNotLike(String value) {
            addCriterion("coll_type not like", value, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeIn(List<String> values) {
            addCriterion("coll_type in", values, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeNotIn(List<String> values) {
            addCriterion("coll_type not in", values, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeBetween(String value1, String value2) {
            addCriterion("coll_type between", value1, value2, "collType");
            return (Criteria) this;
        }

        public Criteria andCollTypeNotBetween(String value1, String value2) {
            addCriterion("coll_type not between", value1, value2, "collType");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("owner like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("owner not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andCollValueIsNull() {
            addCriterion("coll_value is null");
            return (Criteria) this;
        }

        public Criteria andCollValueIsNotNull() {
            addCriterion("coll_value is not null");
            return (Criteria) this;
        }

        public Criteria andCollValueEqualTo(String value) {
            addCriterion("coll_value =", value, "collValue");
            return (Criteria) this;
        }

        public Criteria andCollValueNotEqualTo(String value) {
            addCriterion("coll_value <>", value, "collValue");
            return (Criteria) this;
        }

        public Criteria andCollValueGreaterThan(String value) {
            addCriterion("coll_value >", value, "collValue");
            return (Criteria) this;
        }

        public Criteria andCollValueGreaterThanOrEqualTo(String value) {
            addCriterion("coll_value >=", value, "collValue");
            return (Criteria) this;
        }

        public Criteria andCollValueLessThan(String value) {
            addCriterion("coll_value <", value, "collValue");
            return (Criteria) this;
        }

        public Criteria andCollValueLessThanOrEqualTo(String value) {
            addCriterion("coll_value <=", value, "collValue");
            return (Criteria) this;
        }

        public Criteria andCollValueLike(String value) {
            addCriterion("coll_value like", value, "collValue");
            return (Criteria) this;
        }

        public Criteria andCollValueNotLike(String value) {
            addCriterion("coll_value not like", value, "collValue");
            return (Criteria) this;
        }

        public Criteria andCollValueIn(List<String> values) {
            addCriterion("coll_value in", values, "collValue");
            return (Criteria) this;
        }

        public Criteria andCollValueNotIn(List<String> values) {
            addCriterion("coll_value not in", values, "collValue");
            return (Criteria) this;
        }

        public Criteria andCollValueBetween(String value1, String value2) {
            addCriterion("coll_value between", value1, value2, "collValue");
            return (Criteria) this;
        }

        public Criteria andCollValueNotBetween(String value1, String value2) {
            addCriterion("coll_value not between", value1, value2, "collValue");
            return (Criteria) this;
        }

        public Criteria andRealEstateName1IsNull() {
            addCriterion("real_estate_name1 is null");
            return (Criteria) this;
        }

        public Criteria andRealEstateName1IsNotNull() {
            addCriterion("real_estate_name1 is not null");
            return (Criteria) this;
        }

        public Criteria andRealEstateName1EqualTo(String value) {
            addCriterion("real_estate_name1 =", value, "realEstateName1");
            return (Criteria) this;
        }

        public Criteria andRealEstateName1NotEqualTo(String value) {
            addCriterion("real_estate_name1 <>", value, "realEstateName1");
            return (Criteria) this;
        }

        public Criteria andRealEstateName1GreaterThan(String value) {
            addCriterion("real_estate_name1 >", value, "realEstateName1");
            return (Criteria) this;
        }

        public Criteria andRealEstateName1GreaterThanOrEqualTo(String value) {
            addCriterion("real_estate_name1 >=", value, "realEstateName1");
            return (Criteria) this;
        }

        public Criteria andRealEstateName1LessThan(String value) {
            addCriterion("real_estate_name1 <", value, "realEstateName1");
            return (Criteria) this;
        }

        public Criteria andRealEstateName1LessThanOrEqualTo(String value) {
            addCriterion("real_estate_name1 <=", value, "realEstateName1");
            return (Criteria) this;
        }

        public Criteria andRealEstateName1Like(String value) {
            addCriterion("real_estate_name1 like", value, "realEstateName1");
            return (Criteria) this;
        }

        public Criteria andRealEstateName1NotLike(String value) {
            addCriterion("real_estate_name1 not like", value, "realEstateName1");
            return (Criteria) this;
        }

        public Criteria andRealEstateName1In(List<String> values) {
            addCriterion("real_estate_name1 in", values, "realEstateName1");
            return (Criteria) this;
        }

        public Criteria andRealEstateName1NotIn(List<String> values) {
            addCriterion("real_estate_name1 not in", values, "realEstateName1");
            return (Criteria) this;
        }

        public Criteria andRealEstateName1Between(String value1, String value2) {
            addCriterion("real_estate_name1 between", value1, value2, "realEstateName1");
            return (Criteria) this;
        }

        public Criteria andRealEstateName1NotBetween(String value1, String value2) {
            addCriterion("real_estate_name1 not between", value1, value2, "realEstateName1");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr1IsNull() {
            addCriterion("real_estate_addr1 is null");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr1IsNotNull() {
            addCriterion("real_estate_addr1 is not null");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr1EqualTo(String value) {
            addCriterion("real_estate_addr1 =", value, "realEstateAddr1");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr1NotEqualTo(String value) {
            addCriterion("real_estate_addr1 <>", value, "realEstateAddr1");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr1GreaterThan(String value) {
            addCriterion("real_estate_addr1 >", value, "realEstateAddr1");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr1GreaterThanOrEqualTo(String value) {
            addCriterion("real_estate_addr1 >=", value, "realEstateAddr1");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr1LessThan(String value) {
            addCriterion("real_estate_addr1 <", value, "realEstateAddr1");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr1LessThanOrEqualTo(String value) {
            addCriterion("real_estate_addr1 <=", value, "realEstateAddr1");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr1Like(String value) {
            addCriterion("real_estate_addr1 like", value, "realEstateAddr1");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr1NotLike(String value) {
            addCriterion("real_estate_addr1 not like", value, "realEstateAddr1");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr1In(List<String> values) {
            addCriterion("real_estate_addr1 in", values, "realEstateAddr1");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr1NotIn(List<String> values) {
            addCriterion("real_estate_addr1 not in", values, "realEstateAddr1");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr1Between(String value1, String value2) {
            addCriterion("real_estate_addr1 between", value1, value2, "realEstateAddr1");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr1NotBetween(String value1, String value2) {
            addCriterion("real_estate_addr1 not between", value1, value2, "realEstateAddr1");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode1IsNull() {
            addCriterion("real_estate_postcode1 is null");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode1IsNotNull() {
            addCriterion("real_estate_postcode1 is not null");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode1EqualTo(String value) {
            addCriterion("real_estate_postcode1 =", value, "realEstatePostcode1");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode1NotEqualTo(String value) {
            addCriterion("real_estate_postcode1 <>", value, "realEstatePostcode1");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode1GreaterThan(String value) {
            addCriterion("real_estate_postcode1 >", value, "realEstatePostcode1");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode1GreaterThanOrEqualTo(String value) {
            addCriterion("real_estate_postcode1 >=", value, "realEstatePostcode1");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode1LessThan(String value) {
            addCriterion("real_estate_postcode1 <", value, "realEstatePostcode1");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode1LessThanOrEqualTo(String value) {
            addCriterion("real_estate_postcode1 <=", value, "realEstatePostcode1");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode1Like(String value) {
            addCriterion("real_estate_postcode1 like", value, "realEstatePostcode1");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode1NotLike(String value) {
            addCriterion("real_estate_postcode1 not like", value, "realEstatePostcode1");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode1In(List<String> values) {
            addCriterion("real_estate_postcode1 in", values, "realEstatePostcode1");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode1NotIn(List<String> values) {
            addCriterion("real_estate_postcode1 not in", values, "realEstatePostcode1");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode1Between(String value1, String value2) {
            addCriterion("real_estate_postcode1 between", value1, value2, "realEstatePostcode1");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode1NotBetween(String value1, String value2) {
            addCriterion("real_estate_postcode1 not between", value1, value2, "realEstatePostcode1");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea1IsNull() {
            addCriterion("real_estate_area1 is null");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea1IsNotNull() {
            addCriterion("real_estate_area1 is not null");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea1EqualTo(String value) {
            addCriterion("real_estate_area1 =", value, "realEstateArea1");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea1NotEqualTo(String value) {
            addCriterion("real_estate_area1 <>", value, "realEstateArea1");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea1GreaterThan(String value) {
            addCriterion("real_estate_area1 >", value, "realEstateArea1");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea1GreaterThanOrEqualTo(String value) {
            addCriterion("real_estate_area1 >=", value, "realEstateArea1");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea1LessThan(String value) {
            addCriterion("real_estate_area1 <", value, "realEstateArea1");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea1LessThanOrEqualTo(String value) {
            addCriterion("real_estate_area1 <=", value, "realEstateArea1");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea1Like(String value) {
            addCriterion("real_estate_area1 like", value, "realEstateArea1");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea1NotLike(String value) {
            addCriterion("real_estate_area1 not like", value, "realEstateArea1");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea1In(List<String> values) {
            addCriterion("real_estate_area1 in", values, "realEstateArea1");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea1NotIn(List<String> values) {
            addCriterion("real_estate_area1 not in", values, "realEstateArea1");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea1Between(String value1, String value2) {
            addCriterion("real_estate_area1 between", value1, value2, "realEstateArea1");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea1NotBetween(String value1, String value2) {
            addCriterion("real_estate_area1 not between", value1, value2, "realEstateArea1");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum1IsNull() {
            addCriterion("real_estate_num1 is null");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum1IsNotNull() {
            addCriterion("real_estate_num1 is not null");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum1EqualTo(String value) {
            addCriterion("real_estate_num1 =", value, "realEstateNum1");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum1NotEqualTo(String value) {
            addCriterion("real_estate_num1 <>", value, "realEstateNum1");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum1GreaterThan(String value) {
            addCriterion("real_estate_num1 >", value, "realEstateNum1");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum1GreaterThanOrEqualTo(String value) {
            addCriterion("real_estate_num1 >=", value, "realEstateNum1");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum1LessThan(String value) {
            addCriterion("real_estate_num1 <", value, "realEstateNum1");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum1LessThanOrEqualTo(String value) {
            addCriterion("real_estate_num1 <=", value, "realEstateNum1");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum1Like(String value) {
            addCriterion("real_estate_num1 like", value, "realEstateNum1");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum1NotLike(String value) {
            addCriterion("real_estate_num1 not like", value, "realEstateNum1");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum1In(List<String> values) {
            addCriterion("real_estate_num1 in", values, "realEstateNum1");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum1NotIn(List<String> values) {
            addCriterion("real_estate_num1 not in", values, "realEstateNum1");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum1Between(String value1, String value2) {
            addCriterion("real_estate_num1 between", value1, value2, "realEstateNum1");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum1NotBetween(String value1, String value2) {
            addCriterion("real_estate_num1 not between", value1, value2, "realEstateNum1");
            return (Criteria) this;
        }

        public Criteria andRealEstateName2IsNull() {
            addCriterion("real_estate_name2 is null");
            return (Criteria) this;
        }

        public Criteria andRealEstateName2IsNotNull() {
            addCriterion("real_estate_name2 is not null");
            return (Criteria) this;
        }

        public Criteria andRealEstateName2EqualTo(String value) {
            addCriterion("real_estate_name2 =", value, "realEstateName2");
            return (Criteria) this;
        }

        public Criteria andRealEstateName2NotEqualTo(String value) {
            addCriterion("real_estate_name2 <>", value, "realEstateName2");
            return (Criteria) this;
        }

        public Criteria andRealEstateName2GreaterThan(String value) {
            addCriterion("real_estate_name2 >", value, "realEstateName2");
            return (Criteria) this;
        }

        public Criteria andRealEstateName2GreaterThanOrEqualTo(String value) {
            addCriterion("real_estate_name2 >=", value, "realEstateName2");
            return (Criteria) this;
        }

        public Criteria andRealEstateName2LessThan(String value) {
            addCriterion("real_estate_name2 <", value, "realEstateName2");
            return (Criteria) this;
        }

        public Criteria andRealEstateName2LessThanOrEqualTo(String value) {
            addCriterion("real_estate_name2 <=", value, "realEstateName2");
            return (Criteria) this;
        }

        public Criteria andRealEstateName2Like(String value) {
            addCriterion("real_estate_name2 like", value, "realEstateName2");
            return (Criteria) this;
        }

        public Criteria andRealEstateName2NotLike(String value) {
            addCriterion("real_estate_name2 not like", value, "realEstateName2");
            return (Criteria) this;
        }

        public Criteria andRealEstateName2In(List<String> values) {
            addCriterion("real_estate_name2 in", values, "realEstateName2");
            return (Criteria) this;
        }

        public Criteria andRealEstateName2NotIn(List<String> values) {
            addCriterion("real_estate_name2 not in", values, "realEstateName2");
            return (Criteria) this;
        }

        public Criteria andRealEstateName2Between(String value1, String value2) {
            addCriterion("real_estate_name2 between", value1, value2, "realEstateName2");
            return (Criteria) this;
        }

        public Criteria andRealEstateName2NotBetween(String value1, String value2) {
            addCriterion("real_estate_name2 not between", value1, value2, "realEstateName2");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr2IsNull() {
            addCriterion("real_estate_addr2 is null");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr2IsNotNull() {
            addCriterion("real_estate_addr2 is not null");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr2EqualTo(String value) {
            addCriterion("real_estate_addr2 =", value, "realEstateAddr2");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr2NotEqualTo(String value) {
            addCriterion("real_estate_addr2 <>", value, "realEstateAddr2");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr2GreaterThan(String value) {
            addCriterion("real_estate_addr2 >", value, "realEstateAddr2");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr2GreaterThanOrEqualTo(String value) {
            addCriterion("real_estate_addr2 >=", value, "realEstateAddr2");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr2LessThan(String value) {
            addCriterion("real_estate_addr2 <", value, "realEstateAddr2");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr2LessThanOrEqualTo(String value) {
            addCriterion("real_estate_addr2 <=", value, "realEstateAddr2");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr2Like(String value) {
            addCriterion("real_estate_addr2 like", value, "realEstateAddr2");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr2NotLike(String value) {
            addCriterion("real_estate_addr2 not like", value, "realEstateAddr2");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr2In(List<String> values) {
            addCriterion("real_estate_addr2 in", values, "realEstateAddr2");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr2NotIn(List<String> values) {
            addCriterion("real_estate_addr2 not in", values, "realEstateAddr2");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr2Between(String value1, String value2) {
            addCriterion("real_estate_addr2 between", value1, value2, "realEstateAddr2");
            return (Criteria) this;
        }

        public Criteria andRealEstateAddr2NotBetween(String value1, String value2) {
            addCriterion("real_estate_addr2 not between", value1, value2, "realEstateAddr2");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode2IsNull() {
            addCriterion("real_estate_postcode2 is null");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode2IsNotNull() {
            addCriterion("real_estate_postcode2 is not null");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode2EqualTo(String value) {
            addCriterion("real_estate_postcode2 =", value, "realEstatePostcode2");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode2NotEqualTo(String value) {
            addCriterion("real_estate_postcode2 <>", value, "realEstatePostcode2");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode2GreaterThan(String value) {
            addCriterion("real_estate_postcode2 >", value, "realEstatePostcode2");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode2GreaterThanOrEqualTo(String value) {
            addCriterion("real_estate_postcode2 >=", value, "realEstatePostcode2");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode2LessThan(String value) {
            addCriterion("real_estate_postcode2 <", value, "realEstatePostcode2");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode2LessThanOrEqualTo(String value) {
            addCriterion("real_estate_postcode2 <=", value, "realEstatePostcode2");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode2Like(String value) {
            addCriterion("real_estate_postcode2 like", value, "realEstatePostcode2");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode2NotLike(String value) {
            addCriterion("real_estate_postcode2 not like", value, "realEstatePostcode2");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode2In(List<String> values) {
            addCriterion("real_estate_postcode2 in", values, "realEstatePostcode2");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode2NotIn(List<String> values) {
            addCriterion("real_estate_postcode2 not in", values, "realEstatePostcode2");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode2Between(String value1, String value2) {
            addCriterion("real_estate_postcode2 between", value1, value2, "realEstatePostcode2");
            return (Criteria) this;
        }

        public Criteria andRealEstatePostcode2NotBetween(String value1, String value2) {
            addCriterion("real_estate_postcode2 not between", value1, value2, "realEstatePostcode2");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea2IsNull() {
            addCriterion("real_estate_area2 is null");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea2IsNotNull() {
            addCriterion("real_estate_area2 is not null");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea2EqualTo(String value) {
            addCriterion("real_estate_area2 =", value, "realEstateArea2");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea2NotEqualTo(String value) {
            addCriterion("real_estate_area2 <>", value, "realEstateArea2");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea2GreaterThan(String value) {
            addCriterion("real_estate_area2 >", value, "realEstateArea2");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea2GreaterThanOrEqualTo(String value) {
            addCriterion("real_estate_area2 >=", value, "realEstateArea2");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea2LessThan(String value) {
            addCriterion("real_estate_area2 <", value, "realEstateArea2");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea2LessThanOrEqualTo(String value) {
            addCriterion("real_estate_area2 <=", value, "realEstateArea2");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea2Like(String value) {
            addCriterion("real_estate_area2 like", value, "realEstateArea2");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea2NotLike(String value) {
            addCriterion("real_estate_area2 not like", value, "realEstateArea2");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea2In(List<String> values) {
            addCriterion("real_estate_area2 in", values, "realEstateArea2");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea2NotIn(List<String> values) {
            addCriterion("real_estate_area2 not in", values, "realEstateArea2");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea2Between(String value1, String value2) {
            addCriterion("real_estate_area2 between", value1, value2, "realEstateArea2");
            return (Criteria) this;
        }

        public Criteria andRealEstateArea2NotBetween(String value1, String value2) {
            addCriterion("real_estate_area2 not between", value1, value2, "realEstateArea2");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum2IsNull() {
            addCriterion("real_estate_num2 is null");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum2IsNotNull() {
            addCriterion("real_estate_num2 is not null");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum2EqualTo(String value) {
            addCriterion("real_estate_num2 =", value, "realEstateNum2");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum2NotEqualTo(String value) {
            addCriterion("real_estate_num2 <>", value, "realEstateNum2");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum2GreaterThan(String value) {
            addCriterion("real_estate_num2 >", value, "realEstateNum2");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum2GreaterThanOrEqualTo(String value) {
            addCriterion("real_estate_num2 >=", value, "realEstateNum2");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum2LessThan(String value) {
            addCriterion("real_estate_num2 <", value, "realEstateNum2");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum2LessThanOrEqualTo(String value) {
            addCriterion("real_estate_num2 <=", value, "realEstateNum2");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum2Like(String value) {
            addCriterion("real_estate_num2 like", value, "realEstateNum2");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum2NotLike(String value) {
            addCriterion("real_estate_num2 not like", value, "realEstateNum2");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum2In(List<String> values) {
            addCriterion("real_estate_num2 in", values, "realEstateNum2");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum2NotIn(List<String> values) {
            addCriterion("real_estate_num2 not in", values, "realEstateNum2");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum2Between(String value1, String value2) {
            addCriterion("real_estate_num2 between", value1, value2, "realEstateNum2");
            return (Criteria) this;
        }

        public Criteria andRealEstateNum2NotBetween(String value1, String value2) {
            addCriterion("real_estate_num2 not between", value1, value2, "realEstateNum2");
            return (Criteria) this;
        }

        public Criteria andCarBrandIsNull() {
            addCriterion("car_brand is null");
            return (Criteria) this;
        }

        public Criteria andCarBrandIsNotNull() {
            addCriterion("car_brand is not null");
            return (Criteria) this;
        }

        public Criteria andCarBrandEqualTo(String value) {
            addCriterion("car_brand =", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotEqualTo(String value) {
            addCriterion("car_brand <>", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandGreaterThan(String value) {
            addCriterion("car_brand >", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandGreaterThanOrEqualTo(String value) {
            addCriterion("car_brand >=", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLessThan(String value) {
            addCriterion("car_brand <", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLessThanOrEqualTo(String value) {
            addCriterion("car_brand <=", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLike(String value) {
            addCriterion("car_brand like", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotLike(String value) {
            addCriterion("car_brand not like", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandIn(List<String> values) {
            addCriterion("car_brand in", values, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotIn(List<String> values) {
            addCriterion("car_brand not in", values, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandBetween(String value1, String value2) {
            addCriterion("car_brand between", value1, value2, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotBetween(String value1, String value2) {
            addCriterion("car_brand not between", value1, value2, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarModelIsNull() {
            addCriterion("car_model is null");
            return (Criteria) this;
        }

        public Criteria andCarModelIsNotNull() {
            addCriterion("car_model is not null");
            return (Criteria) this;
        }

        public Criteria andCarModelEqualTo(String value) {
            addCriterion("car_model =", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotEqualTo(String value) {
            addCriterion("car_model <>", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelGreaterThan(String value) {
            addCriterion("car_model >", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelGreaterThanOrEqualTo(String value) {
            addCriterion("car_model >=", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelLessThan(String value) {
            addCriterion("car_model <", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelLessThanOrEqualTo(String value) {
            addCriterion("car_model <=", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelLike(String value) {
            addCriterion("car_model like", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotLike(String value) {
            addCriterion("car_model not like", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelIn(List<String> values) {
            addCriterion("car_model in", values, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotIn(List<String> values) {
            addCriterion("car_model not in", values, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelBetween(String value1, String value2) {
            addCriterion("car_model between", value1, value2, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotBetween(String value1, String value2) {
            addCriterion("car_model not between", value1, value2, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarPriceIsNull() {
            addCriterion("car_price is null");
            return (Criteria) this;
        }

        public Criteria andCarPriceIsNotNull() {
            addCriterion("car_price is not null");
            return (Criteria) this;
        }

        public Criteria andCarPriceEqualTo(String value) {
            addCriterion("car_price =", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotEqualTo(String value) {
            addCriterion("car_price <>", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceGreaterThan(String value) {
            addCriterion("car_price >", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceGreaterThanOrEqualTo(String value) {
            addCriterion("car_price >=", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceLessThan(String value) {
            addCriterion("car_price <", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceLessThanOrEqualTo(String value) {
            addCriterion("car_price <=", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceLike(String value) {
            addCriterion("car_price like", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotLike(String value) {
            addCriterion("car_price not like", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceIn(List<String> values) {
            addCriterion("car_price in", values, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotIn(List<String> values) {
            addCriterion("car_price not in", values, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceBetween(String value1, String value2) {
            addCriterion("car_price between", value1, value2, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotBetween(String value1, String value2) {
            addCriterion("car_price not between", value1, value2, "carPrice");
            return (Criteria) this;
        }

        public Criteria andEngNumIsNull() {
            addCriterion("eng_num is null");
            return (Criteria) this;
        }

        public Criteria andEngNumIsNotNull() {
            addCriterion("eng_num is not null");
            return (Criteria) this;
        }

        public Criteria andEngNumEqualTo(String value) {
            addCriterion("eng_num =", value, "engNum");
            return (Criteria) this;
        }

        public Criteria andEngNumNotEqualTo(String value) {
            addCriterion("eng_num <>", value, "engNum");
            return (Criteria) this;
        }

        public Criteria andEngNumGreaterThan(String value) {
            addCriterion("eng_num >", value, "engNum");
            return (Criteria) this;
        }

        public Criteria andEngNumGreaterThanOrEqualTo(String value) {
            addCriterion("eng_num >=", value, "engNum");
            return (Criteria) this;
        }

        public Criteria andEngNumLessThan(String value) {
            addCriterion("eng_num <", value, "engNum");
            return (Criteria) this;
        }

        public Criteria andEngNumLessThanOrEqualTo(String value) {
            addCriterion("eng_num <=", value, "engNum");
            return (Criteria) this;
        }

        public Criteria andEngNumLike(String value) {
            addCriterion("eng_num like", value, "engNum");
            return (Criteria) this;
        }

        public Criteria andEngNumNotLike(String value) {
            addCriterion("eng_num not like", value, "engNum");
            return (Criteria) this;
        }

        public Criteria andEngNumIn(List<String> values) {
            addCriterion("eng_num in", values, "engNum");
            return (Criteria) this;
        }

        public Criteria andEngNumNotIn(List<String> values) {
            addCriterion("eng_num not in", values, "engNum");
            return (Criteria) this;
        }

        public Criteria andEngNumBetween(String value1, String value2) {
            addCriterion("eng_num between", value1, value2, "engNum");
            return (Criteria) this;
        }

        public Criteria andEngNumNotBetween(String value1, String value2) {
            addCriterion("eng_num not between", value1, value2, "engNum");
            return (Criteria) this;
        }

        public Criteria andDrivLicNumIsNull() {
            addCriterion("driv_lic_num is null");
            return (Criteria) this;
        }

        public Criteria andDrivLicNumIsNotNull() {
            addCriterion("driv_lic_num is not null");
            return (Criteria) this;
        }

        public Criteria andDrivLicNumEqualTo(String value) {
            addCriterion("driv_lic_num =", value, "drivLicNum");
            return (Criteria) this;
        }

        public Criteria andDrivLicNumNotEqualTo(String value) {
            addCriterion("driv_lic_num <>", value, "drivLicNum");
            return (Criteria) this;
        }

        public Criteria andDrivLicNumGreaterThan(String value) {
            addCriterion("driv_lic_num >", value, "drivLicNum");
            return (Criteria) this;
        }

        public Criteria andDrivLicNumGreaterThanOrEqualTo(String value) {
            addCriterion("driv_lic_num >=", value, "drivLicNum");
            return (Criteria) this;
        }

        public Criteria andDrivLicNumLessThan(String value) {
            addCriterion("driv_lic_num <", value, "drivLicNum");
            return (Criteria) this;
        }

        public Criteria andDrivLicNumLessThanOrEqualTo(String value) {
            addCriterion("driv_lic_num <=", value, "drivLicNum");
            return (Criteria) this;
        }

        public Criteria andDrivLicNumLike(String value) {
            addCriterion("driv_lic_num like", value, "drivLicNum");
            return (Criteria) this;
        }

        public Criteria andDrivLicNumNotLike(String value) {
            addCriterion("driv_lic_num not like", value, "drivLicNum");
            return (Criteria) this;
        }

        public Criteria andDrivLicNumIn(List<String> values) {
            addCriterion("driv_lic_num in", values, "drivLicNum");
            return (Criteria) this;
        }

        public Criteria andDrivLicNumNotIn(List<String> values) {
            addCriterion("driv_lic_num not in", values, "drivLicNum");
            return (Criteria) this;
        }

        public Criteria andDrivLicNumBetween(String value1, String value2) {
            addCriterion("driv_lic_num between", value1, value2, "drivLicNum");
            return (Criteria) this;
        }

        public Criteria andDrivLicNumNotBetween(String value1, String value2) {
            addCriterion("driv_lic_num not between", value1, value2, "drivLicNum");
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