package array;

public class Student {
	// 학번
	private String studentNo;
	// 이름
	private String name;
	// 학과명
	private String majorName;
	// 평점
	private double score;
	
	//생성자
	public Student(String sno, String n, String m, double s) {
		studentNo = sno;
		name = n;
		majorName = m;
		if(s >= 0.0 && s <= 4.5) {
			score = s;
		}
	}
	
	//setter getter
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String sno) {
		studentNo = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		studentNo = n;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String m) {
		majorName = m;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double s) {
		if(s >= 0.0 && s <= 4.5) {
			score = s;
		}
	}
	//학생정보 출력
	public void printStudentInfo() {
		System.out.println(studentNo + " " + name + " " + majorName + " " + score + getGrade());
	}

	private String getGrade() {
		if(score == 4.5)
			return "(A+)";
		else if(score >= 4.0)
			return "(A)";
		else if(score >= 3.5)
			return "(B+)";
		else if(score >= 3.0)
			return "(B)";
		else if(score >= 2.5)
			return "(C+)";
		else if(score >= 2.0)
			return "(C)";
		else if(score >= 1.5)
			return "(D+)";
		else if(score >= 1.0)
			return "(D)";
		else
			return "(F)";
	}

	
	
	
}










