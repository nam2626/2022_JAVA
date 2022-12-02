package math;

public class MathTest {

	public static void main(String[] args) {
		//절대값
		System.out.println(Math.abs(-100));
		
		//올림
		System.out.println(Math.ceil(3.4)); //4
		System.out.println(Math.ceil(-3.4));//-3
		//내림
		System.out.println(Math.floor(3.4));
		System.out.println(Math.floor(-3.4));
		//반올림
		System.out.println(Math.round(3.4));
		System.out.println(Math.round(-3.4));
		
		//최대값, 최소값
		System.out.println(Math.max(21, 30));
		System.out.println(Math.min(21, 30));
		
		//삼각함수
		System.out.println(Math.sin(45));
		System.out.println(Math.cos(45));
		System.out.println(Math.tan(45));
		
		//pi
		System.out.println(Math.PI);
		
		//random
		System.out.println(Math.random());
		
		System.out.println("-----");
		//1~10까지 숫자 중 랜덤하게 뽑기
		for(int i=0;i<=50;i++) {
			System.out.println(Math.floor(Math.random()*10)+1);
		}
		System.out.println("-----");
		//소수점내림(임의의수 * (최대값 - 최소값 + 1))  + 최소값
		//10~17까지 숫자 중 랜덤하게 뽑기
		for(int i=0;i<=50;i++) {
			System.out.println(Math.floor(Math.random()*8)+10);
		}
		
	}

}










