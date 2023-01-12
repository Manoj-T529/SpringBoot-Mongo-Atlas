package com.springbootmongodbatlas.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.springbootmongodbatlas.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer>{

	@Query("{name: ?0}")
	List<Student> findByName(String name);

}
