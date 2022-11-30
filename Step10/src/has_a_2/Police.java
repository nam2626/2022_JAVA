package has_a_2;

public class Police extends Gun{
	private int handcuffs;
	
	public Police() {
		handcuffs = 3;
	}
	
	public void shot() {
		super.shot();
	}

	public void reload() {
		super.reload();
	}

	public void userHandcuffs(){
		if(handcuffs > 0) {
			handcuffs--;
			System.out.println("수갑을 사용합니다.");
		}
	}
}




