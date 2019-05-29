package com.qfedu.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qfedu.dao.SysRightMapper;
import com.qfedu.pojo.SysRight;
import com.qfedu.service.SysRightService;
import com.qfedu.vo.VMenuInfo;
import com.qfedu.vo.VTreeInfo;

@Service
public class SysRightServiceImpl implements SysRightService{

	@Autowired
	private SysRightMapper rightDao;
	
	@Override
	public List<VMenuInfo> findMenu(int roleId) {
		// TODO Auto-generated method stub
		return rightDao.selectMenu(roleId);
	}

	@Override
	public List<VTreeInfo> findTreeNode(Integer roleId) {
		// TODO Auto-generated method stub
		
		List<VTreeInfo> list = rightDao.selectAllTreeNode();
		List<Integer> clist = rightDao.selectCheckNodeId(roleId);
		
		if (clist != null) {
			for (VTreeInfo info : list) {
				if (clist.contains(info.getRightCode())) {
					info.setChecked(true);
				}
			}
		}
		
		return list;
	}

	@Override
	public void changeRightInfo(Integer roleId, Integer[] rightCodes) {
		// TODO Auto-generated method stub
		// 先删除原来给角色分配的权限信息
		rightDao.deleteByRoleId(roleId);
		// 然后插入新分配的信息
		rightDao.insertRoleAndRight(roleId, rightCodes);
		
	}
	

}
