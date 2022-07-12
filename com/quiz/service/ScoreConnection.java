package com.quiz.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class ScoreConnection {
	public static Connection getConnection() {
		Connection con=null;
		//Step 1 : load Driver in memory
		try {
			//to call Class loader to load class in memory at dymanic time
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		
			//Step 2: Database information 
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root","rootpass");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return con;
		
	}

}
