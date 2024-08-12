package com.yeom.spring.ex.mvc.repository;

import org.apache.ibatis.annotations.Mapper;

import com.yeom.spring.ex.mvc.domain.User;

@Mapper
public interface UserRepository {
	
	public User selectLastUser();
	
}
