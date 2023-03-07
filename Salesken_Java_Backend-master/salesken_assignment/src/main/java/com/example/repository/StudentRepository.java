package com.example.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.model.Student;

public interface StudentRepository extends ElasticsearchRepository<Student, Integer> {
	
	List<Student> findBySemester(Integer semester);

}
