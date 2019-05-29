package com.qfedu.vo;

import java.util.List;

// 如果当初父菜单类
public class VMenuInfo {

	private Integer menuId;
	private String menuName;
	private String menuUrl;
	// 子菜单列表
	private List<VMenuInfo> menuList;
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	public List<VMenuInfo> getMenuList() {
		return menuList;
	}
	public void setMenuList(List<VMenuInfo> menuList) {
		this.menuList = menuList;
	}

	
	
}
