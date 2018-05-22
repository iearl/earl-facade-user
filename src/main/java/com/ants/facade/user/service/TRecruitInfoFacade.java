package com.ants.facade.user.service;

import java.util.List;
import java.util.Map;

import com.ants.facade.user.entity.TJobInfo;
import com.ants.facade.user.entity.TRecruitInfo;

/**
 * @ClassName: TRecruitInfoFacade
 * @Description: TODO(职位信息操作接口)
 * @author 马高伟
 * @date 2018年4月16日
 * 
 */
public interface TRecruitInfoFacade {
	
	public List<TRecruitInfo> selectManageRecInfoByMapList(Map<String, Object> map);
	public long selectManageAlyInfoByMapCount(Map<String, Object> map);

	// 根据条件查询最近七天的职位发布数
	public List<Map<String, String>> searchSevenDayCount(Map<String, String> map);

	long deleteTRecruitInfoByMap(List<Map<String, Object>> list);

	List<TRecruitInfo> selectByMap(Map<String, Object> testMap);

	long updateTRecruitInfoByRecId(TRecruitInfo record);

	long getTotal(Map<String, Object> testMap);

	long insert(TRecruitInfo record);

	int insertSelective(TRecruitInfo record);

	TRecruitInfo selectByPrimaryKey(Integer recId);

	int updateByPrimaryKey(TRecruitInfo record);
}
