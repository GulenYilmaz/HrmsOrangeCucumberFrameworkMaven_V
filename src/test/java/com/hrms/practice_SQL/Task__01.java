package com.hrms.practice_SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

// retrieve all the job titles 
//and store them in arraylist and show it in console it from arraylist
public class Task__01 {
	

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	//jdbc:driver type:hostname:port/db name
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	
	@Test
	public void dataBaseDemo1() throws SQLException {
		Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		System.out.println("DB Connection is successful");
		System.out.println(connection);
		
		Statement st = connection.createStatement();
		ResultSet resultSet = st.executeQuery("select job_title from ohrm_job_title");
		
		List<String> jobTitle=new ArrayList<>();
//		System.out.println("EmployeeID"+"  "+"FirstName" +"\t"+ "LastName");
		while (resultSet.next()) {
			jobTitle.add(resultSet.getString("job_title"));
		}
		
		// or we can print first way using for while
		System.out.println(jobTitle);
		
		// or we can print second way using for each loop
		System.out.println("Job Title");
		System.out.println("===========");
		for(String s:jobTitle) {
			System.out.println(s);
		}
		resultSet.close();
		st.close();
		connection.close();
	}
}
