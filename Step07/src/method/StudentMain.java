package method;

public class StudentMain {

	public static void main(String[] args) {
		Student std1  = new Student();
		std1.initStudnet("20402324", "홍길동", "경영학과", 4.11);
		std1.printStudentInfo();
		Student std2  = new Student();
		std2.initStudnet("20113245", "김철수", "게임학과", 2.13);
		std2.printStudentInfo();
	}

}
