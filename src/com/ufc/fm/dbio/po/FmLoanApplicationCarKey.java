package com.ufc.fm.dbio.po;

public class FmLoanApplicationCarKey {
    private Integer carId;

    private String loanId;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId == null ? null : loanId.trim();
    }
}