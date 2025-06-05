package com.predator.programs;
import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Input {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the Car id : ");
		n=sc.nextInt();
		
		
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-1a7c146b-demo07python.c.aivencloud.com:13875/demopython?user=avnadmin&password=AVNS_1oOjGTIkf6chPnto32M");
			pst=con.prepareStatement("select*from supercars where id=?");
			pst.setInt(1,n);
			rs=pst.executeQuery();
			
			if(rs.next())
				System.out.println(rs.getString("brand_name"));
			else
					System.out.println("Not found");
			
			con.close();
		}
		catch(Exception e){
			
			System.out.println(e);
	}
}
}
