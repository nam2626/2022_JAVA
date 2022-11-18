
public class ShortCircuit {

	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		
		boolean result = n1 != 10 && ++n2 == 10;
		System.out.println(result); //false
		System.out.println(n2); //20
		
		result = n1 == 10 || ++n2 == 10;
		System.out.println(result); //true
		System.out.println(n2); //20
	}

}
