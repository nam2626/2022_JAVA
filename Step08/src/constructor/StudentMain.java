package constructor;

public class StudentMain {

	public static void main(String[] args) {
		Student std1 = new Student("201243124", "김철수", "경제학과", 3.6);
		std1.printStudentInfo();
		
		//Student std2 = new Student();
	}

}
