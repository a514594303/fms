package com.ufc.fm.dbio.po;

public class FmLoanProgress {
    private String custId;

    private String custName;

    private String loanDate;

    private String loanAmount;

    private String loanStatus;

    private String loanRejreason;

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate == null ? null : loanDate.trim();
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount == null ? null : loanAmount.trim();
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus == null ? null : loanStatus.trim();
    }

    public String getLoanRejreason() {
        return loanRejreason;
    }

    public void setLoanRejreason(String loanRejreason) {
        this.loanRejreason = loanRejreason == null ? null : loanRejreason.trim();
    }
}