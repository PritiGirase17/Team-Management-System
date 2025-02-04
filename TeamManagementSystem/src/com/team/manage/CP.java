package com.team.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
	 
	static Connection con;
	
    public static Connection createC() throws SQLException
    {
    	
    	//if we want to provide the connection 
    	//then we need to follow some steps
    	
    	try 
    	{
    		// step:1 load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step:2 create the connection......
			String url = "jdbc:mysql://localhost:3306/TeamManagement";
			
			String user = "root";
			
			String password = "992211";
			
			con = DriverManager.getConnection(url, user, password);
		} 
    	catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
    	
    	return con;
    	
    }
}
