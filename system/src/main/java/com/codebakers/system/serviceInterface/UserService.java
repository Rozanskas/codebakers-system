package com.codebakers.system.serviceInterface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codebakers.system.model.User;

@Service
public interface UserService {
	List<User> getAll();

	int enableUserById(int id);

	int disableUSerById(int id);
}
