package com.ants.facade.user.service;

import java.util.List;
import java.util.Map;

import com.ants.facade.user.entity.TFeedInfo;
import com.ants.facade.user.entity.TUserInfo;

/**  
 * @ClassName: TUserInfoFacade  
 * @Description: TODO(用户登录时Dubbo服务接口)  
 * @author 马高伟
 * @date 2018年4月4日  
 *    
 */
public interface TUserInfoFacade {
	
	//管理员用户信息管理，查找求职会员和公司会员
	public List<TFeedInfo> selectManageUInfoByMapList(Map<String, Object> testMap);
	public long selectManageUInfoByMapCount(Map<String, Object> testMap);
	
	//根据条件查询最近七天的求职会员和公司会员注册数
	public List<Map<String,String>> searchSevenDayCount(Map<String,String> map);
	
	//登录时根据用户名、邮箱或者手机号查找用户信息
	public TUserInfo findUserByUserId(String sqlName, String parameter);
    
	//更新用户信息
    public int updateUserInfo(String sqlName, TUserInfo user);
    
    //插入用户信息
    public void insertUserInfo(TUserInfo userInfo);
    
  
    
}
