package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest4 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","nam2626","123456");
			String sql = "insert into student values('20112332','홍길동',3.24,1)";
			Statement stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);//insert, update, delete
			
			System.out.println(count +"건 적용되었습니다.");
			
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}




