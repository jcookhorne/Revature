package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import exceptions.SystemException;

public class DBUtil {
	// Using static to save memory because we only wanna call this once when
	// for each method.
	// Step 1 connect to driver
	static Connection conn;
	
	static {
		try {
			Class.forName("org.postgresql.Driver");			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Step 2 connect to Database
	static Connection getConnected()throws SystemException  {
		String username = "postgres";
		String password = "Yeshua7753";
		String connectionUrl = "jdbc:postgresql://127.0.0.1:5432/bank";
		if (conn == null) {
			try {
				conn = DriverManager.getConnection(connectionUrl, username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new SystemException();
			}		
		}
		return conn;
	}
	
	
	
	static void closeConnection()throws SystemException {
		try {
			conn.close();
		} catch (SQLException e) {
			throw new SystemException();
		}
	}
}
