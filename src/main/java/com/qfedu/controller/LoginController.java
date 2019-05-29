package com.qfedu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qfedu.common.CommonInfo;
import com.qfedu.pojo.SysUser;
import com.qfedu.service.SysUserService;
import com.qfedu.vo.JsonBean;

@Controller
@ResponseBody
public class LoginController {

	@Autowired
	private SysUserService userService;
	
	@RequestMapping("/login.do")
	public JsonBean login(String name, String password, HttpSession session) {
		
		SysUser user = userService.login(name, password);
		session.setAttribute(CommonInfo.LOGIN_USER, user);
		
		return new JsonBean(1, null);
		
	}
	
}
