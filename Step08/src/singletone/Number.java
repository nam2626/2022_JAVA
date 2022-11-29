package singletone;

public class Number {
	//최초에 한번만 객체 생성
	private static Number instance = new Number();
	private int count;
	
	//private 생성자는 외부에서 생성을 못하게 막음
	private Number() {
		System.out.println("Number 객체 생성");
		count++;
	}
	
	public static Number getInstance() {
		if(instance == null)
			instance = new Number();
		return instance;
	}

	public int getCount() {
		return count;
	}

}







