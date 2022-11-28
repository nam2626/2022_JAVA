package constructor;

public class EmployeeMain {

	public static void main(String[] args) {
		//emp1 객체를 생성하면 emp1에 있는 this가 emp1과 동일하다.
		Employee emp1 = new Employee("1111", "김철수", "총무부", "대리");
		System.out.println(emp1.toString());
		System.out.println(emp1);
		
	}

}
