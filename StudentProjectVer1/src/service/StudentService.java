package service;

import java.util.Scanner;

import vo.StudentVO;

public class StudentService {
	private StudentVO[] arr;
	private int idx;
	
	public StudentService() {
		arr = new StudentVO[10];
		arr[idx] = new StudentVO("1111", "김철수", "경제학과", 3.14);
		idx++;
		arr[idx] = new StudentVO("2222", "이영희", "경영학과", 2.44);
		idx++;
		arr[idx] = new StudentVO("3333", "박영수", "컴퓨터공학과", 4.24);
		idx++;
		
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
	public void deleteStudentVO(Scanner sc) {
		System.out.println("학생 정보 삭제를 시작합니다......");
		int r = searchStudentInfo(sc); //삭제할 학생 정보가 위치한 배열 인덱스 결과값을 받음
		//검색한 결과가 없는 경우 -1을 받음
		if(r == -1) return;
		
		//-1이아니면 삭제할 데이터가 있다라고 판단 후 삭제 작업을 수행
		for(int i=r;i<idx-1;i++) {
			arr[i] = arr[i+1];
		}
		//삭제 완료 후 인덱스값을 1 감소;
		idx--;
		System.out.println("삭제 작업이 정상적으로 이루어 졌습니다.");
	}

	//학생정보 수정
	public void updateStudentVO(Scanner sc) {
		System.out.println("학생 정보 수정을 시작합니다........");
		int r = searchStudentInfo(sc);//수정할 학생 정보를 검색
		if(r == -1) return; //수정할 정보가 없으면 메서드 종료
		
		System.out.print("수정할 학생이름 : ");
		String studentName=sc.nextLine();
		System.out.print("수정할 학과명 : ");
		String majorName=sc.nextLine();
		System.out.print("수정할 평점 : ");
		double score=sc.nextDouble(); sc.nextLine();
		
		//입력 받은 데이터를 set 메서드 이용해서 수정
		arr[r].setStudentName(studentName);
		arr[r].setMajorName(majorName);
		arr[r].setScore(score);
		
		System.out.println("학생 데이터 수정 완료");
	}
	
}











