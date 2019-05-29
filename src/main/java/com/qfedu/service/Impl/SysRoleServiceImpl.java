package com.qfedu.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qfedu.dao.SysRoleMapper;
import com.qfedu.pojo.SysRole;
import com.qfedu.service.SysRoleService;

@Service
public class SysRoleServiceImpl implements SysRoleService{

	@Autowired
	private SysRoleMapper roleDao;
	
	@Override
	public List<SysRole> findAllRoles() {
		// TODO Auto-generated method stub
		return roleDao.selectAll();
	}

}
