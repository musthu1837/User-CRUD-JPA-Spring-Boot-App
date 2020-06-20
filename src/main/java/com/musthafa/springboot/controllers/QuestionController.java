package com.musthafa.springboot.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.musthafa.springboot.models.QuestionEntity;
import com.musthafa.springboot.services.QuestionService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class QuestionController {
	@Autowired
	private QuestionService questionService ;
	
	@GetMapping("/v1/questions")
	public List<QuestionEntity> listQuestions() {
		return questionService.listQuestions();
	}
	
	@PostMapping("/v1/questions")
	public ResponseEntity<QuestionEntity> createQuestion(@RequestBody QuestionEntity question) {

		questionService.addQuestion(question);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{questionId}")
				.buildAndExpand(question.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
}
