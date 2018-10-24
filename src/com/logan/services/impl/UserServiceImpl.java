package com.logan.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logan.dao.UserMapper;
import com.logan.pojo.User;
import com.logan.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper; // 自动注入
	
	@Override
	public void addUser(Map<String, Object> map) {
		userMapper.insert(map);
	}

	@Override
	public int updateUser(Map<String, Object> map) {
		return userMapper.update(map);
	}

	@Override
	public User getUser(User user) {
		return userMapper.getUser(user);
	}

	@Override
	public User getUserInfo(User user) {
		return userMapper.getUserInfo(user);
	}

	@Override
	public List<User> getUserList() {
		return userMapper.getUserList();
	}
	
}
