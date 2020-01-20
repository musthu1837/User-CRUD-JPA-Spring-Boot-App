package com.musthafa.springboot.services;

import java.util.List;
import java.util.Optional;

import com.musthafa.springboot.models.UserEntity;

public interface UserService {
	public List<UserEntity> listUsers();

	public Optional<UserEntity> listUserById(int id);

	public void addUser(UserEntity u);

	public void deleteUserById(int id);

	public void updateUser(UserEntity u);

}