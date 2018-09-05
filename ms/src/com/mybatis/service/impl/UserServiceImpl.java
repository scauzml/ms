package com.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//@service("userService")用于把当前的类注析为一个Spring的bean,名为userService

import com.mybatis.mapper.UserMapper;
import com.mybatis.model.User;
import com.mybatis.service.UserService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 张明亮
 */
@Service("userService")
public class UserServiceImpl implements UserService{

	/**
	 * @author {张明亮}
	 * @date 2018-09-04 14:36
	 * @description {DAO层的用户数据接口}
	*/
	@Autowired
	private UserMapper userMapper;
    @Transactional(readOnly = true,propagation = Propagation.REQUIRED)
	@Override
	public User login(Integer id, String name) {
		// TODO Auto-generated method stub
		return userMapper.findWithIdAndName(id, name);
	}
	
}
