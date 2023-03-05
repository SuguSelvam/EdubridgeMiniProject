package com.employee_management_application;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	static Connection con;
	public static Connection createDbConnection() {
		
		try {
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection
			String url = "jdbc:mysql://localhost:3306/project";
			String username = "root";
			String password = "Sugan@24";
			con = DriverManager.getConnection(url, username, password);
		
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;

}
}
