package com.ufc.fm.dbio.po;

public class FmLoanApplicationRenovKey {
    private Integer renId;

    private String loanId;

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
}