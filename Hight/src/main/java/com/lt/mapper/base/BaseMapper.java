package com.lt.mapper.base;

import java.util.List;

public interface BaseMapper<T> {

	/**
	 *通过id来查询数据
	 * @param id   id
	 * @return
	 */
	T get(String id);
	
	/**
	 * 查询数据
	 * @param t
	 * @return
	 */
	List<T> queryList(T t);
	
	/**
	 * 添加数据
	 * @param t
	 */
	void insert(T t);
	
	/**
	 * 修改数据
	 * @param t
	 */
	void update(T t);
	
	/**
	 * 通过id来删除数据
	 * @param id
	 */
	void deleteById(String id);
}
