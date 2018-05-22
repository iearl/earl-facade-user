package com.ants.facade.user.service;

import java.util.List;
import java.util.Map;

import com.ants.facade.user.entity.TRecruitInfo;
import com.ants.facade.user.entity.TWorkShow;

/**  
 * @ClassName: TWorkShowFacade  
 * @Description: TODO(工作经验服务接口)  
 * @author 马高伟
 * @date 2018年4月19日  
 *    
 */
public interface TWorkShowFacade {
	
	public List<TWorkShow> selectManageWorkShowInfoByMapList(Map<String, Object> map);
	public long selectManageWorkShowInfoByMapCount(Map<String, Object> map);
	
	long insert(TWorkShow record);
	
	List<Map<String,String>> selectTWorkShowListByUId(Integer uId);

    int deleteByPrimaryKey(Integer workId);

    int insertSelective(TWorkShow record);

    TWorkShow selectByPrimaryKey(Integer workId);

    int updateByPrimaryKeySelective(TWorkShow record);

    int updateByPrimaryKey(TWorkShow record);
}
