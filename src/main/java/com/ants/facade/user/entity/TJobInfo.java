package com.ants.facade.user.entity;

import java.util.Date;

import com.ants.common.entity.BaseEntity;
/**
 * 
* @ClassName: TJobInfo  
* @Description: TODO(职位类实体)  
* @author 马高伟
* @date 2018年4月6日  
*
 */
public class TJobInfo extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer jobId;//职位ID

	private String jobType;//职位分类

	private String jobName;//职位名称

	private Integer motherId;//上级职位ID，若没有上级职位，motherId是0

	private String jobLevel;//职位等级

	private String jobMemo;//备注

	private Date jobCreateTime;//职位创建时间

	private String jobStopFlag;//职位是否通用 0：正常 9：停用

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType == null ? null : jobType.trim();
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName == null ? null : jobName.trim();
	}

	public Integer getMotherId() {
		return motherId;
	}

	public void setMotherId(Integer motherId) {
		this.motherId = motherId;
	}

	public String getJobLevel() {
		return jobLevel;
	}

	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel == null ? null : jobLevel.trim();
	}

	public String getJobMemo() {
		return jobMemo;
	}

	public void setJobMemo(String jobMemo) {
		this.jobMemo = jobMemo == null ? null : jobMemo.trim();
	}

	public Date getJobCreateTime() {
		return jobCreateTime;
	}

	public void setJobCreateTime(Date jobCreateTime) {
		this.jobCreateTime = jobCreateTime;
	}

	public String getJobStopFlag() {
		return jobStopFlag;
	}

	public void setJobStopFlag(String jobStopFlag) {
		this.jobStopFlag = jobStopFlag == null ? null : jobStopFlag.trim();
	}
}