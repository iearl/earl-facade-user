package com.ants.facade.user.entity;

import com.ants.common.entity.BaseEntity;

/**
 * 
 * @ClassName: TArchivesLog
 * @Description: TODO(日志信息类)
 * @author 马高伟
 * @date 2018年4月21日
 *
 */
public class TArchivesLog extends BaseEntity {
	private static final long serialVersionUID = 201804211849L;

	private Integer logId;

	private String operName;

	private String operType;

	private String operDesc;

	private String logMemoInfo;

	private String logCreateTime;

	private String logStopFlag;

	public Integer getLogId() {
		return logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	public String getOperName() {
		return operName;
	}

	public void setOperName(String operName) {
		this.operName = operName == null ? null : operName.trim();
	}

	public String getOperType() {
		return operType;
	}

	public void setOperType(String operType) {
		this.operType = operType == null ? null : operType.trim();
	}

	public String getOperDesc() {
		return operDesc;
	}

	public void setOperDesc(String operDesc) {
		this.operDesc = operDesc == null ? null : operDesc.trim();
	}

	public String getLogMemoInfo() {
		return logMemoInfo;
	}

	public void setLogMemoInfo(String logMemoInfo) {
		this.logMemoInfo = logMemoInfo == null ? null : logMemoInfo.trim();
	}

	public String getLogCreateTime() {
		return logCreateTime;
	}

	public void setLogCreateTime(String logCreateTime) {
		this.logCreateTime = logCreateTime == null ? null : logCreateTime
				.trim();
	}

	public String getLogStopFlag() {
		return logStopFlag;
	}

	public void setLogStopFlag(String logStopFlag) {
		this.logStopFlag = logStopFlag == null ? null : logStopFlag.trim();
	}
}