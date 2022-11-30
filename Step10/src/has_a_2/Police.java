package has_a_2;

public class Police{
	private int handcuffs;
	private Gun gun; 
	
	public Police(Gun gun) {
		handcuffs = 3;
		this.gun = gun;
	}
	
	public void shot() {
		gun.shot();
	}

	public void reload() {
		gun.reload();
	}

	public void userHandcuffs(){
		if(handcuffs > 0) {
			handcuffs--;
			System.out.println("수갑을 사용합니다.");
		}
	}
}




