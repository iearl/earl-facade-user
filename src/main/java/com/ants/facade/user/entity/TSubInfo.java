package com.ants.facade.user.entity;

import java.util.Date;

import com.ants.common.entity.BaseEntity;

public class TSubInfo extends BaseEntity {

	private static final long serialVersionUID = 201804210011L;

	private String subId;

    private Integer subType;

    private String subName;

    private String motherId;

    private String subLevel;

    private String subMemo;

    private String subCreateTime;

    private String subStopFlag;

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId == null ? null : subId.trim();
    }

    public Integer getSubType() {
        return subType;
    }

    public void setSubType(Integer subType) {
        this.subType = subType;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName == null ? null : subName.trim();
    }

    public String getMotherId() {
        return motherId;
    }

    public void setMotherId(String motherId) {
        this.motherId = motherId == null ? null : motherId.trim();
    }

    public String getSubLevel() {
        return subLevel;
    }

    public void setSubLevel(String subLevel) {
        this.subLevel = subLevel == null ? null : subLevel.trim();
    }

    public String getSubMemo() {
        return subMemo;
    }

    public void setSubMemo(String subMemo) {
        this.subMemo = subMemo == null ? null : subMemo.trim();
    }

 

    /**
	 * @return the subCreateTime
	 */
	public String getSubCreateTime() {
		return subCreateTime;
	}

	/**
	 * @param subCreateTime the subCreateTime to set
	 */
	public void setSubCreateTime(String subCreateTime) {
		this.subCreateTime = subCreateTime;
	}

	public String getSubStopFlag() {
        return subStopFlag;
    }

    public void setSubStopFlag(String subStopFlag) {
        this.subStopFlag = subStopFlag == null ? null : subStopFlag.trim();
    }
}