package com.ufc.fm.dbio.po;

public class FmCustomer {
    private String custId;

    private String custType;

    private String createDate;

    private String custName;

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType == null ? null : custType.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

	@Override
	public String toString() {
		return "FmCustomer [custId=" + custId + ", custType=" + custType
				+ ", createDate=" + createDate + ", custName=" + custName + "]";
	}
}