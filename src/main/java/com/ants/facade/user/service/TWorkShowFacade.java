package com.ants.facade.user.service;

import com.ants.facade.user.entity.TWorkShow;

/**  
 * @ClassName: TWorkShowFacade  
 * @Description: TODO(工作经验服务接口)  
 * @author 马高伟
 * @date 2018年4月19日  
 *    
 */
public interface TWorkShowFacade {
    int deleteByPrimaryKey(Integer workId);

    long insert(TWorkShow record);

    int insertSelective(TWorkShow record);

    TWorkShow selectByPrimaryKey(Integer workId);

    int updateByPrimaryKeySelective(TWorkShow record);

    int updateByPrimaryKey(TWorkShow record);
}
