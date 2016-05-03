package com.ufc.fm.dbio.po;

public class FmCreditcardProgress {
    private String custId;

    private String custName;

    private String ccDate;

    private String ccStatus;

    private String ccRejreason;

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

    public String getCcDate() {
        return ccDate;
    }

    public void setCcDate(String ccDate) {
        this.ccDate = ccDate == null ? null : ccDate.trim();
    }

    public String getCcStatus() {
        return ccStatus;
    }

    public void setCcStatus(String ccStatus) {
        this.ccStatus = ccStatus == null ? null : ccStatus.trim();
    }

    public String getCcRejreason() {
        return ccRejreason;
    }

    public void setCcRejreason(String ccRejreason) {
        this.ccRejreason = ccRejreason == null ? null : ccRejreason.trim();
    }
}