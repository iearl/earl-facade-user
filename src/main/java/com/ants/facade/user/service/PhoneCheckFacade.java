package com.ants.facade.user.service;

import java.util.Date;


/**  
 * @ClassName: PhoneCheckFacade  
 * @Description: TODO(手机号码的Dubbo服务接口)  
 * @author 马高伟
 * @date 2018年4月4日  
 *    
 */
public interface PhoneCheckFacade {
	//用户注册时邮箱检验
	public boolean registerPhone(String phoneNumber, String authCode);
	//用户找回密码时邮箱检验
	public boolean quickLoginPhone(String phoneNumber, String authCode);
}
