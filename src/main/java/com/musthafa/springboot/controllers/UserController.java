package com.musthafa.springboot.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.musthafa.springboot.exceptions.UserNotFoundException;
import com.musthafa.springboot.models.UserEntity;
import com.musthafa.springboot.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("users/")
	public List<UserEntity> listUsers() {
		return userService.listUsers();
	}

	@PostMapping("users/")
	public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity u) {

		userService.addUser(u);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(u.getUserId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@GetMapping("users/{id}")
	public ResponseEntity<UserEntity> getUser(@PathVariable int id) {
		Optional<UserEntity> u = userService.listUserById(id);
		if (u.isPresent()) {
			return ResponseEntity.ok(u.get());
		} else {
			throw new UserNotFoundException("id: " + id);
		}
	}

	@PutMapping("users/{id}")
	public ResponseEntity<UserEntity> updateUser(@RequestBody UserEntity u, @PathVariable int id) {
		u.setUserId(id);
		Optional<UserEntity> foundUser = userService.listUserById(id);
		if (foundUser.isPresent()) {
			userService.updateUser(u);
			return ResponseEntity.ok(u);
		} else {
			throw new UserNotFoundException("id: " + id);
		}
	}

	@DeleteMapping("users/{id}")
	public ResponseEntity<UserEntity> deleteUser(@PathVariable int id) {
		Optional<UserEntity> foundUser = userService.listUserById(id);
		if (foundUser.isPresent()) {
			userService.deleteUserById(id);
			return ResponseEntity.ok(foundUser.get());
		} else {
			throw new UserNotFoundException("id: " + id);
		}
	}
}
