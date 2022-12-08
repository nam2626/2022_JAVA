package init;

public class PlayerMain {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			Thread t = new Thread(new Player(),"플레이어"+i);
			t.start();
		}
	}

}
