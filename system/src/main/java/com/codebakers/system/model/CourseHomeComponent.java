package com.codebakers.system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "coursehomecomponent")
@JsonIdentityInfo(
	      generator = ObjectIdGenerators.PropertyGenerator.class, 
	      property = "id")
public class CourseHomeComponent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String content;

	@NotBlank
	private String rowsOfTextArea;

	@NotBlank
	private String columns;
	
	@JsonBackReference
	@OneToOne(mappedBy="courseHomeComponent")
	private Course course;

	public String getRowsOfTextArea() {
		return rowsOfTextArea;
	}

	public void setRowsOfTextArea(String rowsOfTextArea) {
		this.rowsOfTextArea = rowsOfTextArea;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getColumns() {
		return columns;
	}

	public void setColumns(String columns) {
		this.columns = columns;
	}

}
