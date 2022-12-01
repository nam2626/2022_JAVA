package generic;

public class BoxMain {

	public static void main(String[] args) {
		Box box = new Box();
		
		box.setObj(200);
		System.out.println(box.getObj());
		
		box.setObj(new Apple());
		Apple a = (Apple) box.getObj();
		a.printApple();
		if(box.getObj() instanceof Orange) {
			Orange o = (Orange) box.getObj();
			o.printOrange();
		}
	}

}
