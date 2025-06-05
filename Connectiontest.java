package com.predator.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectiontest {
	public static void main(String[] args) {
		
		Connection con;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Ready...");
			con=DriverManager.getConnection("jdbc:mysql://mysql-1a7c146b-demo07python.c.aivencloud.com:13875/defaultdb?user=avnadmin&password=AVNS_1oOjGTIkf6chPnto32M");
			System.out.println("Connection established successfully....");
		} 
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in loading driver");
			//e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in database connection");
			//e.printStackTrace();
		}

	}

}
