package com.wu.ecommerce.service;

import java.sql.SQLException;
import java.util.Optional;

import com.wu.ecommerce.dto.User;
import com.wu.ecommerce.exception.UserNotFoundException;
import com.wu.ecommerce.repo.ProductRepository;
import com.wu.ecommerce.repo.ProductRepositoryImpl;
import com.wu.ecommerce.repo.UserRepository;
import com.wu.ecommerce.repo.UserRepositoryImpl;

public class UserServiceImpl implements UserService {

	private UserRepository userRepository = UserRepositoryImpl.getInstance();
	
	private static UserService userService;
	
	public static UserService getInstance() {
		if(userService == null) {
			userService = new UserServiceImpl();
		}
		return userService;
	}
	public User addUser(User user) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return  userRepository.addUser(user);
	}

	@Override
	public User getUserByUserId(String id) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User[]> getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeUserByUserId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUserByUserId(String id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

}