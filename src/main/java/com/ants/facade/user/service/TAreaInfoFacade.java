/**  

 * <p>Title: TAreaInfoFacade.java</p>  

 * <p>Description: </p>  

 * <p>Copyright: Copyright (c) 2018</p>  

 * <p>Company: www.baidudu.com</p>  

 * @author shenlan  

 * @date 2018年4月13日  

 * @version 1.0  

 */
package com.ants.facade.user.service;

import java.util.List;
import java.util.Map;

import com.ants.facade.user.entity.TAreaInfo;

/**
 * @ClassName: TAreaInfoFacade
 * @Description: TODO(区域信息接口)
 * @author 马高伟
 * @date 2018年4月13日
 * 
 */
public interface TAreaInfoFacade {
	
	//查询所有区域信息
	List<TAreaInfo>selectTAreaInfoList(Map<String,Object> map);
	long selectTAreaInfoCount(Map<String,Object> map);
	//根据职位分类ID查找自己包括上级目录的职位名
	List<Map<String,String>> searchAreaNameById(Map<String,String> mapCon);
	
	List<TAreaInfo> selectTAreaList(String province);
	
	int deleteByPrimaryKey(Integer areaId);

	int insert(TAreaInfo record);

	int insertSelective(TAreaInfo record);

	TAreaInfo selectByPrimaryKey(Integer areaId);

	int updateByPrimaryKeySelective(TAreaInfo record);

	int updateByPrimaryKey(TAreaInfo record);
}
