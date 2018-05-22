package com.ants.facade.user.service;

import java.util.List;
import java.util.Map;

import com.ants.facade.user.entity.TAreaInfo;
import com.ants.facade.user.entity.TSubInfo;

/**
 * @ClassName: TSubInfoFacade
 * @Description: TODO(学科信息操作类)
 * @author 马高伟
 * @date 2018年4月21日
 * 
 */
public interface TSubInfoFacade {

	// 查询所有学科信息
	List<TAreaInfo> selectTSubInfoList(Map<String, Object> map);

	long selectTSubInfoCount(Map<String, Object> map);

	List<Map<String, String>> selectTSubInfoByMap(Map<String, String> subMap);

	List<Map<String, String>> selectSubNameBySubThree(Map<String, String> map);

	int deleteByPrimaryKey(String subId);

	int insert(TSubInfo record);

	int insertSelective(TSubInfo record);

	TSubInfo selectByPrimaryKey(String subId);

	int updateByPrimaryKeySelective(TSubInfo record);

	int updateByPrimaryKey(TSubInfo record);
}
