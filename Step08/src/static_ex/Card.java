package static_ex;

public class Card {
	private static int cardNoSeq = 1000;
	private int cardNo;
	private String name;
	
	public Card(String name) {
		this.name = name;
		cardNo = cardNoSeq++;
	}

	@Override
	public String toString() {
		return "Card [cardNo=" + cardNo + ", name=" + name + "]";
	}
}
