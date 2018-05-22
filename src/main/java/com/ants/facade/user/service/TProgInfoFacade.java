package com.ants.facade.user.service;

import java.util.List;
import java.util.Map;

import com.ants.facade.user.entity.TProgInfo;

/**
 * @ClassName: TProgInfoFacade
 * @Description: TODO(职位投递接口)
 * @author 马高伟
 * @date 2018年4月13日
 * 
 */
public interface TProgInfoFacade {
	
	public List<TProgInfo> selectManageProgInfoByMapList(Map<String, Object> map);
	public long selectManageProgInfoByMapCount(Map<String, Object> map);
	
	//在easyui上显示投递信息
	List<TProgInfo> selectTProgInfoByMap(Map<String, Object> map);
	
	//删除投递记录
	long deleteProgInfoByList(List<String> list);
	
	List<TProgInfo> selectByMap(Map<String, Object> map);

	int deleteByPrimaryKey(Integer progId);

	long insert(TProgInfo record);

	int insertSelective(TProgInfo record);

	TProgInfo selectByPrimaryKey(Integer progId);

	int updateByPrimaryKeySelective(TProgInfo record);

	int updateByPrimaryKey(TProgInfo record);
}
