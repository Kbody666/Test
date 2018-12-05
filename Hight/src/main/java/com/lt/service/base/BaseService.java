package com.lt.service.base;

import java.util.List;

public interface BaseService<T> {
	/**
	 * 根据id获取一条数据
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public T get(String id) throws Exception;
	/**
	 * 查询所有数据
	 * @param t
	 * @return
	 */
	public List<T> findList(T t)throws Exception;
	
	/**
	 * 插入数据
	 * @param t
	 */
	public void insert(T t)throws Exception;
	
	/**
	 * 修改数据
	 * @param t
	 * @throws Exception
	 */
	public void update(T t) throws Exception;
	/**
	 * 通过id删除数据
	 * @param id
	 * @throws Exception
	 */
	public void delete(String id) throws Exception;
}
