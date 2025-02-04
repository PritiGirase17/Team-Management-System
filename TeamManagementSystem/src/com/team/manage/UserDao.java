package com.team.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class UserDao 
{
	public static boolean insertUserToDB(User u)
	{
		boolean f = false;
		try
		{
			Connection con = CP.createC();
			String q="insert into users(uname,uphone,uaddress) values(?,?,?)";
			
			PreparedStatement pstmt=con.prepareStatement(q);
			
			pstmt.setString(1, u.getUserName());
			pstmt.setString(2, u.getUserPhone());
			pstmt.setString(3, u.getUserAddress());
			
			pstmt.executeUpdate();
			f=true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	public static boolean deleteUsers(int userId) {
		
		boolean f=false;
		try 
		{
			Connection con = CP.createC();
			
			String q = "delete from employee where eid=?";
			
			PreparedStatement prestmt = con.prepareStatement(q);
			
			prestmt.setInt(1, userId);
			
			
			prestmt.execute();
			f=true;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return f;
	}

	public static void showAllUsers() {
		

		boolean f=false;
		try 
		{
			Connection con = CP.createC();
			
			String q = "select * from employee;";
			
		  Statement stmt = con.createStatement();
		  
		  ResultSet set = stmt.executeQuery(q);
			
		  while(set.next())
		  {
			  int id=set.getInt(1);
			  String name=set.getString(2);
		  }
		
		
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
}
