package com.tectoro.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
	
	Connection connection;
	public  Connection getConnection()throws SQLException,ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=public","postgres","postgres");
		//System.out.println("Success");
		
		return connection;
	}

}
