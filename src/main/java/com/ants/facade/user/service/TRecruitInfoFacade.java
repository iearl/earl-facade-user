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
    int deleteByPrimaryKey(Integer recId);
    
    List<TRecruitInfo> selectByMap(Map<String, Integer> testMap);
    
    long getTotal(Map<String, Integer> testMap);

    long insert(TRecruitInfo record);

    int insertSelective(TRecruitInfo record);

    TRecruitInfo selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(TRecruitInfo record);

    int updateByPrimaryKey(TRecruitInfo record);
}
