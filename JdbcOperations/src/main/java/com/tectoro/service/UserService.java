package com.tectoro.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tectoro.config.Config;
import com.tectoro.entity.User;

public class UserService {
	public String save(User user)throws SQLException, ClassNotFoundException {
		Config config=new Config();
		//User u=new User();
		//System.out.println(user.getEname());
		PreparedStatement statement=config.getConnection().prepareStatement("insert into emp(ename,sal,phone) values(?,?,?);");
		statement.setString(1, user.getEname());
		statement.setInt(2, user.getSal());
		statement.setInt(3, user.getPhone());
		statement.executeUpdate();
		
		return "Save successfully";
	}

}
