package com.triffil;
import java.sql.*;

import com.mysql.jdbc.ResultSet;

public class Select_query {
public static void main(String args[]) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/ui","root","triffil");
		PreparedStatement stmt=c.prepareStatement("select * from Login");  
		ResultSet rs=(ResultSet) stmt.executeQuery();  
		while(rs.next())
		{  
				String email=rs.getString("email");
				String pass=rs.getString("pass");
				
		System.out.println(rs.getString(1)+" "+rs.getString(2));  
		}  
  
		System.out.println("MySQL JDBC Driver Registered!");
		}
		catch(Exception e)
		{
			System.out.println("Not Connected");
		}
		}
		}
