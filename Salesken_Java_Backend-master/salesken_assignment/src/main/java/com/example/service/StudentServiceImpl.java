package com.example.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.exception.StudentException;
import com.example.model.Student;
import com.example.repository.StudentRepository;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	
	
	@Override
	public Student saveStudent(Integer roll, String name, Integer englishMarks, Integer mathsMarks,
			Integer scienceMarks, Integer semester) {
		
		return studentRepository.save(new Student(roll,name,mathsMarks,scienceMarks,englishMarks,semester));
			
	}
	
		

	@Override
	public Integer getAvgPercentageOfWholeClass(Integer semester) {
		
		List<Student> students=studentRepository.findBySemester(semester);
		
		if(students.size()==0) return 0;
		
		int percentageSum=0;
		
		for(Student student:students)
		{
			// calculating percentage of each student
			int percentageOfEachStudent=(student.getScienceMarks()+student.getEnglishMarks()+student.getMathematicsMarks())/3;
			
			percentageSum+=percentageOfEachStudent;
		}
		
		return percentageSum/students.size();
	}

	
	
	
	@Override
	public Integer getAvgMarksOfStudentsPerSubject(String subject){
		
		Iterable<Student> itrStudents= studentRepository.findAll();
		
		List<Student> students=new ArrayList<>();
		
		itrStudents.forEach(students::add);
		
		if(students.size()==0) return 0;
		
		int sum=0,count=0;
		
		for(Student student:students)
		{
			if(subject.equalsIgnoreCase("mathematics"))
				sum+=student.getMathematicsMarks();
			else if(subject.equalsIgnoreCase("science"))
				sum+=student.getScienceMarks();
			else if(subject.equalsIgnoreCase("english"))
				sum+=student.getEnglishMarks();
			
			count++;
		}

		return sum/count;
	}

	
	
	
	@Override
	public List<String> getTopTwoStudents() {
		
        Iterable<Student> itrStudents= studentRepository.findAll();
		
		List<Student> students=new ArrayList<>();
		
		itrStudents.forEach(students::add);
		
		Map<Integer,Integer> map=new HashMap<>();
		// iterating over list and string their avg marks with roll in map
		for(Student student:students)
		{
			map.put(student.getStudentRoll(), (student.getEnglishMarks()+student.getMathematicsMarks()+student.getScienceMarks())/3);
		}
		
		List<Map.Entry<Integer, Integer>> listOfavgMarks=new ArrayList<>(map.entrySet());
		
		Collections.sort(listOfavgMarks,(e1,e2)->e2.getValue()-e1.getValue());
		
		
		// collection top two student from list of avg marks
		List<String> topTwo=new ArrayList();
		int count=1;
		
		for(Map.Entry<Integer, Integer> kv:listOfavgMarks)
		{
			
			int roll=kv.getKey();
			// got key as roll and find student(optional) and get name
			topTwo.add(studentRepository.findById(roll).get().getStudentName());
			
			if(count==2) break;
			
			count++;
		}
		
		return topTwo;
	}
	
	
	
	
	@Override
	public List<Student> getAllStudent() throws StudentException {
		Iterable<Student> itrstudents= studentRepository.findAll();
		
		List<Student> students=new ArrayList<>();
		
		itrstudents.forEach(students::add);
		
		if(students.size()==0) {
			throw new StudentException("Student not found !");
		}
		return students;
	}

	@Override
	public Student removeStudentRoll(Integer roll) throws StudentException {
		Optional<Student> optional=studentRepository.findById(roll);
		if(optional.isPresent()) {
			studentRepository.delete(optional.get());
		}
				
		else throw new StudentException("Student not found with roll : "+roll);

		return optional.get();
	}


	

}
