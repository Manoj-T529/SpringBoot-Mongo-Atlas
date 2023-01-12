package com.springbootmongodbatlas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "StudentTab")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	private int roll_no;
	private String name;
	private int age;
	private int marks;
	private String grade;
}
