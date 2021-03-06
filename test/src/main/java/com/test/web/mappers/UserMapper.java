package com.test.web.mappers;

import org.springframework.stereotype.Repository;

import com.test.web.domains.User;

@Repository
public interface UserMapper {
	public void insertOneIntoUsers(User user);
	public User selectOneFromUsers(User user);
}