package com.musthafa.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musthafa.springboot.models.QuestionEntity;
import com.musthafa.springboot.models.UserEntity;
import com.musthafa.springboot.repositories.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired	
	private QuestionRepository questionRepository;
	
	@Override
	public List<QuestionEntity> listQuestions() {
		// TODO Auto-generated method stub
		List<QuestionEntity> result = (List<QuestionEntity>) questionRepository.findAll();

		return result;
	}
	@Override
	public void addQuestion(QuestionEntity q) {
		// TODO Auto-generated method stub
		questionRepository.save(q);
	}

}
