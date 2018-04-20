package com.ants.facade.user.service;

import com.ants.facade.user.entity.TBaseInfo;

/**  
 * @ClassName: TBaseInfoFacade 
 * @Description: TODO(用户基础信息操作接口)  
 * @author 马高伟
 * @date 2018年4月13日  
 *    
 */
public interface TBaseInfoFacade {
    int deleteByPrimaryKey(Integer uId);

    Long insert(TBaseInfo record);

    int insertSelective(TBaseInfo record);

    TBaseInfo selectByPrimaryKey(Integer buId);

    int updateByPrimaryKeySelective(TBaseInfo record);

    long updateByPrimaryKey(TBaseInfo record);
}
