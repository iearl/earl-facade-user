package com.ants.facade.user.service;

import java.util.Map;

import com.ants.common.page.PageBean;
import com.ants.common.page.PageParam;
import com.ants.facade.user.entity.UserInfo;



public interface UserInfoFacade {
	
    //根据userId查找用户信息
    UserInfo findUserByUserId(String userId);
    
    //根据条件查询记录数
    Long getTotal(Map<String,Object> map); 
    
    //查询并分页列出用户信息
    PageBean listPage(PageParam pageParam, Map<String, Object> paramMap);
}