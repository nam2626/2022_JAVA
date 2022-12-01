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
	
	//학생정보 추가
	public boolean appendStudentVO(StudentVO studentVO) {
		//받아온 학생 객체를 리스트에 추가.
		//단, 학번이 중복되면 리스트에 추가하지 못하게끔 처리
		//등록이 되면 true 리턴, 등록 실패하면 false를 리턴
		
		//1. 중복 체크
		if(list.contains(studentVO)) {
			return false;
		}else {
			//2. 리스트에 데이터 추가
			return list.add(studentVO);
		}
	}

}










