package com.codebakers.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codebakers.system.model.CourseHomeComponent;
import com.codebakers.system.service.CourseHomeComponentServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/api/admin")
public class CourseComponentController {
	
	@Autowired
	private CourseHomeComponentServiceImpl courseHomeComponentService;
	
	@GetMapping("/coursehomecomponent")
	public CourseHomeComponent getHomeComponentByCourseIdId(@RequestParam long id){
	 
		return courseHomeComponentService.getHomeComponentByCourseIdId(id);
	}

}
