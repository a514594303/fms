package com.ufc.fm.dbio.po;

public class FmStatisticsTaskNum {

	private String reptDate;
	private String txnType;
	private String taskStatus;
	private String taskCount;

	public String getReptDate() {
		return reptDate;
	}

	public void setReptDate(String reptDate) {
		this.reptDate = reptDate;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskCount() {
		return taskCount;
	}

	public void setTaskCount(String taskCount) {
		this.taskCount = taskCount;
	}
}