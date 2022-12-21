package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import config.DBManager;
import exception.StudentException;
import vo.StudentVO;

public class StudentDAO {
	private static StudentDAO instance = new StudentDAO();

	private StudentDAO() {
	}

	public static StudentDAO getInstance() {
		if (instance == null)
			instance = new StudentDAO();
		return instance;
	}

	public void insertStudent(StudentVO studentVO) throws StudentException {
		// 받아온 StudentVO 객체를 DB에 저장
		Connection conn = DBManager.getInstance().getConn();

		String sql = "insert into student values(?,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, studentVO.getStudentNo());
			pstmt.setString(2, studentVO.getStudentName());
			pstmt.setDouble(3, studentVO.getScore());
			pstmt.setInt(4, studentVO.getMajorNo());

			pstmt.executeUpdate();
			System.out.println("학생정보 등록 완료");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new StudentException("회원정보 등록 실패");
		} finally {
			DBManager.getInstance().close(null, pstmt);
		}

	}

	public void deleteStudent(String studentNo) throws StudentException {
		Connection conn = DBManager.getInstance().getConn();

		String sql = "delete from student where student_no = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, studentNo);

			if(pstmt.executeUpdate()==0)
				throw new StudentException("학생정보 삭제 실패");
			System.out.println("학생정보 삭제 완료");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new StudentException("학생정보 삭제 실패");
		} finally {
			DBManager.getInstance().close(null, pstmt);
		}

	}

}
