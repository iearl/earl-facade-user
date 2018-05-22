package com.ants.facade.user.service;

import java.util.List;
import java.util.Map;

import com.ants.common.page.PageBean;
import com.ants.common.page.PageParam;
import com.ants.facade.user.entity.TAreaInfo;
import com.ants.facade.user.entity.TJobInfo;

/**
 * @ClassName: TJobInfoFacede
 * @Description: TODO(关于职位信息的处理)
 * @author 马高伟
 * @date 2018年4月6日
 * 
 */
public interface TJobInfoFacede {
	
	// 查询所有职位分类信息
	List<TAreaInfo> selectTJobInfoList(Map<String, Object> map);

	long selectTJobInfoCount(Map<String, Object> map);
	
	//根据职位分类ID查找自己包括上级目录的职位名
	List<Map<String,String>> searchJobNameById(Map<String,String> mapCon);
	
	//联动查询职位类别
	List<TJobInfo> selectTJobList (String jobId);
	
	//查询职位分类信息
    List<TJobInfo> selectByPrimaryKey(Integer jobId);
    
    List<TJobInfo> selectByMap(Map<String, Integer> map);
    
    Long getTotal(Map<String, Integer> map);
    
    //分页查询职位分类信息
    public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap);

   /* int deleteByPrimaryKey(Integer jobId);
    
    int insert(TJobInfo record);
    
    int insertSelective(TJobInfo record);
    
    int updateByPrimaryKeySelective(TJobInfo record);

    int updateByPrimaryKey(TJobInfo record);*/
}
