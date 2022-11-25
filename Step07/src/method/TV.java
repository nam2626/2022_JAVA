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
		if(power) {
			power = false;
			System.out.println("TV 전원 Off");
		}else {
			power = true;
			System.out.println("TV 전원 On");
		}
	}
	
}










