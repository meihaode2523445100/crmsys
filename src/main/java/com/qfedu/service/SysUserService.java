package com.qfedu.service;

import java.util.List;
import java.util.Map;

import com.qfedu.pojo.SysUser;
import com.qfedu.vo.VUserInfo;

public interface SysUserService {

	public SysUser login(String name, String password); 
	
    public Map<String, Object> findUSerByPage(int page);
    
    public void deleteUserById(Integer userId);
    
    public void importUserInfo(List<SysUser> users);
    
    public VUserInfo findById(Integer userId);
    
}
