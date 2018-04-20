package com.ants.facade.user.service;

import com.ants.facade.user.entity.TUserInfo;

/**  
 * @ClassName: TUserInfoFacade  
 * @Description: TODO(用户登录时Dubbo服务接口)  
 * @author 马高伟
 * @date 2018年4月4日  
 *    
 */
public interface TUserInfoFacade {
	
	//登录时根据用户名、邮箱或者手机号查找用户信息
	public TUserInfo findUserByUserId(String sqlName, String parameter);
    
	//更新用户信息
    public int updateUserInfo(String sqlName, TUserInfo user);
    
    //插入用户信息
    public void insertUserInfo(TUserInfo userInfo);
    
  
    
}
