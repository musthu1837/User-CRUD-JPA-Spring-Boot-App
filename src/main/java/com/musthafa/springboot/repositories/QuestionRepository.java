package com.musthafa.springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.musthafa.springboot.models.QuestionEntity;

@Repository
public interface QuestionRepository extends CrudRepository<QuestionEntity, Integer>{

}
