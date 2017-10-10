package com.triffil;
import java.sql.*;

public class Delete {
	public static void main(String args[]) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/ui","root","triffil");
		PreparedStatement stmt=c.prepareStatement("delete from Login where pass=?");  
		stmt.setString(1,"ram");  
		  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records deleted");  
		System.out.println("MySQL JDBC Driver Registered!");
		}
		catch(Exception e)
		{
			System.out.println("Not Connected");
		}

	}}
