package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest2 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","nam2626","123456");
			String sql = "select * from "
					+ "(select s.student_no, s.student_name, m.major_name, s.score "
					+ "from student s ,major m WHERE s.major_no = m.major_no)"
					+ " where major_name like '%공학%'";
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(String.format("%s %s %s %.2f",
						rs.getString(1),rs.getString(2), 
						rs.getString(3),rs.getDouble(4)) );
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
