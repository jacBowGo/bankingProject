package com.app.bank.dao;

import com.app.bank.exception.BusinessException;
import com.app.bank.model.User;

public interface LoginDAO {
	
	public boolean isValidUserCredentials(User user) throws BusinessException;
}
