package com.logan.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.logan.pojo.User;
import com.logan.services.UserService;

public class TestMyBatis extends Junit4Test{

	@Autowired
	private UserService service;
	
	@Test
	@Transactional
	@Rollback(false) // 防止事务回滚
	public void test() {
		testUser();
	}
	
	private void testUser() {
		// add 
		Map<String,Object> map = new HashMap<>();
		map.put("username", "jerry");
		map.put("password", "123");
		map.put("name", "jerry123");
//		service.addUser(map);
		
		User user = new User();
		user.setUserName("jerry");
		user.setPassword("123");
//		user = this.service.getUser(user);
//		System.out.println(user);
		
		List<User>list = service.getUserList();
		list.stream().forEach(e->{
			System.out.println(e);
		});
	}
}
 