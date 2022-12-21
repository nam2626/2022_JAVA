package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	private static DBManager instance = new DBManager();
	private Connection conn;
	
	private DBManager() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe",
					"nam2626","123456");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConn() {
		return conn;
	}

	public static DBManager getInstance() {
		if(instance == null)
			instance = new DBManager();
		return instance;
	}

	
	
	
}
