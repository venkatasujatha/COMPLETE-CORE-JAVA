package com.tectoro.JdbcSelect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
    		Class.forName("org.postgresql.Driver");
    		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=public","postgres","postgres");
    		Statement stmt=con.createStatement();
    		String s="select * from employee";
    		ResultSet rs=stmt.executeQuery(s);
    		while(rs.next()) {
    			System.out.println(rs.getInt(1)+" "+rs.getString(2));
    		}
    		
    		
    		
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
        System.out.println( "Hello World!" );
    }
}
