package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.exception.StudentException;
import com.example.model.Student;
import com.example.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/home")
	public String welcome() {
		return "welcome";
	}

	@GetMapping("/saveStudent")
	public String saveStudent() {
		return "saveStudent";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(@RequestParam Integer studentRoll, @RequestParam String studentName,
			@RequestParam Integer mathematics, @RequestParam Integer science, @RequestParam Integer english,
			@RequestParam Integer semester) throws StudentException {
		
		if(mathematics>100) throw new StudentException("Kindly");
		
		studentService.saveStudent(studentRoll, studentName, mathematics, science, english, semester);

		return "welcome";
	}

	@GetMapping("/getPercentage")
	public String getPercentageOfWholeClassView() {
		return "getPercentage";
	}

	@PostMapping("/getPercentage")
	public String getPercentageOfWholeClassView(Model model, @RequestParam Integer semester) {

		model.addAttribute("avg", studentService.getAvgPercentageOfWholeClass(semester));

		return "getPercentageResult";
	}
	
	

	@GetMapping("/avgMarks")
	public String avgMarksBySubjectView() {

		return "avgMarks";
	}

	@PostMapping("/avgMarks")
	public String avgMarksBySubjectView(Model model, @RequestParam String subject) {

		model.addAttribute("avgMarks", studentService.getAvgMarksOfStudentsPerSubject(subject));

		return "avgResult";
	}

	
	
	@GetMapping("/topTwo")
	public String topView() {
		return "topTwo";
	}

	@PostMapping("/topTwo")
	public String topView(Model model) {

		model.addAttribute("top2", studentService.getTopTwoStudents());

		return "topTwoResult";
	}

	
	
	@GetMapping("/allstudents")
	@ResponseBody
	public List<Student> getAllStudent() throws StudentException {
		return studentService.getAllStudent();
	}

}
