package com.ants.facade.user.entity;

import java.util.Date;

import com.ants.common.entity.BaseEntity;

public class TWorkShow extends BaseEntity{
  
	private static final long serialVersionUID = 2018040172233L;

	private Integer workId;//工作经验ID

    private Integer uId;//用户ID

    private String coName;//公司名称

    private Date workStart;//工作开启时间

    private Date workEnd;//工作结束时间

    private String workDepart;//工作部门

    private String workContent;//工作内容

    private String workKpi;//工作业绩

    private String workMemoInfo;//备注

    private Date workCreateTime;//创建时间

    private String workStopFlag;//是否删除

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName == null ? null : coName.trim();
    }

    public Date getWorkStart() {
        return workStart;
    }

    public void setWorkStart(Date workStart) {
        this.workStart = workStart;
    }

    public Date getWorkEnd() {
        return workEnd;
    }

    public void setWorkEnd(Date workEnd) {
        this.workEnd = workEnd;
    }

    public String getWorkDepart() {
        return workDepart;
    }

    public void setWorkDepart(String workDepart) {
        this.workDepart = workDepart == null ? null : workDepart.trim();
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent == null ? null : workContent.trim();
    }

    public String getWorkKpi() {
        return workKpi;
    }

    public void setWorkKpi(String workKpi) {
        this.workKpi = workKpi == null ? null : workKpi.trim();
    }

    public String getWorkMemoInfo() {
        return workMemoInfo;
    }

    public void setWorkMemoInfo(String workMemoInfo) {
        this.workMemoInfo = workMemoInfo == null ? null : workMemoInfo.trim();
    }

    public Date getWorkCreateTime() {
        return workCreateTime;
    }

    public void setWorkCreateTime(Date workCreateTime) {
        this.workCreateTime = workCreateTime;
    }

    public String getWorkStopFlag() {
        return workStopFlag;
    }

    public void setWorkStopFlag(String workStopFlag) {
        this.workStopFlag = workStopFlag == null ? null : workStopFlag.trim();
    }
}