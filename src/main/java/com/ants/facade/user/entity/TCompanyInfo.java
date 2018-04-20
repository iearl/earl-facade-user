package com.ants.facade.user.entity;

import java.util.Date;

import com.ants.common.entity.BaseEntity;

public class TCompanyInfo extends BaseEntity{

	private static final long serialVersionUID = 201804151653L;

	private Integer coId;

	private Integer uId;

	private String coName;

	private String coSimpName;

	private String coUrl;

	private String coLogoPath;

	private String coCity;

	private String coDomain;

	private String coSize;

	private String coStage;

	private String coAddr;

	private String coIntroduce;

	private String coMemoInfo;

	private Date coCreateTime;

	private String coStopFalg;

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

	public String getCoName() {
		return coName;
	}

	public void setCoName(String coName) {
		this.coName = coName == null ? null : coName.trim();
	}

	public String getCoSimpName() {
		return coSimpName;
	}

	public void setCoSimpName(String coSimpName) {
		this.coSimpName = coSimpName == null ? null : coSimpName.trim();
	}

	public String getCoUrl() {
		return coUrl;
	}

	public void setCoUrl(String coUrl) {
		this.coUrl = coUrl == null ? null : coUrl.trim();
	}

	public String getCoLogoPath() {
		return coLogoPath;
	}

	public void setCoLogoPath(String coLogoPath) {
		this.coLogoPath = coLogoPath == null ? null : coLogoPath.trim();
	}

	public String getCoCity() {
		return coCity;
	}

	public void setCoCity(String coCity) {
		this.coCity = coCity == null ? null : coCity.trim();
	}

	public String getCoDomain() {
		return coDomain;
	}

	public void setCoDomain(String coDomain) {
		this.coDomain = coDomain == null ? null : coDomain.trim();
	}

	public String getCoSize() {
		return coSize;
	}

	public void setCoSize(String coSize) {
		this.coSize = coSize == null ? null : coSize.trim();
	}

	public String getCoStage() {
		return coStage;
	}

	public void setCoStage(String coStage) {
		this.coStage = coStage == null ? null : coStage.trim();
	}

	public String getCoAddr() {
		return coAddr;
	}

	public void setCoAddr(String coAddr) {
		this.coAddr = coAddr == null ? null : coAddr.trim();
	}

	public String getCoIntroduce() {
		return coIntroduce;
	}

	public void setCoIntroduce(String coIntroduce) {
		this.coIntroduce = coIntroduce == null ? null : coIntroduce.trim();
	}

	public String getCoMemoInfo() {
		return coMemoInfo;
	}

	public void setCoMemoInfo(String coMemoInfo) {
		this.coMemoInfo = coMemoInfo == null ? null : coMemoInfo.trim();
	}

	public Date getCoCreateTime() {
		return coCreateTime;
	}

	public void setCoCreateTime(Date coCreateTime) {
		this.coCreateTime = coCreateTime;
	}

	public String getCoStopFalg() {
		return coStopFalg;
	}

	public void setCoStopFalg(String coStopFalg) {
		this.coStopFalg = coStopFalg == null ? null : coStopFalg.trim();
	}
}