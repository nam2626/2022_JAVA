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
	
	//숫자 두개를 매개변수로 받아서 두 숫자 중 큰 숫자를 리턴하는 메서드
	int max(int a, int b) {
		if(a>b)
			return a;
		else
			return b;
	}
	//숫자 두개를 매개변수로 받아서 두 숫자 중 작은 숫자를 리턴하는 메서드
	int min(int a, int b) {
		if(a<b)
			return a;
		else
			return b;
	}
	
	
}











