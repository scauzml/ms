package com.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.mybatis.model.User;

/**
 * @author 张明亮
 */
public interface UserMapper {
	/**
	 * @author {张明亮}
	 * @date 2018-09-04 14:26
	 * @param null
	 * @return
	 * @throws
	 * @description {查找用户通过用户的id，用户的名字}
	 */
	@Select("select * from user where id=#{id} and name=#{name}")
	public User findWithIdAndName(@Param("id")Integer id,@Param("name") String name);
	
}
