package inner;

public class Outter {
	private int outter;

	public Outter(int outter) {
		this.outter = outter;
	}
	
	public void printOutter() {
		System.out.println("outter : " + outter);
//		Outter 클래스는 Inner 객체를 특정할 수가 없음
//		System.out.println("inner : " + inner);
	}
	
	public class Inner{
		private int inner;

		public Inner(int inner) {
			this.inner = inner;
		}
		
		public int sum() {
			return outter + inner;
		}
	}
}







