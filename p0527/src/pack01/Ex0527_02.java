package pack01;

public class Ex0527_02 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		
		System.out.println("잔액: " + b.getMoney());
		System.out.println("보너스 포인트: " + b.getBonusPoint());
			
	}

}
