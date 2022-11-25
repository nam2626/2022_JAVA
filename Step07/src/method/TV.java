package method;

public class TV {
	int ch;
	int vol;
	boolean power;
	boolean mute;
	
	//초기화 - 채널값, 음량값, 전원, 음소거
	void init() {
		ch = 24;
		vol = 10;
		power = false;
		mute = false;
	}
	
	//전원OnOff
	//전원 켜져 있으면 끄기, 전원이 꺼져있으면 켜기
	//TV전원 On, TV전원 Off
	void powerOnOff() {
		power = !power;
		
		if(power) {
			System.out.println("TV 전원 On");
		}else {
			System.out.println("TV 전원 Off");
		}
	}
	
	//채널Up : 채널값을 하나만 올리면 됨, 올린 후에 (현재 채널 : XX) <-- 출력
	//채널(int) - 1 ~ 456
	void chUp() {
		if(!power)
			return;//메서드 강제 종료
		ch %= 456;
		ch++;
		System.out.println("현재 채널 : " + ch);
	}
	
	void chDown() {
		if(!power) return;
		
		ch--;
		if(ch < 1) ch = 456;
		System.out.println("현재 채널 : " + ch);
	}
}


















