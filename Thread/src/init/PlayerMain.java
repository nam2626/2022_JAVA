package init;

import java.util.Random;

public class PlayerMain {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
//			Thread t = new Thread(new Player(),"플레이어"+i);
			Thread t = new Thread(()->{
				Random r = new Random();
				int d1 = r.nextInt(6) + 1;
				int d2 = r.nextInt(6) + 1;
				
				try {
					Thread.sleep(1000);//밀리초 단위로 잠시 멈춤
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + " " + d1 + "," + d2);
				
			}, "플레이어"+i);
			t.start();
		}
	}

}


