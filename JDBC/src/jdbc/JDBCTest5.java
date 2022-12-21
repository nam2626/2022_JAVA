package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest5 {

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
			String sql = String.format("insert into student values('%s','%s',%f,%d)",
					sno,name,score,major);
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




