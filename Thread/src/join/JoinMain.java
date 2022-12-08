package join;

public class JoinMain {

	public static void main(String[] args) {
		JoinThread join1 = new JoinThread("Join 스레드 - 1");
		JoinThread join2 = new JoinThread("Join 스레드 - 2");
		JoinThread join3 = new JoinThread("Join 스레드 - 3");
		
		join1.start();
		join2.start();
		join3.start();

		try {
			join1.join();
			join2.join(1000); //join2 작업을 1초동안만 기달리겠다.
			join3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 종료");
	}

}









