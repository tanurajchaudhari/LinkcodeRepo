package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc1 {
	
//	static void insertData(int id ,String name,double marks ,Statement statement) throws SQLException {
//		statement.execute("insert into jdbc1 values('"+id+"','"+name+"','"+marks+"')");
//	}
	
	
	static void insertData2(Student student) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 System.out.println("Driver class loaded");
		 
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_springboot","root","Tanuraj@892002");
		 System.out.println("get connection ");
		 
		 Statement statement = connection.createStatement();
		 
			statement.execute("insert into jdbc1 values('"+student.getId()+"','"+student.getName()+"','"+student.getMarks()+"')");

		 
	}
	
	static void getAllData() throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 System.out.println("Driver class loaded");
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_springboot","root","Tanuraj@892002");
		 System.out.println("get connection ");
		 Statement statement = connection.createStatement();
		 ResultSet rs = statement.executeQuery("select * from jdbc1");
		 while(rs.next()) {
			 System.out.println("id : "+rs.getInt("id"));
			 System.out.println("name : "+rs.getString("name"));
			 System.out.println("marks : "+rs.getDouble("marks"));
			 System.out.println("========================================");
		 }
		 
	}
	
	static void deleteOne(int id) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 System.out.println("Driver class loaded");
		 
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_springboot","root","Tanuraj@892002");
		 System.out.println("get connection ");
		 
		 Statement statement = connection.createStatement();
		 statement.execute("delete from jdbc1 where id='"+id+"'");
		 
	}
	static void deleteAll() throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 System.out.println("Driver class loaded");
		 
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_springboot","root","Tanuraj@892002");
		 System.out.println("get connection ");
		 
		 Statement statement = connection.createStatement();
		 statement.execute("truncate table jdbc1");
		 
	}
	
	static void getOneData(int id) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 System.out.println("Driver class loaded");
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_springboot","root","Tanuraj@892002");
		 System.out.println("get connection ");
		 Statement statement = connection.createStatement();
		 ResultSet rs = statement.executeQuery("select * from jdbc1 where id='"+id+"'");
//		 while(rs.next()) {
//			 System.out.println("id : "+rs.getInt("id"));
//			 System.out.println("name : "+rs.getString("name"));
//			 System.out.println("marks : "+rs.getDouble("marks"));
//			 System.out.println("========================================");
//		 }
		 
		 if(rs.next()) {
			 System.out.println("id : "+rs.getInt("id"));
			 System.out.println("name : "+rs.getString("name"));
			 System.out.println("marks : "+rs.getDouble("marks"));
			 System.out.println("========================================");
		 }
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 System.out.println("Driver class loaded");
		 
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_springboot","root","Tanuraj@892002");
		 System.out.println("get connection ");
		 
		 Statement statement = connection.createStatement();
//		 statement.execute("create database practice_Springboot");
//		 System.out.println("Database is created ");
		 
//		 statement.execute("create table jdbc1(id int,name varchar(40),marks double)");
//		 System.out.println("table is created ");
		 
//		 statement.execute("insert into jdbc1  values(1,'Sameer',87.89)");
		  
//		 statement.execute("insert into jdbc1 values(2,'Karan',86.70),(3,'sujal',89.07)");
		
//		 int id=4;String name="sudarshan";double marks=79.75;
//		 statement.execute("insert into jdbc1 values('"+id+"','"+name+"','"+marks+"')");
//		 
//		 Scanner sc= new Scanner(System.in);
//		 int id=sc.nextInt();
//		 String name=sc.next();
//		 double marks=sc.nextDouble();
		 
		 
//		 insertData(id, name, marks, statement);
		 
//		 Student student= new Student();
//		 student.setId(id);
//		 student.setName(name);
//		 student.setMarks(marks);
//		 
//		 insertData2(student);
		 
//		 getAllData();
		 
		 
//		 getOneData(2);
//		 deleteOne(6);
		 
		 deleteAll();
		 System.out.println("Code run successfully");
		
	}

}
