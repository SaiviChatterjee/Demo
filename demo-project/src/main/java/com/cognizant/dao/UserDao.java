package com.cognizant.dao;

import org.springframework.stereotype.Repository;

import com.cognizant.model.User;

@Repository
public class UserDao {

	public boolean validate(User user) {
		if(user.getUserName().equals("saivichatt") && user.getPassword().equals("1234")) {
			return true;
		}
		return false;
	}

}
