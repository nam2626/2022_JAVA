package service;

import java.util.ArrayList;

import dao.StudentDAO;
import exception.StudentException;
import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();
	private ArrayList<StudentVO> list;
	
	private StudentService() {
		list = new ArrayList<StudentVO>();
		list.add(new StudentVO("1111", "김철수", "경제학과", 3.14));
		list.add(new StudentVO("2222", "이영희", "경영학과", 2.44));
		list.add(new StudentVO("3333", "박영수", "컴퓨터공학과", 4.24));
	}

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}
	
	public ArrayList<StudentVO> getList() {
		return list;
	}

	//학생정보 추가
	public void insertStudentVO(StudentVO studentVO) throws StudentException {
		//DAO에 받아온 학생 객체를 보냄
		StudentDAO.getInstance().insertStudent(studentVO);
	}

	public StudentVO searchStudentVO(String studentNo) {
		return null;
	}

	public void deleteStudentVO(String studentNo) throws StudentException {
		StudentDAO.getInstance().deleteStudent(studentNo);
	}

}













