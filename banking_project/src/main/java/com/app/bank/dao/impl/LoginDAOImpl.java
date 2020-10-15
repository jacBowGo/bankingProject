package com.app.bank.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.bank.dao.LoginDAO;
import com.app.bank.dao.dbutil.MySqlConnection;
import com.app.bank.exception.BusinessException;
import com.app.bank.model.User;

public class LoginDAOImpl implements LoginDAO {

	@Override
	public boolean isValidUserCredentials(User user) throws BusinessException {
		boolean b = false;
		
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "SELECT username FROM users WHERE username = ? and password = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				b = true;
			} else {
				throw new BusinessException("Invalid Login");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //this line you should take off before going live (production)
			throw new BusinessException("Internal error occurred... Please contact the master");
		}
		
		return b;
	}

}

//response.sendRedirect("two.html");
