package com.ants.facade.user.entity;

import java.util.Date;

import com.ants.common.entity.BaseEntity;
/**
 * 
* @ClassName: TUserInfo  
* @Description: TODO(用户信息表实体类)  
* @author 马高伟
* @date 2018年4月4日  
*
 */
public class TUserInfo extends BaseEntity{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer uId;//用户id

    private String uName;//用户名

    private String uPwd;//密码

    private String uType;//用户类型 0:求职会员 1:公司会员 2:管理员

    private String uPhoneNo;//手机号码，用于短信验证码登录

    private String uEmail;//邮箱，可直接使用邮箱登录

    private String uQuestion;//找回密码问题

    private String uAnswer;//找回密码答案

    private Date uLastTime;//上次登录时间

    private Integer uErrCount;//连续输入三次错误密码，账号冻结

    private String uStatue;//是否被冻结(连续输入三次错误密码冻结) 0:正常 9:冻结

    private String uMemoInfo;//备注

    private Date uCreateTime;//创建时间

    private String uStopFlag;//是否可用: 0:可用，9:删除

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    public String getuType() {
        return uType;
    }

    public void setuType(String uType) {
        this.uType = uType == null ? null : uType.trim();
    }

    public String getuPhoneNo() {
        return uPhoneNo;
    }

    public void setuPhoneNo(String uPhoneNo) {
        this.uPhoneNo = uPhoneNo == null ? null : uPhoneNo.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public String getuQuestion() {
        return uQuestion;
    }

    public void setuQuestion(String uQuestion) {
        this.uQuestion = uQuestion == null ? null : uQuestion.trim();
    }

    public String getuAnswer() {
        return uAnswer;
    }

    public void setuAnswer(String uAnswer) {
        this.uAnswer = uAnswer == null ? null : uAnswer.trim();
    }

    public Date getuLastTime() {
        return uLastTime;
    }

    public void setuLastTime(Date uLastTime) {
        this.uLastTime = uLastTime;
    }

    public Integer getuErrCount() {
        return uErrCount;
    }

    public void setuErrCount(Integer uErrCount) {
        this.uErrCount = uErrCount;
    }

    public String getuStatue() {
        return uStatue;
    }

    public void setuStatue(String uStatue) {
        this.uStatue = uStatue == null ? null : uStatue.trim();
    }

    public String getuMemoInfo() {
        return uMemoInfo;
    }

    public void setuMemoInfo(String uMemoInfo) {
        this.uMemoInfo = uMemoInfo == null ? null : uMemoInfo.trim();
    }

    public Date getuCreateTime() {
        return uCreateTime;
    }

    public void setuCreateTime(Date uCreateTime) {
        this.uCreateTime = uCreateTime;
    }

    public String getuStopFlag() {
        return uStopFlag;
    }

    public void setuStopFlag(String uStopFlag) {
        this.uStopFlag = uStopFlag == null ? null : uStopFlag.trim();
    }
}