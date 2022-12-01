package controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {
	}

	public static HandlerMapping getInstance() {
		if(instance == null)
			instance = new HandlerMapping();
		return instance;
	}

	public Controller createController(int no) {
		Controller controller = null;
		
		switch(no) {
		case 1:
			controller = new StudentAppendController();
			break;
		case 2:
			controller = new StudentPrintAllController();
			break;
		case 3:
			controller = new StudentSearchController();
			break;
		case 4:
			break;
		case 5:
			break;
		}
		
		return controller;
	}
	
}












