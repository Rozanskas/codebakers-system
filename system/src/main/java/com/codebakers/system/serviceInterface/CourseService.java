package com.codebakers.system.serviceInterface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codebakers.system.model.Course;
@Service
public interface CourseService {

	List<Course>getAll();
}
