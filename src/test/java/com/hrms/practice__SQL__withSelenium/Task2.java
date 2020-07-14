package com.hrms.practice__SQL__withSelenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
/*
 *  display the information from nationality table, 
	but display id "nationality_id", name = "nationality"
 */
public class Task2 {

		String dbUsername = "syntax_hrm";
		String dbPassword = "syntaxhrm123";
		//jdbc: driver type:hostname:port/db name
		String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
		@Test
		public void getAndStoreData() throws SQLException {
			
			
			Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from ohrm_nationality");
			
			ResultSetMetaData rsMetaData = rs.getMetaData();
			
			
			List<Map<String, String>> listOfData = new ArrayList<>();
			Map<String, String> mapData;
			
			
			while(rs.next()) {
				
				mapData = new LinkedHashMap<>();
				
				for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
					if(rsMetaData.getColumnName(i).equalsIgnoreCase("id")) {
						mapData.put("Nationality ID", rs.getObject(i).toString());
					}else if(rsMetaData.getColumnName(i).equalsIgnoreCase("name")) {
						mapData.put("Nationality", rs.getObject(i).toString());
					}
				}
				listOfData.add(mapData);
			}
			
			System.out.println(listOfData);
			
			
			// we have to close inside the @Test
			rs.close();
			st.close();
			conn.close();
		}
	}