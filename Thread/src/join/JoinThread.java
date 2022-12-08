package join;

public class JoinThread extends Thread{

	public JoinThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName() + " - 스레드 종료");
	}
}
