package com.qfedu.service;

import java.util.List;

import com.qfedu.vo.VMenuInfo;
import com.qfedu.vo.VTreeInfo;

public interface SysRightService {

	public List<VMenuInfo> findMenu(int roleId);
	
	public List<VTreeInfo> findTreeNode(Integer roleId);
	
	public void changeRightInfo(Integer roleId, Integer[] rightCodes);
}
