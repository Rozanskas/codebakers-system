package com.codebakers.system.daoInterface;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codebakers.system.model.Course;

@Repository
public interface CourseDAO extends CrudRepository<Course,Long> {

}
