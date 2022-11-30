package inter_ex;

public class InterClass implements InterA, InterB{

	@Override
	public void interA() {
		System.out.println("interA");
	}

	@Override
	public void interB() {
		System.out.println("InterB");
	}
}
