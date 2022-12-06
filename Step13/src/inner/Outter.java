package inner;

public class Outter {
	private int outter;

	public Outter(int outter) {
		this.outter = outter;
	}
	
	public void printOutter() {
		System.out.println("outter : " + outter);
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







