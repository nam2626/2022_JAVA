package service;

import java.util.Scanner;

import vo.StudentVO;

public class StudentService {
	private StudentVO[] arr;
	private int idx;
	
	public StudentService() {
		arr = new StudentVO[10];
	}
	
	//학생정보 추가
	public void appendStudent(Scanner sc) {
		System.out.println("학생정보 등록 작업을 시작합니다....");
		
		if(arr.length == idx) {//저장할 공간이 있는지 체크
			System.out.println("더 이상 등록할 공간이 없습니다.");
			return;
		}
		
		System.out.print("등록할 학생번호 : ");
		String studentNo=sc.nextLine();
		System.out.print("등록할 학생이름 : ");
		String studentName=sc.nextLine();
		System.out.print("등록할 학과명 : ");
		String majorName=sc.nextLine();
		System.out.print("등록할 평점 : ");
		double score=sc.nextDouble(); sc.nextLine();
		
		arr[idx++] = new StudentVO(studentNo, studentName, majorName, score);
		System.out.println("학생정보 등록 작업이 완료되었습니다.");
	}
	
	//전체 학생정보 출력
	public void printAllStudentInfo() {
		System.out.println("전체 학생 정보를 출력합니다........");
		if(idx == 0) {
			System.out.println("등록된 학생 정보가 하나도 없습니다.");
			return;
		}
		for(int i=0;i<idx;i++)
			System.out.println(arr[i]);
		
		System.out.println();
	}
	//학생정보 검색
	public int searchStudentInfo(Scanner sc) {
		System.out.println("학생정보 검색을 시작합니다......");
		//검색할 학번을 입력
		System.out.print("검색할 학번을 입력 : ");
		String studentNo = sc.nextLine();
		//배열에 등록된 학생 정보를 하나씩 읽어서 입력한 학번과 동일한지 체크
		for(int i=0;i<idx;i++) {
			//일치하면 해당 정보를 출력
			if(arr[i].getStudentNo().equals(studentNo)) {
				System.out.println("입력하신 학생정보를 찾았습니다.");
				System.out.println(arr[i]);
				return i;
			}
		}
		//검색된 정보가 없으면 검색결과가 없습니다.
		System.out.println("입력하신 학생번호에 해당하는 학생은 없습니다.");
		return -1;
	}
	
	//학생정보 삭제
	
	//학생정보 수정
	
}





