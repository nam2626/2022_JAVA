package method;

public class Student {
	//학번
	String studentNo;
	//이름
	String name;
	//학과명
	String majorName;
	//평점
	double score;
	
	//학생정보 초기화하는 메서드
	void initStudnet(String sno, String n, String major, double s) {
		studentNo = sno;
		name = n;
		majorName = major;
		score = s;
		
	}
	//학생정보 출력하는 메서드
	//출력형태 20012333 김철수 경영학과 3.6
	void printStudentInfo() {
		System.out.println(studentNo + " " + name + " " + majorName + " " + score);
	}
}










