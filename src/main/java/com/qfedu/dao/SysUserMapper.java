package com.qfedu.dao;

import java.util.List;
import java.util.Map;

import com.qfedu.pojo.SysUser;
import com.qfedu.vo.VUserInfo;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    
    
    /////////////////////////////////////////////////
    public SysUser selectByName(String name);
    
    public List<VUserInfo> selectAll();
    
    public void deleteByUserId(Integer userId);
    
    // 插入多条语句
    public void insertUsers(List<SysUser> users);
    
    public VUserInfo findByRoleId(Integer userId);
    
}