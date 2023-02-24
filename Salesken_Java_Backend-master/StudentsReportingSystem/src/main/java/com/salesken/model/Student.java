package com.salesken.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(indexName = "product")
public class Student {

	@Id
	private Integer studentRoll;
	private String studentName;
	private Integer mathematicsMarks;
	private Integer scienceMarks;
	private Integer englishMarks;
	private Integer semester;

}
