package init;

import java.util.Random;

public class Player implements Runnable{

	@Override
	public void run() {
		Random r = new Random();
		int d1 = r.nextInt(6) + 1;
		int d2 = r.nextInt(6) + 1;
		
		try {
			Thread.sleep(1000);//밀리초 단위로 잠시 멈춤
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " " + d1 + "," + d2);
		
	}

}






