package com.ufc.fm.dbio.po;

public class FmLoanMortg {
    private Integer mortId;

    private String loanId;

    private String pledgeName;

    private String cny;

    private String vouNum1;

    private String pledgePrice1;

    private String vouNum2;

    private String pledgePrice2;

    public Integer getMortId() {
        return mortId;
    }

    public void setMortId(Integer mortId) {
        this.mortId = mortId;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId == null ? null : loanId.trim();
    }

    public String getPledgeName() {
        return pledgeName;
    }

    public void setPledgeName(String pledgeName) {
        this.pledgeName = pledgeName == null ? null : pledgeName.trim();
    }

    public String getCny() {
        return cny;
    }

    public void setCny(String cny) {
        this.cny = cny == null ? null : cny.trim();
    }

    public String getVouNum1() {
        return vouNum1;
    }

    public void setVouNum1(String vouNum1) {
        this.vouNum1 = vouNum1 == null ? null : vouNum1.trim();
    }

    public String getPledgePrice1() {
        return pledgePrice1;
    }

    public void setPledgePrice1(String pledgePrice1) {
        this.pledgePrice1 = pledgePrice1 == null ? null : pledgePrice1.trim();
    }

    public String getVouNum2() {
        return vouNum2;
    }

    public void setVouNum2(String vouNum2) {
        this.vouNum2 = vouNum2 == null ? null : vouNum2.trim();
    }

    public String getPledgePrice2() {
        return pledgePrice2;
    }

    public void setPledgePrice2(String pledgePrice2) {
        this.pledgePrice2 = pledgePrice2 == null ? null : pledgePrice2.trim();
    }
}