package com.qfedu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qfedu.common.CommonInfo;
import com.qfedu.pojo.SysUser;
import com.qfedu.service.SysRightService;
import com.qfedu.vo.JsonBean;
import com.qfedu.vo.VMenuInfo;

@RestController
public class MenuController {

	@Autowired
	private SysRightService rightService;
	
	@RequestMapping("/menu.do")
	public JsonBean menu(HttpSession session) {
		SysUser user = (SysUser)session.getAttribute(CommonInfo.LOGIN_USER);
		if (user == null) {
			return new JsonBean(0, "还未登录");
		}
		List<VMenuInfo> list = rightService.findMenu(user.getUserRoleId());
		
		return new JsonBean(1, list);
		
	}
}
