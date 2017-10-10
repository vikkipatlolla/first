package com.triffil;
import java.sql.*;
public class Con {
	public static void main(String[] args) throws Exception {
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ui","root","triffil");
		PreparedStatement stmt=c.prepareStatement("insert into Login values(?,?)");  
		stmt.setString(1,"ashokhgghjghghghhjghjgjg");
		stmt.setString(2,"vignesh");  
		  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
		  
		System.out.println("connected");
		c.close();
		}
		catch(Exception e){
		System.out.println(e);
		System.out.println("disconnected");
		}
	}

}
