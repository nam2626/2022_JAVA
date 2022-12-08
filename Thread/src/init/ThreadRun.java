package init;

public class ThreadRun extends Thread{
	
	public ThreadRun(String name) {
		super(name);
	}

	//자동으로 수행할 메서드
	@Override
	public void run() {
		for(int i=0;i<100;i++);
			//System.out.println(getName() + " " + i + "번째 일");
		System.out.println(getName() + " 스레드 종료");
	}

}
