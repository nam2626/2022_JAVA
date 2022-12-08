package synchronized_;

public class Player extends Thread{
	private Bank bank;

	public Player(Bank bank) {
		this.bank = bank;
	}
	
	public void getMoney() {
		System.out.println(getName() + " : " + bank.withdraw(1000));
	}
	
	@Override
	public void run() {
		getMoney();
	}
}








