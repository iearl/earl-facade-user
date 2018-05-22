package com.ants.facade.user.entity;

import java.util.Date;

import com.ants.common.entity.BaseEntity;

public class TProgInfo extends BaseEntity{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 20180412121225L;

	private Integer progId;

    private Integer recId;

    private Integer uId;

    private String progStatue;

    private String propMemo;

    private Date progCreateTime;

    private String progStopFlag;

    public Integer getProgId() {
        return progId;
    }

    public void setProgId(Integer progId) {
        this.progId = progId;
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getProgStatue() {
        return progStatue;
    }

    public void setProgStatue(String progStatue) {
        this.progStatue = progStatue == null ? null : progStatue.trim();
    }

    public String getPropMemo() {
        return propMemo;
    }

    public void setPropMemo(String propMemo) {
        this.propMemo = propMemo == null ? null : propMemo.trim();
    }

    public Date getProgCreateTime() {
        return progCreateTime;
    }

    public void setProgCreateTime(Date progCreateTime) {
        this.progCreateTime = progCreateTime;
    }

    public String getProgStopFlag() {
        return progStopFlag;
    }

    public void setProgStopFlag(String progStopFlag) {
        this.progStopFlag = progStopFlag == null ? null : progStopFlag.trim();
    }
}