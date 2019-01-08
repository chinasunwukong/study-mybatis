package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.User;
import com.mapper.UserMapper;
import com.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return userMapper.loginByUserNameAndPassword(username, password);
	}

}
