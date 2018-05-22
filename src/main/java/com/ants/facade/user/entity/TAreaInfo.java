package com.ants.facade.user.entity;

import java.util.Date;

import com.ants.common.entity.BaseEntity;

public class TAreaInfo extends BaseEntity{
    /**
	 * 
	 */
	private static final long serialVersionUID = 201804132026L;

	private Integer areaId;

    private String areaCode;

    private String areaName;

    private Integer areaProvinceId;

    private Integer areaCityId;

    private Integer areaShowOrder;

    private String areaMemoInfo;

    private String areaCreateTime;

    private String areaStopFlag;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Integer getAreaProvinceId() {
        return areaProvinceId;
    }

    public void setAreaProvinceId(Integer areaProvinceId) {
        this.areaProvinceId = areaProvinceId;
    }

    public Integer getAreaCityId() {
        return areaCityId;
    }

    public void setAreaCityId(Integer areaCityId) {
        this.areaCityId = areaCityId;
    }

    public Integer getAreaShowOrder() {
        return areaShowOrder;
    }

    public void setAreaShowOrder(Integer areaShowOrder) {
        this.areaShowOrder = areaShowOrder;
    }

    public String getAreaMemoInfo() {
        return areaMemoInfo;
    }

    public void setAreaMemoInfo(String areaMemoInfo) {
        this.areaMemoInfo = areaMemoInfo == null ? null : areaMemoInfo.trim();
    }



    /**
	 * @return the areaCreateTime
	 */
	public String getAreaCreateTime() {
		return areaCreateTime;
	}

	/**
	 * @param areaCreateTime the areaCreateTime to set
	 */
	public void setAreaCreateTime(String areaCreateTime) {
		this.areaCreateTime = areaCreateTime;
	}

	public String getAreaStopFlag() {
        return areaStopFlag;
    }

    public void setAreaStopFlag(String areaStopFlag) {
        this.areaStopFlag = areaStopFlag == null ? null : areaStopFlag.trim();
    }
}