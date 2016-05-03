package com.ufc.fm.dbio.po;

public class FmAppo extends FmAppoKey {
    private String appoDt;

    private String appoPlace;

    private String appoStatus;

    private String remark;

    public String getAppoDt() {
        return appoDt;
    }

    public void setAppoDt(String appoDt) {
        this.appoDt = appoDt == null ? null : appoDt.trim();
    }

    public String getAppoPlace() {
        return appoPlace;
    }

    public void setAppoPlace(String appoPlace) {
        this.appoPlace = appoPlace == null ? null : appoPlace.trim();
    }

    public String getAppoStatus() {
        return appoStatus;
    }

    public void setAppoStatus(String appoStatus) {
        this.appoStatus = appoStatus == null ? null : appoStatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}