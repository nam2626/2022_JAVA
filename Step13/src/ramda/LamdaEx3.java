package ramda;

public class LamdaEx3 {

	public static void main(String[] args) {
		Method<String> m1 = (a) -> System.out.println(a);
		m1.run("Hello");
		//정수 - 제곱의 결과 출력
		Method<Integer> m2 = (a) -> System.out.println(a * a);
		m2.run(100);
		//실수 - 원넓이 결과 출력
		Method<Double> m3 = (a) -> System.out.println(a * a * 3.1415);
		m3.run(4.14);
	}

}
