package has_a_2;

public class TestMain {

	public static void main(String[] args) {
		Gun gun = new Gun();
		AK47 ak = new AK47();
		Police police = new Police(ak);
		
		police.shot();
		police.shot();
		police.shot();
		police.shot();
		police.shot();
		police.reload();
	}

}
