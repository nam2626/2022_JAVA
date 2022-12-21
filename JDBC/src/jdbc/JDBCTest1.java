package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest1 {

	public static void main(String[] args) {
		try {
			//1. Driver Load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. DB Connect
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe","nam2626","123456");
			//3. SQL Generate
			String sql = "select * from student";
			//4. State Create
			Statement stmt = conn.createStatement();
			//5. SQL Excute
			//6. Close
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}





