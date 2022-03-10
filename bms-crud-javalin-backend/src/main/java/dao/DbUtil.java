package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	static Connection conn;
	static {
		// step 1
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	static Connection obtainConnection() {
		// step 2 - establish connection with DB
		// specify IP-address, port number, protocol, credentials
		// connection url has protocol // IPaddress:portnumber/DBname
		String username = "postgres";
		String password = "Yeshua7753";
		String connectionUrl = "jdbc:postgresql://127.0.0.1:5432/bms";

		if (conn == null) {
			try {
				conn = DriverManager.getConnection(connectionUrl, username, password);
				System.out.println("Connections established");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return conn;
	}
}
