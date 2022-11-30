package has_a_2;

public class AK47 extends Gun{

	public AK47() {
		bullet = 24;
	}
	
	@Override
	public void shot() {
		if(bullet > 0) {
			bullet -= 3;
			System.out.println("빵빵빵!");
		}else 
			System.out.println("총알이 부족합니다 재장전 하세요.");
	}
	@Override
	public void reload() {
		bullet = 24;
		System.out.println("AK47 재장전 완료");
	}
}



