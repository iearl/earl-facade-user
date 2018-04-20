package com.ants.facade.user.service;

import java.util.List;

import com.ants.facade.user.entity.TMenuInfo;
/**
 * 
* @ClassName: TMenuInfoFacade  
* @Description: TODO(菜单对外提供的服务)  
* @author 马高伟
* @date 2018年4月10日  
*
 */
public interface TMenuInfoFacade {
	
	//查询所有菜单
	List<TMenuInfo> selectListTMenuInfo();
	
	/*int deleteByPrimaryKey(Integer menuId);

	int insert(TMenuInfo record);
	

	int insertSelective(TMenuInfo record);

	TMenuInfo selectByPrimaryKey(Integer menuId);

	int updateByPrimaryKeySelective(TMenuInfo record);

	int updateByPrimaryKey(TMenuInfo record);*/
}