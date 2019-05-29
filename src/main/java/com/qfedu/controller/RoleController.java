package com.qfedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qfedu.pojo.SysRole;
import com.qfedu.service.SysRoleService;
import com.qfedu.vo.JsonBean;

@Controller
@ResponseBody
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private SysRoleService roleService;

	@RequestMapping("/list.do")
	public JsonBean findAllRoles() {
		List<SysRole> list = roleService.findAllRoles();
		System.out.println(list);
		return new JsonBean(1, list);
	}
	
}
