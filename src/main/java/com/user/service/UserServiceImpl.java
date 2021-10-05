package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;


@Service
public class UserServiceImpl implements UserService {
	
	List<User> list = List.of(
			new User(1,"Minhaj","7327070259"),
			new User(2,"Priyanka","833956655"),
			new User(3,"Krishna","9853333807")
			);
	

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(user -> user.getUserId() == id).findAny().orElse(null);
	}

}
