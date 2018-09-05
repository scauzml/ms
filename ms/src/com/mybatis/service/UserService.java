package com.mybatis.service;

import com.mybatis.model.User;

/**
 * @author 张明亮
 */
public interface UserService {

	/**
	 * @author {张明亮}
	 * @date 2018-09-04 14:27
	 * @param null
	 * @return
	 * @throws
	 * @description {服务层使用用户id，用户名字登录}
	 */
	public User login(Integer id,String name);
}
