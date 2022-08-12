package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConfig {

	public static Connection getConnection(Properties props) {
        
		Connection  conn=null;
		try {
			
			Class.forName(props.getProperty("driver"));
		
					
			conn= DriverManager.getConnection(
					props.getProperty("url"),
					props.getProperty("username"),
					props.getProperty("password"));
			 
			
		} catch (ClassNotFoundException e) {
			
			System.out.println(e);
		}catch (SQLException e) {
		
			System.out.println(e);
		}
		return conn;
	}
}
