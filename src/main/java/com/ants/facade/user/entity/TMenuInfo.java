package com.ants.facade.user.entity;

import java.util.Date;
import java.util.List;

import com.ants.common.entity.BaseEntity;

/**
 * 
 * @ClassName: TMenuInfo
 * @Description: TODO(菜单实体)
 * @author 马高伟
 * @date 2018年4月10日
 *
 */
public class TMenuInfo extends BaseEntity {
	private Integer menuId;// 菜单ID

	private String menuname;// 菜单内容

	private Integer motherId;// 上级菜单名称

	private String menuUrl;// 菜单url

	private String isLeaf;// 是否是叶子

	private String menuIcon;// 菜单图标

	private String memuMemoInfo;// 备注

	private Date menuCreateTime;// 菜单创建时间

	private String menuStopFlag;// 是否停用 0：正常 9：停用

	private List<TMenuInfo> menus; // 当前菜单的子菜单

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public String getMenuname() {
		return menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}

	public Integer getMotherId() {
		return motherId;
	}

	public void setMotherId(Integer motherId) {
		this.motherId = motherId;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl == null ? null : menuUrl.trim();
	}

	public String getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf == null ? null : isLeaf.trim();
	}

	public String getMenuIcon() {
		return menuIcon;
	}

	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon == null ? null : menuIcon.trim();
	}

	public String getMemuMemoInfo() {
		return memuMemoInfo;
	}

	public void setMemuMemoInfo(String memuMemoInfo) {
		this.memuMemoInfo = memuMemoInfo == null ? null : memuMemoInfo.trim();
	}

	public Date getMenuCreateTime() {
		return menuCreateTime;
	}

	public void setMenuCreateTime(Date menuCreateTime) {
		this.menuCreateTime = menuCreateTime;
	}

	public String getMenuStopFlag() {
		return menuStopFlag;
	}

	public void setMenuStopFlag(String menuStopFlag) {
		this.menuStopFlag = menuStopFlag;
	}

	public List<TMenuInfo> getMenus() {
		return menus;
	}

	public void setMenus(List<TMenuInfo> menus) {
		this.menus = menus;
	}

}