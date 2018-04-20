package com.ants.facade.user.entity;

import java.util.Date;

import com.ants.common.entity.BaseEntity;

/**
 * 
 * @ClassName: TBaseInfo
 * @Description: TODO(用户基础信息实体类)
 * @author 马高伟
 * @date 2018年4月13日
 *
 */
public class TBaseInfo extends BaseEntity {

	private static final long serialVersionUID = 201804131456L;

	private Integer buId;// 基础表id

	private Integer uId;// 用户表id

	private String buName;// 用户真实姓名

	private String buPicPath;// 用户头像地址

	private Date buBirthday;// 用户生日

	private String buSex;// 用户性别 0:男 1：女

	private String buNational;// 用户民族

	private String buNative;// 用户籍贯

	private String buDetailAddr;// 详细地址

	private String buMemo;// 备注

	private Date buCreateTime;// 创建时间

	private String buStopFlag;// 是否可用 0:正常 9：停用

	public Integer getBuId() {
		return buId;
	}

	public void setBuId(Integer buId) {
		this.buId = buId;
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getBuName() {
		return buName;
	}

	public void setBuName(String buName) {
		this.buName = buName == null ? null : buName.trim();
	}

	public String getBuPicPath() {
		return buPicPath;
	}

	public void setBuPicPath(String buPicPath) {
		this.buPicPath = buPicPath == null ? null : buPicPath.trim();
	}

	public Date getBuBirthday() {
		return buBirthday;
	}

	public void setBuBirthday(Date buBirthday) {
		this.buBirthday = buBirthday;
	}

	public String getBuSex() {
		return buSex;
	}

	public void setBuSex(String buSex) {
		this.buSex = buSex == null ? null : buSex.trim();
	}

	public String getBuNational() {
		return buNational;
	}

	public void setBuNational(String buNational) {
		this.buNational = buNational == null ? null : buNational.trim();
	}

	public String getBuNative() {
		return buNative;
	}

	public void setBuNative(String buNative) {
		this.buNative = buNative == null ? null : buNative.trim();
	}

	public String getBuDetailAddr() {
		return buDetailAddr;
	}

	public void setBuDetailAddr(String buDetailAddr) {
		this.buDetailAddr = buDetailAddr;
	}

	public String getBuMemo() {
		return buMemo;
	}

	public void setBuMemo(String buMemo) {
		this.buMemo = buMemo == null ? null : buMemo.trim();
	}

	public Date getBuCreateTime() {
		return buCreateTime;
	}

	public void setBuCreateTime(Date buCreateTime) {
		this.buCreateTime = buCreateTime;
	}

	public String getBuStopFlag() {
		return buStopFlag;
	}

	public void setBuStopFlag(String buStopFlag) {
		this.buStopFlag = buStopFlag == null ? null : buStopFlag.trim();
	}
}