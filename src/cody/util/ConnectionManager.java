package cody.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {

		private static ConnectionManager instance = null;
		
		private final String USERNAME = "root";
		private final String PASSWORD = "toor";
		private final String CONN_STRING = "jdbc:mysql://localhost/snipet_djeljenje";
		private final String DRIVER = "com.mysql.jdbc.Driver";
		
		private Connection connection = null;

		private ConnectionManager() {

		}

		public static ConnectionManager getInstance() {
			if (instance == null) {
				instance = new ConnectionManager();
			}
			return instance;
		}

		private boolean openConnection() {
			try {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
				return true;
			} catch (Exception e) {
				System.err.println(e);
				return false;
			}
		}

		public Connection getConnection() {
			if (connection == null) {
				if (openConnection()) {
					 System.out.println("Connection opened");
					return connection;
				} else {
					return null;
				}
			}
			return connection;
		}

		public void close() {
			 System.out.println("Closing connection");
			try {
				connection.close();
				connection = null;
			} catch (Exception e) {
			}
		}
}
