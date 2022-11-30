package has_a_3;

public class PowerOnOff {
	private boolean power;
	
	public void powerOnOff() {
		power = !power;
		
		if(power)
			System.out.println("전원 On");
		else
			System.out.println("전원 Off");
			
	}
}
