package com.ants.facade.user.entity;

import java.util.Date;

import com.ants.common.entity.BaseEntity;

/**
 * 
 * @ClassName: TRecruitInfo
 * @Description: TODO(职位发布实体)
 * @author 马高伟
 * @date 2018年4月16日
 *
 */

public class TRecruitInfo extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 201804161542L;

	private Integer recId;

	private Integer coId;

	private Integer uId;

	private String jobCode;

	private String recName;

	private String recPositon;

	private String recPerBom;

	private String recPerTop;

	private String recExper;

	private String recType;

	private String recSalaryBom;

	private String recSalaryTop;

	private String recAddr;

	private String recDegree;

	private String recPluses;

	private String recRequest;

	private String recDesc;

	private String recAccEmail;

	private String recMemoInfo;

	private String recCreateTime;

	private String recStopFlag;

	public Integer getRecId() {
		return recId;
	}

	public void setRecId(Integer recId) {
		this.recId = recId;
	}

	public Integer getCoId() {
		return coId;
	}

	public void setCoId(Integer coId) {
		this.coId = coId;
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode == null ? null : jobCode.trim();
	}

	public String getRecName() {
		return recName;
	}

	public void setRecName(String recName) {
		this.recName = recName == null ? null : recName.trim();
	}

	public String getRecPositon() {
		return recPositon;
	}

	public void setRecPositon(String recPositon) {
		this.recPositon = recPositon == null ? null : recPositon.trim();
	}

	public String getRecPerBom() {
		return recPerBom;
	}

	public void setRecPerBom(String recPerBom) {
		this.recPerBom = recPerBom == null ? null : recPerBom.trim();
	}

	public String getRecPerTop() {
		return recPerTop;
	}

	public void setRecPerTop(String recPerTop) {
		this.recPerTop = recPerTop == null ? null : recPerTop.trim();
	}

	public String getRecExper() {
		return recExper;
	}

	public void setRecExper(String recExper) {
		this.recExper = recExper == null ? null : recExper.trim();
	}

	public String getRecType() {
		return recType;
	}

	public void setRecType(String recType) {
		this.recType = recType == null ? null : recType.trim();
	}

	public String getRecSalaryBom() {
		return recSalaryBom;
	}

	public void setRecSalaryBom(String recSalaryBom) {
		this.recSalaryBom = recSalaryBom == null ? null : recSalaryBom.trim();
	}

	public String getRecSalaryTop() {
		return recSalaryTop;
	}

	public void setRecSalaryTop(String recSalaryTop) {
		this.recSalaryTop = recSalaryTop == null ? null : recSalaryTop.trim();
	}

	public String getRecAddr() {
		return recAddr;
	}

	public void setRecAddr(String recAddr) {
		this.recAddr = recAddr == null ? null : recAddr.trim();
	}

	public String getRecDegree() {
		return recDegree;
	}

	public void setRecDegree(String recDegree) {
		this.recDegree = recDegree == null ? null : recDegree.trim();
	}

	public String getRecPluses() {
		return recPluses;
	}

	public void setRecPluses(String recPluses) {
		this.recPluses = recPluses == null ? null : recPluses.trim();
	}

	public String getRecRequest() {
		return recRequest;
	}

	public void setRecRequest(String recRequest) {
		this.recRequest = recRequest == null ? null : recRequest.trim();
	}

	public String getRecDesc() {
		return recDesc;
	}

	public void setRecDesc(String recDesc) {
		this.recDesc = recDesc == null ? null : recDesc.trim();
	}

	public String getRecAccEmail() {
		return recAccEmail;
	}

	public void setRecAccEmail(String recAccEmail) {
		this.recAccEmail = recAccEmail == null ? null : recAccEmail.trim();
	}

	public String getRecMemoInfo() {
		return recMemoInfo;
	}

	public void setRecMemoInfo(String recMemoInfo) {
		this.recMemoInfo = recMemoInfo == null ? null : recMemoInfo.trim();
	}



	public String getRecCreateTime() {
		return recCreateTime;
	}

	public void setRecCreateTime(String recCreateTime) {
		this.recCreateTime = recCreateTime;
	}

	public String getRecStopFlag() {
		return recStopFlag;
	}

	public void setRecStopFlag(String recStopFlag) {
		this.recStopFlag = recStopFlag == null ? null : recStopFlag.trim();
	}
}