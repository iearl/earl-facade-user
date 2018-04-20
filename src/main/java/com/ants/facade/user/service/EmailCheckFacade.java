package com.ants.facade.user.service;

import java.util.Date;


/**  
 * @ClassName: EmailCheckFacade  
 * @Description: TODO(邮箱校验的Dubbo服务接口)  
 * @author 马高伟
 * @date 2018年4月4日  
 *    
 */
public interface EmailCheckFacade {
	//用户注册时邮箱检验
	public boolean registerMail(String toMail, String code, Date date);
	//用户找回密码时邮箱检验
	public boolean resetMail(String toMail, String code, Date date);
}
