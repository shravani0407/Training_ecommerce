package com.wu.ecommerce.service;

import java.sql.SQLException;
import java.util.Optional;

import com.wu.ecommerce.dto.User;
import com.wu.ecommerce.exception.UserNotFoundException;

public interface UserService {
	public User addUser(User user) throws ClassNotFoundException, SQLException;
	public User getUserByUserId(String id) throws UserNotFoundException;
	public Optional<User[]> getUser();
	public String removeUserByUserId(String id);
	public User updateUserByUserId(String id, User user);
	
}
