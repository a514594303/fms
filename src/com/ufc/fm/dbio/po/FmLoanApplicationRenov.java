package com.ufc.fm.dbio.po;

public class FmLoanApplicationRenov {
    private Integer renId;

    private String loanId;

    private String decName;

    private String phone;

    private String decPrice;

    public Integer getRenId() {
        return renId;
    }

    public void setRenId(Integer renId) {
        this.renId = renId;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId == null ? null : loanId.trim();
    }

    public String getDecName() {
        return decName;
    }

    public void setDecName(String decName) {
        this.decName = decName == null ? null : decName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getDecPrice() {
        return decPrice;
    }

    public void setDecPrice(String decPrice) {
        this.decPrice = decPrice == null ? null : decPrice.trim();
    }
}