package has_a_2;

public class Gun {
	protected int bullet;

	public Gun() {
		bullet = 12;
	}
	
	public void shot() {
		if(bullet > 0) {
			System.out.println("빵!");
			bullet--;
		}else {
			System.out.println("총알이 없습니다. 재장전 하세요.");
		}
	}
	
	public void reload() {
		bullet = 12;
		System.out.println("재장전 완료");
	}
	
	
}



