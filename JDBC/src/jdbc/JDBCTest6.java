package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest6 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("학생정보 한건 입력");
			System.out.print("학번(8자리) : ");
			String sno = sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("평점 : ");
			double score = sc.nextDouble(); sc.nextLine();
			System.out.print("학과번호 : ");
			int major = sc.nextInt(); sc.nextLine();
						
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","nam2626","123456");
			String sql = "insert into student values(?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//?에 데이터를 셋팅
			pstmt.setString(1, sno);
			pstmt.setString(2, name);
			pstmt.setDouble(3, score);
			pstmt.setInt(4, major);
			int count = pstmt.executeUpdate();
			
			System.out.println(count +"건 적용되었습니다.");
			
			pstmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}




