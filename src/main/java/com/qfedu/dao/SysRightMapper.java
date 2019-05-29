package com.qfedu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qfedu.pojo.SysRight;
import com.qfedu.vo.VMenuInfo;
import com.qfedu.vo.VTreeInfo;

public interface SysRightMapper {
    int deleteByPrimaryKey(Integer rightCode);

    int insert(SysRight record);

    int insertSelective(SysRight record);

    SysRight selectByPrimaryKey(Integer rightCode);

    int updateByPrimaryKeySelective(SysRight record);

    int updateByPrimaryKey(SysRight record);
    
    // 根据角色id，获取菜单信息
    public List<VMenuInfo> selectMenu(Integer roleId);
    
    // 获取所有节点
    public List<VTreeInfo> selectAllTreeNode();
    
    // 获取某个角色分配的权限的id
    public List<Integer> selectCheckNodeId(Integer roleId);

    // 根据roleId删除中间表的信息
    public void deleteByRoleId(Integer roleId);
    
    // 向中间表添加角色和权限的id

    public void insertRoleAndRight(@Param("roleId") Integer roleId, @Param("rightCodes") Integer[] rightCodes);
}