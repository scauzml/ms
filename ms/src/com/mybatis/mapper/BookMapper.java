package com.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.mybatis.model.Book;

/**
 * @author 张明亮
 */
public interface BookMapper {


	/**
	 * @author {张明亮}
	 * @date 2018-09-04 14:24
	 * @param null
	 * @return
	 * @throws
	 * @description {返回所有的书}
	 */
	@Select("select * from book")
	List<Book> findAll();
	
}
