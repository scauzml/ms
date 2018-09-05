package com.mybatis.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.mybatis.model.User;
import com.mybatis.service.UserService;

/**
 * @author 张明亮
 */
@Controller
public class UserController {

	/**
	 * @author {张明亮}
	 * @date 2018-09-04 14:34
	 * @description {服务层用户接口}
	*/
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	@RequestMapping(value = "logintest")
	public String loginTest() {
		return "loginForm";
	}
	@RequestMapping(value="/login")
	public ModelAndView login(String id,String name,ModelAndView mv,HttpSession session) {
		System.out.println("id "+id+"name "+name);
	User user=userService.login(Integer.parseInt(id.trim()), name);
	if(user!=null) {
		System.out.println("user.getid and getName "+user.getId()+" "+user.getName());
	session.setAttribute("user", user);
	//转发到main请求
	mv.setView(new RedirectView("/main"));
	}else {
		mv.addObject("message", "登录失败");
		
	}	
	return mv;
	}
}
