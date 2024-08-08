package com.wu.ecommerce.dto;

import com.wu.ecommerce.exception.InvalidContactException;
import com.wu.ecommerce.exception.InvalidIdException;
import com.wu.ecommerce.exception.InvalidUserIdException;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor

public class User {
	public User(String userId, String firstName, String lastName, String contact) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
	}
	
	private String userId;
	public void setUserId(String userId) throws InvalidUserIdException {
		if (userId == null || userId.equals("") || userId.length()<3) {
			throw new InvalidUserIdException("userId is invalid");
		}
		this.userId = userId;
	}
	@Setter
	private String firstName;
	@Setter
	private String lastName;
	@Setter
	private String contact;
	public void setContact(String contact) throws InvalidContactException {
		if (contact.length() != 10) {
			throw new InvalidContactException("contact is invalid");
		}
		this.contact = contact;
	}
	
	
}
