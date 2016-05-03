package com.ufc.fm.dbio.po;

import java.util.ArrayList;
import java.util.List;

public class FmLoanGcnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmLoanGcnExample() {
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

        public Criteria andGcnIdIsNull() {
            addCriterion("gcn_id is null");
            return (Criteria) this;
        }

        public Criteria andGcnIdIsNotNull() {
            addCriterion("gcn_id is not null");
            return (Criteria) this;
        }

        public Criteria andGcnIdEqualTo(Integer value) {
            addCriterion("gcn_id =", value, "gcnId");
            return (Criteria) this;
        }

        public Criteria andGcnIdNotEqualTo(Integer value) {
            addCriterion("gcn_id <>", value, "gcnId");
            return (Criteria) this;
        }

        public Criteria andGcnIdGreaterThan(Integer value) {
            addCriterion("gcn_id >", value, "gcnId");
            return (Criteria) this;
        }

        public Criteria andGcnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gcn_id >=", value, "gcnId");
            return (Criteria) this;
        }

        public Criteria andGcnIdLessThan(Integer value) {
            addCriterion("gcn_id <", value, "gcnId");
            return (Criteria) this;
        }

        public Criteria andGcnIdLessThanOrEqualTo(Integer value) {
            addCriterion("gcn_id <=", value, "gcnId");
            return (Criteria) this;
        }

        public Criteria andGcnIdIn(List<Integer> values) {
            addCriterion("gcn_id in", values, "gcnId");
            return (Criteria) this;
        }

        public Criteria andGcnIdNotIn(List<Integer> values) {
            addCriterion("gcn_id not in", values, "gcnId");
            return (Criteria) this;
        }

        public Criteria andGcnIdBetween(Integer value1, Integer value2) {
            addCriterion("gcn_id between", value1, value2, "gcnId");
            return (Criteria) this;
        }

        public Criteria andGcnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gcn_id not between", value1, value2, "gcnId");
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

        public Criteria andGuarCompanyNameIsNull() {
            addCriterion("guar_company_name is null");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyNameIsNotNull() {
            addCriterion("guar_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyNameEqualTo(String value) {
            addCriterion("guar_company_name =", value, "guarCompanyName");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyNameNotEqualTo(String value) {
            addCriterion("guar_company_name <>", value, "guarCompanyName");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyNameGreaterThan(String value) {
            addCriterion("guar_company_name >", value, "guarCompanyName");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("guar_company_name >=", value, "guarCompanyName");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyNameLessThan(String value) {
            addCriterion("guar_company_name <", value, "guarCompanyName");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("guar_company_name <=", value, "guarCompanyName");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyNameLike(String value) {
            addCriterion("guar_company_name like", value, "guarCompanyName");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyNameNotLike(String value) {
            addCriterion("guar_company_name not like", value, "guarCompanyName");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyNameIn(List<String> values) {
            addCriterion("guar_company_name in", values, "guarCompanyName");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyNameNotIn(List<String> values) {
            addCriterion("guar_company_name not in", values, "guarCompanyName");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyNameBetween(String value1, String value2) {
            addCriterion("guar_company_name between", value1, value2, "guarCompanyName");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyNameNotBetween(String value1, String value2) {
            addCriterion("guar_company_name not between", value1, value2, "guarCompanyName");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyPhoneIsNull() {
            addCriterion("guar_company_phone is null");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyPhoneIsNotNull() {
            addCriterion("guar_company_phone is not null");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyPhoneEqualTo(String value) {
            addCriterion("guar_company_phone =", value, "guarCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyPhoneNotEqualTo(String value) {
            addCriterion("guar_company_phone <>", value, "guarCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyPhoneGreaterThan(String value) {
            addCriterion("guar_company_phone >", value, "guarCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("guar_company_phone >=", value, "guarCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyPhoneLessThan(String value) {
            addCriterion("guar_company_phone <", value, "guarCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("guar_company_phone <=", value, "guarCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyPhoneLike(String value) {
            addCriterion("guar_company_phone like", value, "guarCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyPhoneNotLike(String value) {
            addCriterion("guar_company_phone not like", value, "guarCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyPhoneIn(List<String> values) {
            addCriterion("guar_company_phone in", values, "guarCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyPhoneNotIn(List<String> values) {
            addCriterion("guar_company_phone not in", values, "guarCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyPhoneBetween(String value1, String value2) {
            addCriterion("guar_company_phone between", value1, value2, "guarCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andGuarCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("guar_company_phone not between", value1, value2, "guarCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("addr is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("addr is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("addr =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("addr <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("addr >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("addr >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("addr <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("addr <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("addr like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("addr not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("addr in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("addr not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("addr between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("addr not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNull() {
            addCriterion("company_code is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("company_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("company_code =", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("company_code <>", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("company_code >", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_code >=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("company_code <", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("company_code <=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLike(String value) {
            addCriterion("company_code like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("company_code not like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("company_code in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("company_code not in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("company_code between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("company_code not between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andRegCapitalIsNull() {
            addCriterion("reg_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegCapitalIsNotNull() {
            addCriterion("reg_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegCapitalEqualTo(String value) {
            addCriterion("reg_capital =", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotEqualTo(String value) {
            addCriterion("reg_capital <>", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalGreaterThan(String value) {
            addCriterion("reg_capital >", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("reg_capital >=", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalLessThan(String value) {
            addCriterion("reg_capital <", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalLessThanOrEqualTo(String value) {
            addCriterion("reg_capital <=", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalLike(String value) {
            addCriterion("reg_capital like", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotLike(String value) {
            addCriterion("reg_capital not like", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalIn(List<String> values) {
            addCriterion("reg_capital in", values, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotIn(List<String> values) {
            addCriterion("reg_capital not in", values, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalBetween(String value1, String value2) {
            addCriterion("reg_capital between", value1, value2, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotBetween(String value1, String value2) {
            addCriterion("reg_capital not between", value1, value2, "regCapital");
            return (Criteria) this;
        }

        public Criteria andCreditGradeIsNull() {
            addCriterion("credit_grade is null");
            return (Criteria) this;
        }

        public Criteria andCreditGradeIsNotNull() {
            addCriterion("credit_grade is not null");
            return (Criteria) this;
        }

        public Criteria andCreditGradeEqualTo(String value) {
            addCriterion("credit_grade =", value, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeNotEqualTo(String value) {
            addCriterion("credit_grade <>", value, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeGreaterThan(String value) {
            addCriterion("credit_grade >", value, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeGreaterThanOrEqualTo(String value) {
            addCriterion("credit_grade >=", value, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeLessThan(String value) {
            addCriterion("credit_grade <", value, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeLessThanOrEqualTo(String value) {
            addCriterion("credit_grade <=", value, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeLike(String value) {
            addCriterion("credit_grade like", value, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeNotLike(String value) {
            addCriterion("credit_grade not like", value, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeIn(List<String> values) {
            addCriterion("credit_grade in", values, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeNotIn(List<String> values) {
            addCriterion("credit_grade not in", values, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeBetween(String value1, String value2) {
            addCriterion("credit_grade between", value1, value2, "creditGrade");
            return (Criteria) this;
        }

        public Criteria andCreditGradeNotBetween(String value1, String value2) {
            addCriterion("credit_grade not between", value1, value2, "creditGrade");
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