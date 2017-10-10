package com.triffil;
import java.sql.*;
public class Update {
	public static void main(String args[]) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/ui","root","triffil");
		PreparedStatement stmt=c.prepareStatement("update Login set email=? where pass=?");  
		stmt.setString(1,"ashokgd");
		stmt.setString(2,"vignesh");  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records updated");  
		System.out.println("MySQL JDBC Driver Registered!");
		}
		catch(Exception e)
		{
			System.out.println("Not Connected");
		}
		}

}
