package com.ants.facade.user.entity;

import java.util.Date;
import java.util.List;

import com.ants.common.entity.BaseEntity;
import com.ants.facade.user.service.TWorkShowFacade;

/**
 * 
* @ClassName: TAlyInfo  
* @Description: TODO(求职会员简历信息类)  
* @author 马高伟
* @date 2018年4月21日  
*
 */
public class TAlyInfo extends BaseEntity {
	private static final long serialVersionUID = 201804210849L;

	private Integer alyId;

	private Integer uId;

	private String alyPolitical;

	private String alyDegree;

	private String alyShcool;

	private String alyProfession;

	private Date alyGraduation;

	private String alyJobStatue;

	private String alySalaryBom;

	private String alySalaryTop;

	private String alySkill;

	private String alyVal;

	private Date alyCreateTime;

	private String alyStopFlag;

	private byte[] alyMemoInfo;
	

	public Integer getAlyId() {
		return alyId;
	}

	public void setAlyId(Integer alyId) {
		this.alyId = alyId;
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getAlyPolitical() {
		return alyPolitical;
	}

	public void setAlyPolitical(String alyPolitical) {
		this.alyPolitical = alyPolitical == null ? null : alyPolitical.trim();
	}

	public String getAlyDegree() {
		return alyDegree;
	}

	public void setAlyDegree(String alyDegree) {
		this.alyDegree = alyDegree == null ? null : alyDegree.trim();
	}

	public String getAlyShcool() {
		return alyShcool;
	}

	public void setAlyShcool(String alyShcool) {
		this.alyShcool = alyShcool == null ? null : alyShcool.trim();
	}

	public String getAlyProfession() {
		return alyProfession;
	}

	public void setAlyProfession(String alyProfession) {
		this.alyProfession = alyProfession == null ? null : alyProfession
				.trim();
	}

	public Date getAlyGraduation() {
		return alyGraduation;
	}

	public void setAlyGraduation(Date alyGraduation) {
		this.alyGraduation = alyGraduation;
	}

	public String getAlyJobStatue() {
		return alyJobStatue;
	}

	public void setAlyJobStatue(String alyJobStatue) {
		this.alyJobStatue = alyJobStatue == null ? null : alyJobStatue.trim();
	}

	public String getAlySalaryBom() {
		return alySalaryBom;
	}

	public void setAlySalaryBom(String alySalaryBom) {
		this.alySalaryBom = alySalaryBom == null ? null : alySalaryBom.trim();
	}

	public String getAlySalaryTop() {
		return alySalaryTop;
	}

	public void setAlySalaryTop(String alySalaryTop) {
		this.alySalaryTop = alySalaryTop == null ? null : alySalaryTop.trim();
	}

	public String getAlySkill() {
		return alySkill;
	}

	public void setAlySkill(String alySkill) {
		this.alySkill = alySkill == null ? null : alySkill.trim();
	}

	public String getAlyVal() {
		return alyVal;
	}

	public void setAlyVal(String alyVal) {
		this.alyVal = alyVal == null ? null : alyVal.trim();
	}

	public Date getAlyCreateTime() {
		return alyCreateTime;
	}

	public void setAlyCreateTime(Date alyCreateTime) {
		this.alyCreateTime = alyCreateTime;
	}

	public String getAlyStopFlag() {
		return alyStopFlag;
	}

	public void setAlyStopFlag(String alyStopFlag) {
		this.alyStopFlag = alyStopFlag == null ? null : alyStopFlag.trim();
	}

	public byte[] getAlyMemoInfo() {
		return alyMemoInfo;
	}

	public void setAlyMemoInfo(byte[] alyMemoInfo) {
		this.alyMemoInfo = alyMemoInfo;
	}
}