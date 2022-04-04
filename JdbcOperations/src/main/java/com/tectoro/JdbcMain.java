package com.tectoro;

import java.sql.SQLException;
import java.util.Scanner;

import com.tectoro.config.Config;
import com.tectoro.entity.User;
import com.tectoro.service.UserService;

public class JdbcMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter emp name::");
		String name=scanner.nextLine();
		System.out.println("Enter emp salary::");
		int sal=scanner.nextInt();
		System.out.println("Enter emp num::");
		int phone=scanner.nextInt();
		User user=new User(name, sal, phone);
		UserService service=new UserService();
		System.out.println(service.save(user));
	}

}
