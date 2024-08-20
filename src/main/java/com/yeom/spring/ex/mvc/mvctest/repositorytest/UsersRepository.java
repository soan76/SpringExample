package com.yeom.spring.ex.mvc.mvctest.repositorytest;

import org.apache.ibatis.annotations.Mapper;

import com.yeom.spring.ex.mvc.mvctest.domain.Users;

@Mapper
public interface UsersRepository {

	public int insertUser(Users users);
	
}
