package com.example.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Mapping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	private Integer studentRoll;
	private String  studentName;
	private Integer mathematicsMarks;
	private Integer scienceMarks;
	private Integer englishMarks;
	private Integer semester;
	
	
}
