package com.logan.dao;

import java.util.List;
import java.util.Map;

import com.logan.pojo.User;

public interface UserMapper {
	//插入操作
	int insert(Map<String, Object> map);	
	
	//更新操作
	int update(Map<String, Object> map);
 
	//删除操作
	int delete(Map<String, Object> map);
	
	//验证用户密码，并返回单个用户
	User getUser(User user);
	
	//查询单个用户
	User getUserInfo(User user);
	//查询多个用户
	List<User> getUserList();	
}
