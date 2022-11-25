package method;

public class TVMain {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.init();
		
		tv.powerOnOff();
		
		for(int i=0;i<500;i++)
			tv.chUp();
		
		for(int i=0;i<50;i++)
			tv.volUp();
		
		for(int i=0;i<50;i++)
			tv.volDown();
	}

}
