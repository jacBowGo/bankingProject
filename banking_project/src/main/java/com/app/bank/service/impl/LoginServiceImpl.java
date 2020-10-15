package com.app.bank.service.impl;

import com.app.bank.dao.LoginDAO;
import com.app.bank.dao.impl.LoginDAOImpl;
import com.app.bank.exception.BusinessException;
import com.app.bank.model.User;
import com.app.bank.service.LoginService;

public class LoginServiceImpl implements LoginService {

	private LoginDAO dao = new LoginDAOImpl();
	@Override
	public boolean isValidUserCredentials(User user) throws BusinessException {
		boolean b = false;
		
		if (user != null && user.getUsername() != null && user.getPassword() != null) {
			b = dao.isValidUserCredentials(user);
		} else {
			throw new BusinessException("Invalid Login Credentials");
		}
		return b;
	}

	
}


// && user.getUsername().matches("[a-z]{4,6}[0-9]{4}") && user.getPassword().matches("[a-z]{3,6}[*#$@]{1}[0-9]{4}")
