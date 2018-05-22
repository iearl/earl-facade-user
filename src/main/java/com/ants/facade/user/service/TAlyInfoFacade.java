package com.ants.facade.user.service;

import java.util.List;
import java.util.Map;

import com.ants.facade.user.entity.TAlyInfo;
import com.ants.facade.user.entity.TFeedInfo;

/**  
 * @ClassName: TAlyInfoFacade  
 * @Description: TODO(简历信息类提供服务接口)  
 * @author 马高伟
 * @date 2018年4月21日  
 *    
 */
public interface TAlyInfoFacade {
	
	//管理员查看简历信息
	public List<TAlyInfo> selectManageAlyInfoByMapList(Map<String, Object> testMap);
	public long selectManageAlyInfoByMapCount(Map<String, Object> testMap);
	
	//根据条件查询最近七天的简历发布数
	public List<Map<String,String>> searchSevenDayCount(Map<String,String> map);
	
	//插入简历信息
	long insert(TAlyInfo record);
	
	//查询当前登录人的简历
	TAlyInfo selectTAlyInfoByUId(Integer uId);

    int deleteByPrimaryKey(Integer alyId);

    int insertSelective(TAlyInfo record);

    TAlyInfo selectByPrimaryKey(Integer alyId);

    int updateByPrimaryKeySelective(TAlyInfo record);

    int updateByPrimaryKeyWithBLOBs(TAlyInfo record);

    int updateByPrimaryKey(TAlyInfo record);
}
