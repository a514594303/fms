package com.ufc.fm.dbio.po;

import java.util.ArrayList;
import java.util.List;

public class FmCustExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmCustExample() {
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

        public Criteria andCustTypeIsNull() {
            addCriterion("CUST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustTypeIsNotNull() {
            addCriterion("CUST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustTypeEqualTo(String value) {
            addCriterion("CUST_TYPE =", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeNotEqualTo(String value) {
            addCriterion("CUST_TYPE <>", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeGreaterThan(String value) {
            addCriterion("CUST_TYPE >", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_TYPE >=", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeLessThan(String value) {
            addCriterion("CUST_TYPE <", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeLessThanOrEqualTo(String value) {
            addCriterion("CUST_TYPE <=", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeLike(String value) {
            addCriterion("CUST_TYPE like", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeNotLike(String value) {
            addCriterion("CUST_TYPE not like", value, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeIn(List<String> values) {
            addCriterion("CUST_TYPE in", values, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeNotIn(List<String> values) {
            addCriterion("CUST_TYPE not in", values, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeBetween(String value1, String value2) {
            addCriterion("CUST_TYPE between", value1, value2, "custType");
            return (Criteria) this;
        }

        public Criteria andCustTypeNotBetween(String value1, String value2) {
            addCriterion("CUST_TYPE not between", value1, value2, "custType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeIsNull() {
            addCriterion("IDENTITY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeIsNotNull() {
            addCriterion("IDENTITY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeEqualTo(String value) {
            addCriterion("IDENTITY_TYPE =", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotEqualTo(String value) {
            addCriterion("IDENTITY_TYPE <>", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeGreaterThan(String value) {
            addCriterion("IDENTITY_TYPE >", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTITY_TYPE >=", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeLessThan(String value) {
            addCriterion("IDENTITY_TYPE <", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeLessThanOrEqualTo(String value) {
            addCriterion("IDENTITY_TYPE <=", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeLike(String value) {
            addCriterion("IDENTITY_TYPE like", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotLike(String value) {
            addCriterion("IDENTITY_TYPE not like", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeIn(List<String> values) {
            addCriterion("IDENTITY_TYPE in", values, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotIn(List<String> values) {
            addCriterion("IDENTITY_TYPE not in", values, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeBetween(String value1, String value2) {
            addCriterion("IDENTITY_TYPE between", value1, value2, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotBetween(String value1, String value2) {
            addCriterion("IDENTITY_TYPE not between", value1, value2, "identityType");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("CREATE_DATE like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("CREATE_DATE not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andIdentityCardIsNull() {
            addCriterion("IDENTITY_CARD is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardIsNotNull() {
            addCriterion("IDENTITY_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEqualTo(String value) {
            addCriterion("IDENTITY_CARD =", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotEqualTo(String value) {
            addCriterion("IDENTITY_CARD <>", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardGreaterThan(String value) {
            addCriterion("IDENTITY_CARD >", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTITY_CARD >=", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardLessThan(String value) {
            addCriterion("IDENTITY_CARD <", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardLessThanOrEqualTo(String value) {
            addCriterion("IDENTITY_CARD <=", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardLike(String value) {
            addCriterion("IDENTITY_CARD like", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotLike(String value) {
            addCriterion("IDENTITY_CARD not like", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardIn(List<String> values) {
            addCriterion("IDENTITY_CARD in", values, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotIn(List<String> values) {
            addCriterion("IDENTITY_CARD not in", values, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBetween(String value1, String value2) {
            addCriterion("IDENTITY_CARD between", value1, value2, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotBetween(String value1, String value2) {
            addCriterion("IDENTITY_CARD not between", value1, value2, "identityCard");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNull() {
            addCriterion("EXPIRY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNotNull() {
            addCriterion("EXPIRY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEqualTo(String value) {
            addCriterion("EXPIRY_DATE =", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotEqualTo(String value) {
            addCriterion("EXPIRY_DATE <>", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThan(String value) {
            addCriterion("EXPIRY_DATE >", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThanOrEqualTo(String value) {
            addCriterion("EXPIRY_DATE >=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThan(String value) {
            addCriterion("EXPIRY_DATE <", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThanOrEqualTo(String value) {
            addCriterion("EXPIRY_DATE <=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLike(String value) {
            addCriterion("EXPIRY_DATE like", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotLike(String value) {
            addCriterion("EXPIRY_DATE not like", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIn(List<String> values) {
            addCriterion("EXPIRY_DATE in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotIn(List<String> values) {
            addCriterion("EXPIRY_DATE not in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateBetween(String value1, String value2) {
            addCriterion("EXPIRY_DATE between", value1, value2, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotBetween(String value1, String value2) {
            addCriterion("EXPIRY_DATE not between", value1, value2, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameSpellIsNull() {
            addCriterion("NAME_SPELL is null");
            return (Criteria) this;
        }

        public Criteria andNameSpellIsNotNull() {
            addCriterion("NAME_SPELL is not null");
            return (Criteria) this;
        }

        public Criteria andNameSpellEqualTo(String value) {
            addCriterion("NAME_SPELL =", value, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellNotEqualTo(String value) {
            addCriterion("NAME_SPELL <>", value, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellGreaterThan(String value) {
            addCriterion("NAME_SPELL >", value, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_SPELL >=", value, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellLessThan(String value) {
            addCriterion("NAME_SPELL <", value, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellLessThanOrEqualTo(String value) {
            addCriterion("NAME_SPELL <=", value, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellLike(String value) {
            addCriterion("NAME_SPELL like", value, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellNotLike(String value) {
            addCriterion("NAME_SPELL not like", value, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellIn(List<String> values) {
            addCriterion("NAME_SPELL in", values, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellNotIn(List<String> values) {
            addCriterion("NAME_SPELL not in", values, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellBetween(String value1, String value2) {
            addCriterion("NAME_SPELL between", value1, value2, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellNotBetween(String value1, String value2) {
            addCriterion("NAME_SPELL not between", value1, value2, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("BIRTHDAY like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("BIRTHDAY not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNull() {
            addCriterion("OCCUPATION is null");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNotNull() {
            addCriterion("OCCUPATION is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationEqualTo(String value) {
            addCriterion("OCCUPATION =", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotEqualTo(String value) {
            addCriterion("OCCUPATION <>", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThan(String value) {
            addCriterion("OCCUPATION >", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThanOrEqualTo(String value) {
            addCriterion("OCCUPATION >=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThan(String value) {
            addCriterion("OCCUPATION <", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThanOrEqualTo(String value) {
            addCriterion("OCCUPATION <=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLike(String value) {
            addCriterion("OCCUPATION like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotLike(String value) {
            addCriterion("OCCUPATION not like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationIn(List<String> values) {
            addCriterion("OCCUPATION in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotIn(List<String> values) {
            addCriterion("OCCUPATION not in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationBetween(String value1, String value2) {
            addCriterion("OCCUPATION between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotBetween(String value1, String value2) {
            addCriterion("OCCUPATION not between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("MOBILE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("MOBILE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("MOBILE_PHONE =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("MOBILE_PHONE <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("MOBILE_PHONE >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("MOBILE_PHONE <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("MOBILE_PHONE like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("MOBILE_PHONE not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("MOBILE_PHONE in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("MOBILE_PHONE not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andHgstDegreeIsNull() {
            addCriterion("HGST_DEGREE is null");
            return (Criteria) this;
        }

        public Criteria andHgstDegreeIsNotNull() {
            addCriterion("HGST_DEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andHgstDegreeEqualTo(String value) {
            addCriterion("HGST_DEGREE =", value, "hgstDegree");
            return (Criteria) this;
        }

        public Criteria andHgstDegreeNotEqualTo(String value) {
            addCriterion("HGST_DEGREE <>", value, "hgstDegree");
            return (Criteria) this;
        }

        public Criteria andHgstDegreeGreaterThan(String value) {
            addCriterion("HGST_DEGREE >", value, "hgstDegree");
            return (Criteria) this;
        }

        public Criteria andHgstDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("HGST_DEGREE >=", value, "hgstDegree");
            return (Criteria) this;
        }

        public Criteria andHgstDegreeLessThan(String value) {
            addCriterion("HGST_DEGREE <", value, "hgstDegree");
            return (Criteria) this;
        }

        public Criteria andHgstDegreeLessThanOrEqualTo(String value) {
            addCriterion("HGST_DEGREE <=", value, "hgstDegree");
            return (Criteria) this;
        }

        public Criteria andHgstDegreeLike(String value) {
            addCriterion("HGST_DEGREE like", value, "hgstDegree");
            return (Criteria) this;
        }

        public Criteria andHgstDegreeNotLike(String value) {
            addCriterion("HGST_DEGREE not like", value, "hgstDegree");
            return (Criteria) this;
        }

        public Criteria andHgstDegreeIn(List<String> values) {
            addCriterion("HGST_DEGREE in", values, "hgstDegree");
            return (Criteria) this;
        }

        public Criteria andHgstDegreeNotIn(List<String> values) {
            addCriterion("HGST_DEGREE not in", values, "hgstDegree");
            return (Criteria) this;
        }

        public Criteria andHgstDegreeBetween(String value1, String value2) {
            addCriterion("HGST_DEGREE between", value1, value2, "hgstDegree");
            return (Criteria) this;
        }

        public Criteria andHgstDegreeNotBetween(String value1, String value2) {
            addCriterion("HGST_DEGREE not between", value1, value2, "hgstDegree");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("MARITAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("MARITAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(String value) {
            addCriterion("MARITAL_STATUS =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(String value) {
            addCriterion("MARITAL_STATUS <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(String value) {
            addCriterion("MARITAL_STATUS >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MARITAL_STATUS >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(String value) {
            addCriterion("MARITAL_STATUS <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(String value) {
            addCriterion("MARITAL_STATUS <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLike(String value) {
            addCriterion("MARITAL_STATUS like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotLike(String value) {
            addCriterion("MARITAL_STATUS not like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<String> values) {
            addCriterion("MARITAL_STATUS in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<String> values) {
            addCriterion("MARITAL_STATUS not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(String value1, String value2) {
            addCriterion("MARITAL_STATUS between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(String value1, String value2) {
            addCriterion("MARITAL_STATUS not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andSupportNumIsNull() {
            addCriterion("SUPPORT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSupportNumIsNotNull() {
            addCriterion("SUPPORT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSupportNumEqualTo(String value) {
            addCriterion("SUPPORT_NUM =", value, "supportNum");
            return (Criteria) this;
        }

        public Criteria andSupportNumNotEqualTo(String value) {
            addCriterion("SUPPORT_NUM <>", value, "supportNum");
            return (Criteria) this;
        }

        public Criteria andSupportNumGreaterThan(String value) {
            addCriterion("SUPPORT_NUM >", value, "supportNum");
            return (Criteria) this;
        }

        public Criteria andSupportNumGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPORT_NUM >=", value, "supportNum");
            return (Criteria) this;
        }

        public Criteria andSupportNumLessThan(String value) {
            addCriterion("SUPPORT_NUM <", value, "supportNum");
            return (Criteria) this;
        }

        public Criteria andSupportNumLessThanOrEqualTo(String value) {
            addCriterion("SUPPORT_NUM <=", value, "supportNum");
            return (Criteria) this;
        }

        public Criteria andSupportNumLike(String value) {
            addCriterion("SUPPORT_NUM like", value, "supportNum");
            return (Criteria) this;
        }

        public Criteria andSupportNumNotLike(String value) {
            addCriterion("SUPPORT_NUM not like", value, "supportNum");
            return (Criteria) this;
        }

        public Criteria andSupportNumIn(List<String> values) {
            addCriterion("SUPPORT_NUM in", values, "supportNum");
            return (Criteria) this;
        }

        public Criteria andSupportNumNotIn(List<String> values) {
            addCriterion("SUPPORT_NUM not in", values, "supportNum");
            return (Criteria) this;
        }

        public Criteria andSupportNumBetween(String value1, String value2) {
            addCriterion("SUPPORT_NUM between", value1, value2, "supportNum");
            return (Criteria) this;
        }

        public Criteria andSupportNumNotBetween(String value1, String value2) {
            addCriterion("SUPPORT_NUM not between", value1, value2, "supportNum");
            return (Criteria) this;
        }

        public Criteria andAnnualSalaryIsNull() {
            addCriterion("ANNUAL_SALARY is null");
            return (Criteria) this;
        }

        public Criteria andAnnualSalaryIsNotNull() {
            addCriterion("ANNUAL_SALARY is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualSalaryEqualTo(String value) {
            addCriterion("ANNUAL_SALARY =", value, "annualSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualSalaryNotEqualTo(String value) {
            addCriterion("ANNUAL_SALARY <>", value, "annualSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualSalaryGreaterThan(String value) {
            addCriterion("ANNUAL_SALARY >", value, "annualSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("ANNUAL_SALARY >=", value, "annualSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualSalaryLessThan(String value) {
            addCriterion("ANNUAL_SALARY <", value, "annualSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualSalaryLessThanOrEqualTo(String value) {
            addCriterion("ANNUAL_SALARY <=", value, "annualSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualSalaryLike(String value) {
            addCriterion("ANNUAL_SALARY like", value, "annualSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualSalaryNotLike(String value) {
            addCriterion("ANNUAL_SALARY not like", value, "annualSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualSalaryIn(List<String> values) {
            addCriterion("ANNUAL_SALARY in", values, "annualSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualSalaryNotIn(List<String> values) {
            addCriterion("ANNUAL_SALARY not in", values, "annualSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualSalaryBetween(String value1, String value2) {
            addCriterion("ANNUAL_SALARY between", value1, value2, "annualSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualSalaryNotBetween(String value1, String value2) {
            addCriterion("ANNUAL_SALARY not between", value1, value2, "annualSalary");
            return (Criteria) this;
        }

        public Criteria andHomeAddrIsNull() {
            addCriterion("HOME_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddrIsNotNull() {
            addCriterion("HOME_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddrEqualTo(String value) {
            addCriterion("HOME_ADDR =", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrNotEqualTo(String value) {
            addCriterion("HOME_ADDR <>", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrGreaterThan(String value) {
            addCriterion("HOME_ADDR >", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_ADDR >=", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrLessThan(String value) {
            addCriterion("HOME_ADDR <", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrLessThanOrEqualTo(String value) {
            addCriterion("HOME_ADDR <=", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrLike(String value) {
            addCriterion("HOME_ADDR like", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrNotLike(String value) {
            addCriterion("HOME_ADDR not like", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrIn(List<String> values) {
            addCriterion("HOME_ADDR in", values, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrNotIn(List<String> values) {
            addCriterion("HOME_ADDR not in", values, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrBetween(String value1, String value2) {
            addCriterion("HOME_ADDR between", value1, value2, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrNotBetween(String value1, String value2) {
            addCriterion("HOME_ADDR not between", value1, value2, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomePostcodeIsNull() {
            addCriterion("HOME_POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andHomePostcodeIsNotNull() {
            addCriterion("HOME_POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andHomePostcodeEqualTo(String value) {
            addCriterion("HOME_POSTCODE =", value, "homePostcode");
            return (Criteria) this;
        }

        public Criteria andHomePostcodeNotEqualTo(String value) {
            addCriterion("HOME_POSTCODE <>", value, "homePostcode");
            return (Criteria) this;
        }

        public Criteria andHomePostcodeGreaterThan(String value) {
            addCriterion("HOME_POSTCODE >", value, "homePostcode");
            return (Criteria) this;
        }

        public Criteria andHomePostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_POSTCODE >=", value, "homePostcode");
            return (Criteria) this;
        }

        public Criteria andHomePostcodeLessThan(String value) {
            addCriterion("HOME_POSTCODE <", value, "homePostcode");
            return (Criteria) this;
        }

        public Criteria andHomePostcodeLessThanOrEqualTo(String value) {
            addCriterion("HOME_POSTCODE <=", value, "homePostcode");
            return (Criteria) this;
        }

        public Criteria andHomePostcodeLike(String value) {
            addCriterion("HOME_POSTCODE like", value, "homePostcode");
            return (Criteria) this;
        }

        public Criteria andHomePostcodeNotLike(String value) {
            addCriterion("HOME_POSTCODE not like", value, "homePostcode");
            return (Criteria) this;
        }

        public Criteria andHomePostcodeIn(List<String> values) {
            addCriterion("HOME_POSTCODE in", values, "homePostcode");
            return (Criteria) this;
        }

        public Criteria andHomePostcodeNotIn(List<String> values) {
            addCriterion("HOME_POSTCODE not in", values, "homePostcode");
            return (Criteria) this;
        }

        public Criteria andHomePostcodeBetween(String value1, String value2) {
            addCriterion("HOME_POSTCODE between", value1, value2, "homePostcode");
            return (Criteria) this;
        }

        public Criteria andHomePostcodeNotBetween(String value1, String value2) {
            addCriterion("HOME_POSTCODE not between", value1, value2, "homePostcode");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNull() {
            addCriterion("HOME_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNotNull() {
            addCriterion("HOME_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneEqualTo(String value) {
            addCriterion("HOME_PHONE =", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotEqualTo(String value) {
            addCriterion("HOME_PHONE <>", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThan(String value) {
            addCriterion("HOME_PHONE >", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_PHONE >=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThan(String value) {
            addCriterion("HOME_PHONE <", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThanOrEqualTo(String value) {
            addCriterion("HOME_PHONE <=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLike(String value) {
            addCriterion("HOME_PHONE like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotLike(String value) {
            addCriterion("HOME_PHONE not like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIn(List<String> values) {
            addCriterion("HOME_PHONE in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotIn(List<String> values) {
            addCriterion("HOME_PHONE not in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneBetween(String value1, String value2) {
            addCriterion("HOME_PHONE between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotBetween(String value1, String value2) {
            addCriterion("HOME_PHONE not between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceIsNull() {
            addCriterion("DOMICILE_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceIsNotNull() {
            addCriterion("DOMICILE_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceEqualTo(String value) {
            addCriterion("DOMICILE_PLACE =", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceNotEqualTo(String value) {
            addCriterion("DOMICILE_PLACE <>", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceGreaterThan(String value) {
            addCriterion("DOMICILE_PLACE >", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("DOMICILE_PLACE >=", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceLessThan(String value) {
            addCriterion("DOMICILE_PLACE <", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceLessThanOrEqualTo(String value) {
            addCriterion("DOMICILE_PLACE <=", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceLike(String value) {
            addCriterion("DOMICILE_PLACE like", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceNotLike(String value) {
            addCriterion("DOMICILE_PLACE not like", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceIn(List<String> values) {
            addCriterion("DOMICILE_PLACE in", values, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceNotIn(List<String> values) {
            addCriterion("DOMICILE_PLACE not in", values, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceBetween(String value1, String value2) {
            addCriterion("DOMICILE_PLACE between", value1, value2, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceNotBetween(String value1, String value2) {
            addCriterion("DOMICILE_PLACE not between", value1, value2, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("COMPANY_NAME like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("COMPANY_NAME not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrIsNull() {
            addCriterion("COMPANY_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrIsNotNull() {
            addCriterion("COMPANY_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrEqualTo(String value) {
            addCriterion("COMPANY_ADDR =", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotEqualTo(String value) {
            addCriterion("COMPANY_ADDR <>", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrGreaterThan(String value) {
            addCriterion("COMPANY_ADDR >", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ADDR >=", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrLessThan(String value) {
            addCriterion("COMPANY_ADDR <", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ADDR <=", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrLike(String value) {
            addCriterion("COMPANY_ADDR like", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotLike(String value) {
            addCriterion("COMPANY_ADDR not like", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrIn(List<String> values) {
            addCriterion("COMPANY_ADDR in", values, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotIn(List<String> values) {
            addCriterion("COMPANY_ADDR not in", values, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrBetween(String value1, String value2) {
            addCriterion("COMPANY_ADDR between", value1, value2, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ADDR not between", value1, value2, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyPostcodeIsNull() {
            addCriterion("COMPANY_POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPostcodeIsNotNull() {
            addCriterion("COMPANY_POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPostcodeEqualTo(String value) {
            addCriterion("COMPANY_POSTCODE =", value, "companyPostcode");
            return (Criteria) this;
        }

        public Criteria andCompanyPostcodeNotEqualTo(String value) {
            addCriterion("COMPANY_POSTCODE <>", value, "companyPostcode");
            return (Criteria) this;
        }

        public Criteria andCompanyPostcodeGreaterThan(String value) {
            addCriterion("COMPANY_POSTCODE >", value, "companyPostcode");
            return (Criteria) this;
        }

        public Criteria andCompanyPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_POSTCODE >=", value, "companyPostcode");
            return (Criteria) this;
        }

        public Criteria andCompanyPostcodeLessThan(String value) {
            addCriterion("COMPANY_POSTCODE <", value, "companyPostcode");
            return (Criteria) this;
        }

        public Criteria andCompanyPostcodeLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_POSTCODE <=", value, "companyPostcode");
            return (Criteria) this;
        }

        public Criteria andCompanyPostcodeLike(String value) {
            addCriterion("COMPANY_POSTCODE like", value, "companyPostcode");
            return (Criteria) this;
        }

        public Criteria andCompanyPostcodeNotLike(String value) {
            addCriterion("COMPANY_POSTCODE not like", value, "companyPostcode");
            return (Criteria) this;
        }

        public Criteria andCompanyPostcodeIn(List<String> values) {
            addCriterion("COMPANY_POSTCODE in", values, "companyPostcode");
            return (Criteria) this;
        }

        public Criteria andCompanyPostcodeNotIn(List<String> values) {
            addCriterion("COMPANY_POSTCODE not in", values, "companyPostcode");
            return (Criteria) this;
        }

        public Criteria andCompanyPostcodeBetween(String value1, String value2) {
            addCriterion("COMPANY_POSTCODE between", value1, value2, "companyPostcode");
            return (Criteria) this;
        }

        public Criteria andCompanyPostcodeNotBetween(String value1, String value2) {
            addCriterion("COMPANY_POSTCODE not between", value1, value2, "companyPostcode");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNull() {
            addCriterion("COMPANY_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNotNull() {
            addCriterion("COMPANY_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneEqualTo(String value) {
            addCriterion("COMPANY_PHONE =", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotEqualTo(String value) {
            addCriterion("COMPANY_PHONE <>", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThan(String value) {
            addCriterion("COMPANY_PHONE >", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_PHONE >=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThan(String value) {
            addCriterion("COMPANY_PHONE <", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_PHONE <=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLike(String value) {
            addCriterion("COMPANY_PHONE like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotLike(String value) {
            addCriterion("COMPANY_PHONE not like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIn(List<String> values) {
            addCriterion("COMPANY_PHONE in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotIn(List<String> values) {
            addCriterion("COMPANY_PHONE not in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneBetween(String value1, String value2) {
            addCriterion("COMPANY_PHONE between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("COMPANY_PHONE not between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyDeptIsNull() {
            addCriterion("COMPANY_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andCompanyDeptIsNotNull() {
            addCriterion("COMPANY_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyDeptEqualTo(String value) {
            addCriterion("COMPANY_DEPT =", value, "companyDept");
            return (Criteria) this;
        }

        public Criteria andCompanyDeptNotEqualTo(String value) {
            addCriterion("COMPANY_DEPT <>", value, "companyDept");
            return (Criteria) this;
        }

        public Criteria andCompanyDeptGreaterThan(String value) {
            addCriterion("COMPANY_DEPT >", value, "companyDept");
            return (Criteria) this;
        }

        public Criteria andCompanyDeptGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_DEPT >=", value, "companyDept");
            return (Criteria) this;
        }

        public Criteria andCompanyDeptLessThan(String value) {
            addCriterion("COMPANY_DEPT <", value, "companyDept");
            return (Criteria) this;
        }

        public Criteria andCompanyDeptLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_DEPT <=", value, "companyDept");
            return (Criteria) this;
        }

        public Criteria andCompanyDeptLike(String value) {
            addCriterion("COMPANY_DEPT like", value, "companyDept");
            return (Criteria) this;
        }

        public Criteria andCompanyDeptNotLike(String value) {
            addCriterion("COMPANY_DEPT not like", value, "companyDept");
            return (Criteria) this;
        }

        public Criteria andCompanyDeptIn(List<String> values) {
            addCriterion("COMPANY_DEPT in", values, "companyDept");
            return (Criteria) this;
        }

        public Criteria andCompanyDeptNotIn(List<String> values) {
            addCriterion("COMPANY_DEPT not in", values, "companyDept");
            return (Criteria) this;
        }

        public Criteria andCompanyDeptBetween(String value1, String value2) {
            addCriterion("COMPANY_DEPT between", value1, value2, "companyDept");
            return (Criteria) this;
        }

        public Criteria andCompanyDeptNotBetween(String value1, String value2) {
            addCriterion("COMPANY_DEPT not between", value1, value2, "companyDept");
            return (Criteria) this;
        }

        public Criteria andCompanyDutyIsNull() {
            addCriterion("COMPANY_DUTY is null");
            return (Criteria) this;
        }

        public Criteria andCompanyDutyIsNotNull() {
            addCriterion("COMPANY_DUTY is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyDutyEqualTo(String value) {
            addCriterion("COMPANY_DUTY =", value, "companyDuty");
            return (Criteria) this;
        }

        public Criteria andCompanyDutyNotEqualTo(String value) {
            addCriterion("COMPANY_DUTY <>", value, "companyDuty");
            return (Criteria) this;
        }

        public Criteria andCompanyDutyGreaterThan(String value) {
            addCriterion("COMPANY_DUTY >", value, "companyDuty");
            return (Criteria) this;
        }

        public Criteria andCompanyDutyGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_DUTY >=", value, "companyDuty");
            return (Criteria) this;
        }

        public Criteria andCompanyDutyLessThan(String value) {
            addCriterion("COMPANY_DUTY <", value, "companyDuty");
            return (Criteria) this;
        }

        public Criteria andCompanyDutyLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_DUTY <=", value, "companyDuty");
            return (Criteria) this;
        }

        public Criteria andCompanyDutyLike(String value) {
            addCriterion("COMPANY_DUTY like", value, "companyDuty");
            return (Criteria) this;
        }

        public Criteria andCompanyDutyNotLike(String value) {
            addCriterion("COMPANY_DUTY not like", value, "companyDuty");
            return (Criteria) this;
        }

        public Criteria andCompanyDutyIn(List<String> values) {
            addCriterion("COMPANY_DUTY in", values, "companyDuty");
            return (Criteria) this;
        }

        public Criteria andCompanyDutyNotIn(List<String> values) {
            addCriterion("COMPANY_DUTY not in", values, "companyDuty");
            return (Criteria) this;
        }

        public Criteria andCompanyDutyBetween(String value1, String value2) {
            addCriterion("COMPANY_DUTY between", value1, value2, "companyDuty");
            return (Criteria) this;
        }

        public Criteria andCompanyDutyNotBetween(String value1, String value2) {
            addCriterion("COMPANY_DUTY not between", value1, value2, "companyDuty");
            return (Criteria) this;
        }

        public Criteria andCompanyPropIsNull() {
            addCriterion("COMPANY_PROP is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPropIsNotNull() {
            addCriterion("COMPANY_PROP is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPropEqualTo(String value) {
            addCriterion("COMPANY_PROP =", value, "companyProp");
            return (Criteria) this;
        }

        public Criteria andCompanyPropNotEqualTo(String value) {
            addCriterion("COMPANY_PROP <>", value, "companyProp");
            return (Criteria) this;
        }

        public Criteria andCompanyPropGreaterThan(String value) {
            addCriterion("COMPANY_PROP >", value, "companyProp");
            return (Criteria) this;
        }

        public Criteria andCompanyPropGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_PROP >=", value, "companyProp");
            return (Criteria) this;
        }

        public Criteria andCompanyPropLessThan(String value) {
            addCriterion("COMPANY_PROP <", value, "companyProp");
            return (Criteria) this;
        }

        public Criteria andCompanyPropLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_PROP <=", value, "companyProp");
            return (Criteria) this;
        }

        public Criteria andCompanyPropLike(String value) {
            addCriterion("COMPANY_PROP like", value, "companyProp");
            return (Criteria) this;
        }

        public Criteria andCompanyPropNotLike(String value) {
            addCriterion("COMPANY_PROP not like", value, "companyProp");
            return (Criteria) this;
        }

        public Criteria andCompanyPropIn(List<String> values) {
            addCriterion("COMPANY_PROP in", values, "companyProp");
            return (Criteria) this;
        }

        public Criteria andCompanyPropNotIn(List<String> values) {
            addCriterion("COMPANY_PROP not in", values, "companyProp");
            return (Criteria) this;
        }

        public Criteria andCompanyPropBetween(String value1, String value2) {
            addCriterion("COMPANY_PROP between", value1, value2, "companyProp");
            return (Criteria) this;
        }

        public Criteria andCompanyPropNotBetween(String value1, String value2) {
            addCriterion("COMPANY_PROP not between", value1, value2, "companyProp");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleIsNull() {
            addCriterion("COMPANY_SCALE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleIsNotNull() {
            addCriterion("COMPANY_SCALE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleEqualTo(String value) {
            addCriterion("COMPANY_SCALE =", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleNotEqualTo(String value) {
            addCriterion("COMPANY_SCALE <>", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleGreaterThan(String value) {
            addCriterion("COMPANY_SCALE >", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_SCALE >=", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleLessThan(String value) {
            addCriterion("COMPANY_SCALE <", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_SCALE <=", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleLike(String value) {
            addCriterion("COMPANY_SCALE like", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleNotLike(String value) {
            addCriterion("COMPANY_SCALE not like", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleIn(List<String> values) {
            addCriterion("COMPANY_SCALE in", values, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleNotIn(List<String> values) {
            addCriterion("COMPANY_SCALE not in", values, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleBetween(String value1, String value2) {
            addCriterion("COMPANY_SCALE between", value1, value2, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleNotBetween(String value1, String value2) {
            addCriterion("COMPANY_SCALE not between", value1, value2, "companyScale");
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