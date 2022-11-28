package method;

public class AirConTest {

	public static void main(String[] args) {
		AirCon airCon = new AirCon();
		airCon.init();
		airCon.powerOnOff();
		airCon.changeMode();
		airCon.changeMode();
		airCon.changeMode();
		airCon.changeWindAngle();
		airCon.changeWindAngle();
		airCon.changeWindAngle();
		airCon.changeWindPower();
		airCon.changeWindPower();
		airCon.changeWindPower();
		airCon.changeWindPower();
		airCon.changeWindPower();
		airCon.changeWindPower();
		for(int i=0;i<20;i++)
			airCon.tempDown();
		
		
	}

}
