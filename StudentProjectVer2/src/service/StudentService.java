package service;

import java.util.ArrayList;

import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();
	private ArrayList<StudentVO> list;
	
	private StudentService() {
		list = new ArrayList<StudentVO>();
	}

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}

}
