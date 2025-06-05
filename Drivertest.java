package com.predator.programs;

public class Drivertest {
	public static void main(String[] args) {
	System.out.println("First JDBC program");
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver loaded successfully...");
	}
	catch(ClassNotFoundException e)
	{
		System.out.println(e);
	}
	}
}
