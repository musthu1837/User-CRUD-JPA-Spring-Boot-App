package com.musthafa.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musthafa.springboot.exceptions.UsersNoContentFoundExcetopn;
import com.musthafa.springboot.models.UserEntity;
import com.musthafa.springboot.repositories.UserRepository;

@Service
public class UserServiceImplementation implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserEntity> listUsers() {
		// TODO Auto-generated method stub
		List<UserEntity> result = (List<UserEntity>) userRepository.findAll();
		if (result.size() > 0) {
			return result;
		} else {
			throw new UsersNoContentFoundExcetopn("No content found");
		}
	}

	@Override
	public void addUser(UserEntity u) {
		// TODO Auto-generated method stub
		userRepository.save(u);
	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public void updateUser(UserEntity u) {
		// TODO Auto-generated method stub
		userRepository.save(u);
	}

	@Override
	public Optional<UserEntity> listUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

}
