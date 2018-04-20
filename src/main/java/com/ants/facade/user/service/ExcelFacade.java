package com.ants.facade.user.service;

/**
 * @ClassName: ExcelFacade
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月8日
 * 
 */
public interface ExcelFacade {

	public void exportExcel(String sql, String[] titles);

}