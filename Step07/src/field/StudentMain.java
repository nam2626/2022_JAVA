package field;

public class StudentMain {

	public static void main(String[] args) {
		//Stduent 하나 생성
		Student std1 = new Student();
		std1.studentNo = "20235011";
		std1.name = "홍길동";
		std1.majorName = "경영학과";
		std1.score = 3.14;
		
		System.out.println(std1.studentNo + " " 
				+ std1.name + " " + std1.majorName + " " + std1.score);
	}

}
