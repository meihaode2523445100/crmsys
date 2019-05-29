package com.qfedu.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.SysUserMapper;
import com.qfedu.pojo.SysUser;
import com.qfedu.service.SysUserService;
import com.qfedu.vo.VUserInfo;

@Service
public class SysUserServiceImpl implements SysUserService{

	@Autowired
	private SysUserMapper userDao;

	@Override
	public SysUser login(String name, String password) {
		// TODO Auto-generated method stub
		SysUser user = userDao.selectByName(name);
		
		if (user == null) {
			throw new RuntimeException("用户名错误");
		}
		if (!user.getUserPassword().equals(password)) {
			throw new RuntimeException("密码错误");
		}
		return user;
	}

	@Override
	public Map<String, Object> findUSerByPage(int page) {
		// TODO Auto-generated method stub
		
		// 分页插件中提供的方法
		// 第一个参数，页码；第二个参数，每页显示记录个数
		// startPage()方法后，一定要直接写查询的方法，中间不要有其他逻辑
		PageHelper.startPage(page, 5);
		// 正常的查询
		List<VUserInfo> list = userDao.selectAll();
		
		Map<String, Object> map = new HashMap<>();
		map.put("total", ((Page)list).getTotal());
		map.put("rows", list);
		return map;
	}

	@Override
	public void deleteUserById(Integer userId) {
		// TODO Auto-generated method stub
		userDao.deleteByUserId(userId);
	}

	@Override
	public void importUserInfo(List<SysUser> users) {
		// TODO Auto-generated method stub
		userDao.insertUsers(users);
	}

	@Override
	public VUserInfo findById(Integer userId) {
		// TODO Auto-generated method stub
		return userDao.findByRoleId(userId);
	}

}
