package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

	public StudentVO selectStudentVO(String studentNo) {
		String sql = "SELECT s.STUDENT_NO , s.STUDENT_NAME ,m.MAJOR_NAME ,s.SCORE "
				+ "FROM STUDENT s, MAJOR m "
				+ "WHERE s.MAJOR_NO  = m.MAJOR_NO  AND s.STUDENT_NO  = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentVO vo = null;
		try {
			pstmt = DBManager.getInstance().getConn().prepareStatement(sql);
			pstmt.setString(1, studentNo);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new StudentVO(rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getDouble(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.getInstance().close(rs, pstmt);
		}
		
		return vo;
	}

}







