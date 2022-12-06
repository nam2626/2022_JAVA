package inner;

public class OutterStaticClass {
	private int outter;
	private static double n = 23.1234;
	
	public OutterStaticClass(int outter) {
		this.outter = outter;
	}
	
	public static class InnerStaticClass{
		private int i;

		public InnerStaticClass(int i) {
			this.i = i;
		}
		
		public int sum() {
//			return outter + i;//outter가 None static 이기 떄문에 접근이 불가능
			return (int)(n + i);
		}
		
	}
	
}

