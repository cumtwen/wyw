package org.wyw.pupu.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wyw.pupu.domain.User;
import org.wyw.pupu.service.UserService;

public class UserTest extends BaseTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void userServiceTest(){
		String username="wyw";
		String password="wyw";
		User user=userService.login(username, password);
		System.out.println(user);
	}
	
}
