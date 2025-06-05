package com.predator.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Selectquery {
	public static void main(String[] args) {
		
		Connection con;
		Statement st;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-1a7c146b-demo07python.c.aivencloud.com:13875/demopython?user=avnadmin&password=AVNS_1oOjGTIkf6chPnto32M");
			System.out.println("Connection and Driver established successfully....");
			st=con.createStatement();
			rs=st.executeQuery("select*from supercars");
			System.out.println("Query executed successfully....");
			
			while(rs.next()){
				System.out.println(rs.getString("brand_name")+"|"+rs.getString("model_name")+":-"+rs.getString("price"));
				
			}
			con.close();
		}
		catch(Exception e){
			
			System.out.println(e);
		}
	}
}
