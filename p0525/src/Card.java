
public class Card {
	String kind; // spade, diamond, heart, clover 
	String number; 
	
	Card() {
		this("SPADE","1");
	}
	
	Card(String kind, String number) {
		this.kind = kind;
		this.number = number;
	}
	
//	public String toString() {
//		
//		return "카드 : " + kind + "," + number;
//	}
}
