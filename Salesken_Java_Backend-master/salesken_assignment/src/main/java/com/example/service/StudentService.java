package com.example.service;

import java.util.List;

import com.example.exception.StudentException;
import com.example.model.Student;

public interface StudentService {
   
   public Student saveStudent(Integer roll, String name, Integer englishMarks, Integer mathsMarks,
			Integer scienceMarks, Integer semester);

	public Integer getAvgPercentageOfWholeClass(Integer semester);

	public Integer getAvgMarksOfStudentsPerSubject(String subject);

	public List<String> getTopTwoStudents();
	
	public List<Student> getAllStudent() throws StudentException;
	   
	public Student removeStudentRoll(Integer roll) throws StudentException;
}
