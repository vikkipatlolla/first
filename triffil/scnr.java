package com.triffil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class scnr {
public static void main(String[] args){
	try{
		
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ui","root","triffil");
	PreparedStatement stmt=c.prepareStatement("insert into la values(?,?)");
	System.out.println("connected");
	String p ="no";
	Scanner scanner = new Scanner(System.in);
	while(true){
		System.out.print("Enter your email: ");
		String email = scanner.next();
		stmt.setString(1, email);
		System.out.print("Enter your  pass: ");
		String pass = scanner.next();
		stmt.setString(2, pass);
		stmt.executeUpdate();
		System.out.println(" Select yes or no");
		String s=scanner.next();
		if (s.equalsIgnoreCase(p)){
			break;
		}
	}
	}catch(Exception e){
		System.out.println(e);
	}
}
}
