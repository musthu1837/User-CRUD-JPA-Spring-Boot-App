package com.musthafa.springboot.services;

import java.util.List;

import com.musthafa.springboot.models.QuestionEntity;

public interface QuestionService {
	public List<QuestionEntity> listQuestions();
	
	public void addQuestion(QuestionEntity q);

}
