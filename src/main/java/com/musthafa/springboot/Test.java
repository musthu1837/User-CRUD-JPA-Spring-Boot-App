package com.musthafa.springboot;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.musthafa.springboot.models.UserEntity;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<UserEntity> list = Stream.generate(UserEntity::new).limit(10).map((u) -> {
			u.setUserAge(21);
			return u;
		}).collect(Collectors.toList());

		list.forEach(System.out::println);

	}

}
