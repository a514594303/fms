package com.ufc.fm.dbio.po;

public class FmLoanGcn {
    private Integer gcnId;

    private String loanId;

    private String guarCompanyName;

    private String guarCompanyPhone;

    private String addr;

    private String companyCode;

    private String regCapital;

    private String creditGrade;

    public Integer getGcnId() {
        return gcnId;
    }

    public void setGcnId(Integer gcnId) {
        this.gcnId = gcnId;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId == null ? null : loanId.trim();
    }

    public String getGuarCompanyName() {
        return guarCompanyName;
    }

    public void setGuarCompanyName(String guarCompanyName) {
        this.guarCompanyName = guarCompanyName == null ? null : guarCompanyName.trim();
    }

    public String getGuarCompanyPhone() {
        return guarCompanyPhone;
    }

    public void setGuarCompanyPhone(String guarCompanyPhone) {
        this.guarCompanyPhone = guarCompanyPhone == null ? null : guarCompanyPhone.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getRegCapital() {
        return regCapital;
    }

    public void setRegCapital(String regCapital) {
        this.regCapital = regCapital == null ? null : regCapital.trim();
    }

    public String getCreditGrade() {
        return creditGrade;
    }

    public void setCreditGrade(String creditGrade) {
        this.creditGrade = creditGrade == null ? null : creditGrade.trim();
    }
}