package method;

public class Calcurator {
	int n1;
	int n2;

	void init(int a, int b) {
		n1 = a;
		n2 = b;
	}
	
	int plus() {
		int result = n1 + n2;
		return result;
	}
	//뺄셈 결과 리턴하는 메서드
	int minus() {
		return n1 - n2;
	}
	//곱셈 결과 리턴하는 메서드
	int multiple() {
		return n1 * n2;
	}
	//나눗셈 결과 리턴하는 메서드
	int divisor() {
		return n1 / n2;
	}
	
	
	
	
}











