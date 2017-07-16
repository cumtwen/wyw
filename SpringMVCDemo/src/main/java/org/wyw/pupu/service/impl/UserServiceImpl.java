package org.wyw.pupu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.wyw.pupu.domain.User;
import org.wyw.pupu.mapper.UserMapper;
import org.wyw.pupu.service.UserService;


@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void inUser(String username, String password, String email, String phone, String address, String question,
			String answer) {
		userMapper.insertUser(username, password, email, phone,address,question,answer);
		
	}
	public User login(String username,String password){
		return userMapper.findUsernameAndPasd(username,password);
	}
	@Override
	public User protect(String username, String question, String answer) {
		return userMapper.findQuestionAndAnswer(username,question,answer);
	}
	@Override
	public User message(int user_id) {
		// TODO Auto-generated method stub
		return userMapper.message(user_id);
	}
	@Override
	public Boolean updatepwd(String username, String password,String newpwd) {
		// TODO Auto-generated method stub
		return userMapper.updatepwd(username, password, newpwd);
	}

}