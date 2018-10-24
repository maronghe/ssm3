package com.logan.services;

import java.util.List;
import java.util.Map;

import com.logan.pojo.User;

public interface UserService {
	void addUser(Map<String, Object> map);

	int updateUser(Map<String, Object> map);

	User getUser(User user);

	User getUserInfo(User user);

	List<User> getUserList();

}
