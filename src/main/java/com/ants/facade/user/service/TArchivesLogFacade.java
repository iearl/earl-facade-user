package com.ants.facade.user.service;

import java.util.List;
import java.util.Map;

import com.ants.facade.user.entity.TArchivesLog;
/**  
 * @ClassName: TArchivesLogFacade  
 * @Description: TODO(日志信息类提供服务接口)  
 * @author 马高伟
 * @date 2018年4月21日  
 *    
 */
public interface TArchivesLogFacade {
	//查询日志信息
	List<TArchivesLog> selectTArchivesLogByMap(Map<String, Object> testMap);

	long getTotal(Map<String, Object> testMap);
	
	long insert(TArchivesLog record);
	
	List<TArchivesLog> searchLogInfoByMap(Map<String,Object> map);

    int deleteByPrimaryKey(Integer logId);


    int insertSelective(TArchivesLog record);

    TArchivesLog selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(TArchivesLog record);

    int updateByPrimaryKey(TArchivesLog record);
}