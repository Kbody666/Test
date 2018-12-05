package com.lt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lt.mapper.UserMapper;
import com.lt.pojo.User;
import com.lt.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	@Transactional(propagation=Propagation.SUPPORTS)
	public User get(String id) throws Exception {
		User user = userMapper.get(id);
		if(user!=null) {
			return user;
		}
		return null;
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<User> findList(User t) throws Exception {
		List<User> list = userMapper.queryList(t);
		if(list!=null && list.size()>0) {
			return list;
		}
		return null;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void insert(User t) throws Exception {
		userMapper.insert(t);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void update(User t) throws Exception {
		userMapper.update(t);		
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void delete(String id) throws Exception {
		userMapper.deleteById(id);
	}

}
