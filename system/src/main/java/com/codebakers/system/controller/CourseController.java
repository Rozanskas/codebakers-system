package com.codebakers.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codebakers.system.model.Course;
import com.codebakers.system.serviceInterface.CourseService;

@CrossOrigin
@RestController
public class CourseController {
	@Autowired
	CourseService courseService;

	@GetMapping("/courses")
	@ResponseBody
	public List<Course> getAll() {
		return courseService.getAll();

	}
}
