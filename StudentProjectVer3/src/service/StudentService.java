package service;

import java.util.ArrayList;

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

	public StudentVO searchStudentVO(String studentNo) {
		int i = list.indexOf(new StudentVO(studentNo, null, null, 0));
		if(i != -1)
			return list.get(i);
		return null;
	}

	public boolean deleteStudentVO(StudentVO studentVO) {
		return list.remove(studentVO);
	}

}













