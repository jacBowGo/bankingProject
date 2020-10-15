package com.app.bank.service;

import com.app.bank.exception.BusinessException;
import com.app.bank.model.User;

public interface LoginService {

	public boolean isValidUserCredentials(User user) throws BusinessException;
	
	
}
