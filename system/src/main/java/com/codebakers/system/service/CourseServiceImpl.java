package com.codebakers.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebakers.system.daoInterface.CourseDAO;
import com.codebakers.system.model.Course;
import com.codebakers.system.serviceInterface.CourseService;
@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseDAO courseDAO;

	@Override
	public List<Course> getAll() {
		return (List<Course>) courseDAO.findAll();
		

	}

}
