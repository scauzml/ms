package com.mybatis.service;

import java.util.List;

import com.mybatis.model.Book;

/**
 * @author 张明亮
 */
public interface BookService {
	/**
	 * @author {张明亮}
	 * @date 2018-09-04 14:25
	 * @param null
	 * @return
	 * @throws
	 * @description {服务层获得所有的书}
	 */
	List<Book> getAll();
}
