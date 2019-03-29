package com.codebakers.system.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	private String name;
	private String description;
	private int rating;

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "course_home_component_id", referencedColumnName = "id")
	
	@JsonManagedReference
	private CourseHomeComponent courseHomeComponent;

	public CourseHomeComponent getCourseHomeComponent() {
		return this.courseHomeComponent;
	}

	public void setCourseHomeComponent(CourseHomeComponent courseHomeComponent) {
		this.courseHomeComponent = courseHomeComponent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", description=" + description + ", rating=" + rating + "]";
	}

}
