package com.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 张明亮
 */
@Controller
public class FormController {

	@RequestMapping(value="/{formName}")
	public String loginForm(@PathVariable String formName) {
	//动态跳转页面
		return formName;
	}
}
