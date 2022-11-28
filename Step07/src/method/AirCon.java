package method;

public class AirCon {
	//모드 - 냉방 - 0, 송풍 - 1, 제습 - 2
	int mode;
	//온도 - 18 ~ 32
	int temp;
	//풍량 - 약 - 0, 중 - 1 , 강 - 2, 자동 - 3
	int windMode;
	//바람각도 - 자동, 고정
	boolean windAngle;
	//전원 - On, Off
	boolean power;
	
	//초기화
	void init() {
		mode = 24;
	}
	
	//전원OnOff
	void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("에어컨 전원 On");
		else
			System.out.println("에어컨 전원 Off");
	}
	//온도Up
	void tempUp() {
		//전원 체크
		if(!power) return;
		//운전 모드 체크
		if(mode != 0) return;
		//온도 증가
		//최대값 처리
		if(temp < 32) temp++;
		
		System.out.println("현재 온도 : "+temp);
	}
	//온도Down
	void tempDown() {
		//전원 체크
		if(!power) return;
		//운전 모드 체크
		if(mode != 0) return;
		//온도 감소
		//최소값 처리
		if(temp > 18) temp--;
		
		System.out.println("현재 온도 : "+temp);
	}
	//모드변경
	final String[] AIRCON_MODE = {"냉방","송풍","제습"};
	void changeMode() {
		if(!power) return;
		mode++;
		mode %= 3;
		System.out.println(AIRCON_MODE[mode] + " 모드로 전환합니다.");
	}
	//바람각도 조정
	void changeWindAngle() {
		if(!power) return;
		
		windAngle = !windAngle;
		
		System.out.println(windAngle ? "바람각을 고정합니다." : "바람각을 자동으로 합니다.");
	}
	
	//풍량변경
	final String[] WIND_POWER_MODE = {"약","중","강","자동"};
	void changeWindPower() {
		if(!power) return;
		
		windMode++;
		windMode %= 4;
		
		System.out.println("바람세기 : "+WIND_POWER_MODE[windMode]);				
	}
	
}






