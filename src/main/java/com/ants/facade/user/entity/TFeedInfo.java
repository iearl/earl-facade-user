package com.ants.facade.user.entity;

import com.ants.common.entity.BaseEntity;

public class TFeedInfo extends BaseEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = 201804142356L;

	private Integer fdId;

    private String fdEmail;

    private String fdTitle;

    private String fdContent;

    private String fdCreateTime;

    private String adTitle;

    private String adContent;

    private String adCreateTime;

    private String memoInfo;

    private String stopFlag;

    public Integer getFdId() {
        return fdId;
    }

    public void setFdId(Integer fdId) {
        this.fdId = fdId;
    }

    public String getFdEmail() {
        return fdEmail;
    }

    public void setFdEmail(String fdEmail) {
        this.fdEmail = fdEmail == null ? null : fdEmail.trim();
    }

    public String getFdTitle() {
        return fdTitle;
    }

    public void setFdTitle(String fdTitle) {
        this.fdTitle = fdTitle == null ? null : fdTitle.trim();
    }

    public String getFdContent() {
        return fdContent;
    }

    public void setFdContent(String fdContent) {
        this.fdContent = fdContent == null ? null : fdContent.trim();
    }

    public String getFdCreateTime() {
        return fdCreateTime;
    }

    public void setFdCreateTime(String fdCreateTime) {
        this.fdCreateTime = fdCreateTime == null ? null : fdCreateTime.trim();
    }

    public String getAdTitle() {
        return adTitle;
    }

    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle == null ? null : adTitle.trim();
    }

    public String getAdContent() {
        return adContent;
    }

    public void setAdContent(String adContent) {
        this.adContent = adContent == null ? null : adContent.trim();
    }

    public String getAdCreateTime() {
        return adCreateTime;
    }

    public void setAdCreateTime(String adCreateTime) {
        this.adCreateTime = adCreateTime == null ? null : adCreateTime.trim();
    }

    public String getMemoInfo() {
        return memoInfo;
    }

    public void setMemoInfo(String memoInfo) {
        this.memoInfo = memoInfo == null ? null : memoInfo.trim();
    }

    public String getStopFlag() {
        return stopFlag;
    }

    public void setStopFlag(String stopFlag) {
        this.stopFlag = stopFlag == null ? null : stopFlag.trim();
    }
}