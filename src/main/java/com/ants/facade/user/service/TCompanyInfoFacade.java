package com.ants.facade.user.service;

import java.util.List;
import java.util.Map;

import com.ants.facade.user.entity.TCompanyInfo;

/**
 * @ClassName: TCompanyInfoFacade
 * @Description: TODO(公司信息类服务接口)
 * @author 马高伟
 * @date 2018年4月15日
 * 
 */
public interface TCompanyInfoFacade {
	
	public List<TCompanyInfo> selectManageCoInfoByMapList(Map<String,Object> map);
	public long selectManageCoInfoByMapCount(Map<String,Object> map);
	
	TCompanyInfo selectTComInfoByUMap(Map<String,Object> map);
	
	TCompanyInfo selectTComInfoByUId(Integer uId);
	
	int updateByPrimaryKey(TCompanyInfo record);
	
	int deleteByPrimaryKey(Integer coId);

	long insert(TCompanyInfo record);

	int insertSelective(TCompanyInfo record);

	TCompanyInfo selectByPrimaryKey(Integer coId);

	int updateByPrimaryKeySelective(TCompanyInfo record);


}
