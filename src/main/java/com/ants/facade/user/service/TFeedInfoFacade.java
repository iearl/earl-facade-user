package com.ants.facade.user.service;

import java.util.List;
import java.util.Map;

import com.ants.facade.user.entity.TFeedInfo;
import com.ants.facade.user.entity.TRecruitInfo;

/**
 * @ClassName: TFeedInfoFacade
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月23日
 * 
 */
public interface TFeedInfoFacade {
	
	//查询帮助反馈信息
	List<TFeedInfo> selectTFeedInfoByMap(Map<String, Object> testMap);

	long getTotal(Map<String, Object> testMap);
	
	long deleteByPrimaryKey(Integer fdId);

	long insert(TFeedInfo record);

	int insertSelective(TFeedInfo record);

	TFeedInfo selectByPrimaryKey(Integer fdId);

	int updateByPrimaryKeySelective(TFeedInfo record);

	long updateByPrimaryKey(TFeedInfo record);
}
