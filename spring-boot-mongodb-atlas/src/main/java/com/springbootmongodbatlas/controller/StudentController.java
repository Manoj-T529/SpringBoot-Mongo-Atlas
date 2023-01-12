package com.springbootmongodbatlas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootmongodbatlas.model.Student;
import com.springbootmongodbatlas.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/save")
	public Student createStudent(@RequestBody Student student)
	{
		return studentService.addStudent(student);
	}
	
	@GetMapping("/getall")
	public List<Student> findAll()
	{
		return studentService.find();
	}
	
	@GetMapping("/get/{id}")
	public Student findById(@PathVariable("id") int roll_no)
	{
		return studentService.findByStudentId(roll_no);
	}
	@GetMapping("/getbyname/{name}")
	public List<Student> findByName(@PathVariable("name") String name)
	{
		return studentService.findByStudentName(name);
	}
	
	@PutMapping("/update")
	public Student update(@RequestBody Student student)
	{
		return studentService.update(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int roll_no)
	{
		return studentService.delete(roll_no);
	}
}
