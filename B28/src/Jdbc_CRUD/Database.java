package Jdbc_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	private static final String DRIVER_PATH="com.mysql.jdbc.Driver"; //com.mysql.jdbc.Driver  com.mysql.cj.jdbc.Driver
	
	private static final String DATABASE_URL="jdbc:mysql://localhost:3306/b28-db";
	private static final String USERNAME="root";
	private static final String PASSWORD="myroot03k";
	
	public Database() {
		try {
			Class.forName(DRIVER_PATH);
			
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Something Went Wrong."+ e);
		}
		
	}//End of Constructor
	

	public Connection getConnection() throws SQLException {
            return DriverManager.getConnection(DATABASE_URL, USERNAME,PASSWORD);
		
	}//End of the getconnection method
	
	
	
}