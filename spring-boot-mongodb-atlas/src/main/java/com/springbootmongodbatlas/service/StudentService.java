package com.springbootmongodbatlas.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootmongodbatlas.model.Student;
import com.springbootmongodbatlas.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student addStudent(Student student) {

		return studentRepository.save(student);

	}

	public Student findByStudentId(int roll_no) {
		return studentRepository.findById(roll_no).get();
	}

	public List<Student> find() {
		return studentRepository.findAll();
	}

	public List<Student> findByStudentName(String name) {
		return studentRepository.findByName(name);
	}

	public Student update(Student student) {
		Student existingStudent = studentRepository.findById(student.getRoll_no()).get();
		
		//existingStudent.setAge(existingStudent.getAge());
		System.out.println(existingStudent.getAge());
		//existingStudent.setGrade(existingStudent.getGrade());
		System.out.println(existingStudent.getGrade());
		//existingStudent.setMarks(existingStudent.getMarks());
		System.out.println(existingStudent.getMarks());
		//existingStudent.setName(existingStudent.getName());
		System.out.println(existingStudent.getName());
		
		System.out.println("===========================After============================");
		
		existingStudent.setAge(student.getAge());
		System.out.println(existingStudent.getAge());
		existingStudent.setGrade(student.getGrade());
		System.out.println(student.getGrade());
		existingStudent.setMarks(student.getMarks());
		System.out.println(existingStudent.getMarks());
		existingStudent.setName(student.getName());
		System.out.println(existingStudent.getName());

		return studentRepository.save(existingStudent);

	}

	public String delete(int roll_no) {
		studentRepository.deleteById(roll_no);
		return "Deleted";
	}
}
