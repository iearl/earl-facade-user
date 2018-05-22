package com.ants.facade.user.entity;

import java.util.Date;

import com.ants.common.entity.BaseEntity;

public class Log extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private Integer logId;//日志id
	private String loginAccount;//当前操作人id
	private String loginIp;//当前操作人ip
	private String actionUrl;//操作请求的链接
	private String module;//执行的模块
	private String method;//执行的方法
	private Long actionTime;//执行操作时间
	private String description;//描述
	private Date gmtCreate;//执行的时间
	private Short state;//该操作状态，1表示成功，-1表示失败！

	/**
	 * @return the logId
	 */
	public Integer getLogId() {
		return logId;
	}

	/**
	 * @param logId the logId to set
	 */
	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	/**
	 * @return the loginAccount
	 */
	public String getLoginAccount() {
		return loginAccount;
	}

	/**
	 * @param loginAccount
	 *            the loginAccount to set
	 */
	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}

	/**
	 * @return the loginIp
	 */
	public String getLoginIp() {
		return loginIp;
	}

	/**
	 * @param loginIp
	 *            the loginIp to set
	 */
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	/**
	 * @return the actionUrl
	 */
	public String getActionUrl() {
		return actionUrl;
	}

	/**
	 * @param actionUrl
	 *            the actionUrl to set
	 */
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	/**
	 * @return the module
	 */
	public String getModule() {
		return module;
	}

	/**
	 * @param module
	 *            the module to set
	 */
	public void setModule(String module) {
		this.module = module;
	}

	/**
	 * @return the method
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * @param method
	 *            the method to set
	 */
	public void setMethod(String method) {
		this.method = method;
	}

	/**
	 * @return the actionTime
	 */
	public Long getActionTime() {
		return actionTime;
	}

	/**
	 * @param actionTime
	 *            the actionTime to set
	 */
	public void setActionTime(Long actionTime) {
		this.actionTime = actionTime;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the gmtCreate
	 */
	public Date getGmtCreate() {
		return gmtCreate;
	}

	/**
	 * @param gmtCreate
	 *            the gmtCreate to set
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	/**
	 * @return the state
	 */
	public Short getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(Short state) {
		this.state = state;
	}

}