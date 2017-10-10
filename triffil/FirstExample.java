package com.triffil;
import java.sql.Connection;
import java.sql.DriverManager;
public class FirstExample {
public static void main(String args[]) {
try {
Class.forName("com.mysql.jdbc.Driver");
Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/ui","root","triffil");
System.out.println("MySQL JDBC Driver Registered!");
}
catch(Exception e)
{
	System.out.println("Not Connected");
}
}
}