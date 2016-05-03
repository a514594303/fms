package com.ufc.fm.dbio.po;

public class FmLoan {
    private Integer loanId;

    private String custId;

    private String taskId;

    private String loanAmount;

    private String loanPeriod;

    private String rate;

    private String repMethod;

    private String repType;

    private String repAccount;

    private String loanApplication;

    private String mortMode;

    private String accountName;

    private String bankName;

    private String recAccount;

    private String contact;

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount == null ? null : loanAmount.trim();
    }

    public String getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(String loanPeriod) {
        this.loanPeriod = loanPeriod == null ? null : loanPeriod.trim();
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    public String getRepMethod() {
        return repMethod;
    }

    public void setRepMethod(String repMethod) {
        this.repMethod = repMethod == null ? null : repMethod.trim();
    }

    public String getRepType() {
        return repType;
    }

    public void setRepType(String repType) {
        this.repType = repType == null ? null : repType.trim();
    }

    public String getRepAccount() {
        return repAccount;
    }

    public void setRepAccount(String repAccount) {
        this.repAccount = repAccount == null ? null : repAccount.trim();
    }

    public String getLoanApplication() {
        return loanApplication;
    }

    public void setLoanApplication(String loanApplication) {
        this.loanApplication = loanApplication == null ? null : loanApplication.trim();
    }

    public String getMortMode() {
        return mortMode;
    }

    public void setMortMode(String mortMode) {
        this.mortMode = mortMode == null ? null : mortMode.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getRecAccount() {
        return recAccount;
    }

    public void setRecAccount(String recAccount) {
        this.recAccount = recAccount == null ? null : recAccount.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }
}