package com.qfedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qfedu.service.SysRightService;
import com.qfedu.vo.JsonBean;
import com.qfedu.vo.VTreeInfo;

@Controller
@ResponseBody
@RequestMapping("/right")
public class RightController {


	@Autowired
	private SysRightService rightService;
	
	@RequestMapping("/tree.do")
	public JsonBean findTreeNode(Integer roleId) {
		List<VTreeInfo> list = rightService.findTreeNode(roleId);
		return new JsonBean(1, list);
	}
	
	// 如果提交的参数中，有多个相同的key值，通过数组接受
	@RequestMapping("/changeRight.do")
	public JsonBean changeRight(Integer roleId,@RequestParam("rightCodes[]") Integer[] rightCodes) {
		rightService.changeRightInfo(roleId, rightCodes);
		return new JsonBean(1, null);
	}
	
	
}
