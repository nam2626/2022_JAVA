package inter_diamond;

public class TestMain {

	public static void main(String[] args) {
		ClassE e = new ClassE();
		
		System.out.println(e instanceof A);
		System.out.println(e instanceof B);
		System.out.println(e instanceof C);
		System.out.println(e instanceof D);
		
		
	}

}
