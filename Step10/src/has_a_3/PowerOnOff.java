package has_a_3;

public class PowerOnOff {
	protected boolean power;
	
	public void powerOnOff() {
		power = !power;
		
		if(power)
			System.out.println("전원 On");
		else
			System.out.println("전원 Off");
	}
	
	public void powerOn() {
		power = true;
		System.out.println("전원 On");
	}
	public void powerOff() {
		power = false;
		System.out.println("전원 Off");
	}
}

	
	
	
	
	
	