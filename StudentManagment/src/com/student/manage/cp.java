package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class cp {
	
	static Connection con;




	
public static Connection createC()
{
	
	
	//
	try
	{
		//Load Driver
	
	Class.forName("com.mysql.jdbc.Driver");
	
	
	//create the connection
	String user="root";
	String password="shivaa";
	String url = "jdbc:mysql://localhost:3306/student_manage";
		

		con =DriverManager.getConnection(url, user, password);
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	return con;
}
}

