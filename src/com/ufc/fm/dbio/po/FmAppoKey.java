package com.ufc.fm.dbio.po;

public class FmAppoKey {
    private String custId;

    private String taskId;

    private String appoId;

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

    public String getAppoId() {
        return appoId;
    }

    public void setAppoId(String appoId) {
        this.appoId = appoId == null ? null : appoId.trim();
    }
}