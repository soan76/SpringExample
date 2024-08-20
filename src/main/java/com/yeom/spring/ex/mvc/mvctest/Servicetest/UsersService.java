package com.yeom.spring.ex.mvc.mvctest.Servicetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yeom.spring.ex.mvc.mvctest.domain.Users;
import com.yeom.spring.ex.mvc.mvctest.repositorytest.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository userRepository;
	
	public int addUser(Users users) {
		int count = userRepository.insertUser(users);
		
		return count;
	}
	
}
