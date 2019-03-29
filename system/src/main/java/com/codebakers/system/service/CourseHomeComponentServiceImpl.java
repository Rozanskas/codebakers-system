package com.codebakers.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebakers.system.daoInterface.CourseHomeComponentRepository;
import com.codebakers.system.model.CourseHomeComponent;
import com.codebakers.system.serviceInterface.CourseComponentService;
@Service
public class CourseHomeComponentServiceImpl implements CourseComponentService {
	
	@Autowired
	private CourseHomeComponentRepository courseHomeComponentRepository;

	@Override
	public CourseHomeComponent getHomeComponentByCourseIdId(long id) {
		return courseHomeComponentRepository.findById(id).get();
		
	}

}
