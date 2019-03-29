package com.codebakers.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codebakers.system.model.User;
import com.codebakers.system.serviceInterface.UserService;

@CrossOrigin
@RestController
@RequestMapping("/api/admin")
public class UserController {
	@Autowired
	UserService userService;

	@GetMapping("/users")
	@ResponseBody
	public List<User> getAll() {
		return userService.getAll();
	}

	@PostMapping("/enableuser")
	@ResponseBody
	public int enableUser(@RequestBody int id) {
		return userService.enableUserById(id);
	}

	@PostMapping("/disableuser")
	@ResponseBody
	public int disableUser(@RequestBody int id) {
		return userService.disableUSerById(id);
	}
}
