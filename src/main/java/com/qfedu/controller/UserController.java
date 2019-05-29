package com.qfedu.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qfedu.service.SysUserService;
import com.qfedu.vo.JsonBean;
import com.qfedu.vo.VUserInfo;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private SysUserService userService;
	
	@RequestMapping("/list.do")
	public JsonBean findUserByPage(int page) {
		Map<String, Object> map = userService.findUSerByPage(page);
		return new JsonBean(1, map);
	}
	
	@RequestMapping("/delete.do")
	public JsonBean deleteById(Integer userId) {
		userService.deleteUserById(userId);
		return new JsonBean(1, null);
	}

	@RequestMapping("/query.do")
	public JsonBean updateById(Integer userId, Model model) {
		
		VUserInfo vuser = userService.findById(userId);
		model.addAttribute("vuser", vuser);
		return new JsonBean(1, null);
	}
	
}
