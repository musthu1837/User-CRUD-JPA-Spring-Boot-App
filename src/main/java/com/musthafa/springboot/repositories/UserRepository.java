package com.musthafa.springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.musthafa.springboot.models.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}
