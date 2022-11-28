package vo;

public class StudentVO {
	private String studentNo;
	private String studentName;
	private String majorName;
	private double score;

	//생성자 - 전체 필드 초기화
	public StudentVO(String studentNo, String studentName, String majorName, double score) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.majorName = majorName;
		this.score = score;
	}
	//setter/getter
	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	//toString
	@Override
	public String toString() {
		return "StudentVO [studentNo=" + studentNo + ", studentName=" + studentName + ", majorName=" + majorName
				+ ", score=" + score + "]";
	}
	
	
}
