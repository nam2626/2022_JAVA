package dao;

import vo.StudentVO;

public class StudentDAO {
	private static StudentDAO instance = new StudentDAO();

	private StudentDAO() {	}

	public static StudentDAO getInstance() {
		if(instance == null)
			instance = new StudentDAO();
		return instance;
	}

	public void insertStudent(StudentVO studentVO) {
		//받아온 StudentVO 객체를 DB에 저장
		
	}

	
}







