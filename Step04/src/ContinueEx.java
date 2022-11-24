
public class ContinueEx {
	public static void main(String[] args) {
		//1~10까지 숫자 중 짝수만 출력
		for(int i=1;i<11;i++) {
			if(i%2==1)
				continue;
			System.out.println(i);
		}
	}
}
