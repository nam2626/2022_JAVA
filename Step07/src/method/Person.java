package method;

public class Person {
	//이름
	String name;
	//나이
	int age;
	//성별
	boolean gender;
	
	//인적정보 출력하는 기능
	void printPersonInfo(){
		System.out.println(name + " " + age + " " + (gender ? "남자" : "여자"));
	}
	
}
