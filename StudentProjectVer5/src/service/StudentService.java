package service;

import java.util.ArrayList;

import dao.StudentDAO;
import exception.StudentException;
import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();

	private StudentService() {	}

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}

	// 학생정보 추가
	public void insertStudentVO(StudentVO studentVO) throws StudentException {
		// DAO에 받아온 학생 객체를 보냄
		StudentDAO.getInstance().insertStudent(studentVO);
	}

	public StudentVO searchStudentVO(String studentNo) {
		// 받아온 학번을 DAO에 보내서 학번 기준으로 조회한 결과를 받음
		return StudentDAO.getInstance().selectStudentVO(studentNo);
	}

	public void deleteStudentVO(String studentNo) throws StudentException {
		StudentDAO.getInstance().deleteStudent(studentNo);
	}

	public ArrayList<StudentVO> selectAllStudentVO() {
		return StudentDAO.getInstance().selectAllStudentVO();
	}

}









