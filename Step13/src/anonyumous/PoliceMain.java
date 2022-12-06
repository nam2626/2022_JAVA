package anonyumous;

public class PoliceMain {

	public static void main(String[] args) {
		Gun gun = new Gun() {
			
			@Override
			public void shot() {
				System.out.println("BBang");
			}
			
			@Override
			public void reload() {
				System.out.println("reload");
			}
		};
		Police police = new Police(gun);
		police.shot();
		police.setGun(new Gun() {
			private int bullet = 20;
			@Override
			public void shot() {
				bullet--;
				System.out.println("빵 " + bullet);
			}
			
			@Override
			public void reload() {
				System.out.println("재장전");
			}
		});
		police.shot();
	}

}






