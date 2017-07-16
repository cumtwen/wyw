package org.wyw.pupu.service;

import org.wyw.pupu.domain.User;

public interface UserService {
	void inUser(String username,String password,String email,String phone,String address,String question,String answer);
	User login(String username,String password);
	User protect(String username,String question,String answer);
	User message(int user_id);
	Boolean updatepwd(String username,String password,String newpwd);
}
