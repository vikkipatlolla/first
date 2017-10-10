package com.triffil;
import java.io.InputStream;
import java.sql.*;
import java.util.Scanner;
public class Dynamic {
	public static void main(String args[]) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/ui","root","triffil");
		System.out.println("MySQL JDBC Driver Registered!");
		String choice=null;
		int y=1,n=2;
		Scanner sc=new Scanner(System.in);
		switch(choice){
		
		case 1:System.out.println("do you want to insert the wlements then press 'y'");
		char y=scanner.nextline();
		do{
			System.out.print("Enter your email: ");
		
		String email = scanner.nextLine();

		System.out.print("Enter your  pass: ");
		String pass = scanner.nextLine();
		}while(k);
			break;
		case 2;System.out.println("To stop then press 'n'");
		}
		}
		
		catch(Exception e)
		{
			System.out.println("Not Connected");
		}
		}

	}
