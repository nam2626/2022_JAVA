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
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		}
		
		return controller;
	}
	
}












