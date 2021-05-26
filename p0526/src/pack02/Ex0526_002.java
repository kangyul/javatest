package pack02;

public class Ex0526_002 {

	public static void main(String[] args) {
		Buyer b1 = new Buyer();
		b1.mem_id = "member01";
		b1.name = "홍길동";
		
		b1.buy(new Tv());
		b1.buy(new Audio());
		b1.buy(new Tv());
		b1.buy(new Tv());
		b1.buy(new Tv());
		b1.buy(new Computer());
		b1.buy(new Computer());
		b1.buy(new Computer());
		// -----
		b1.buy(new Computer());
		
		System.out.println("보유금액: " + b1.money);
		System.out.println("보너스포인트: " + b1.bonusPoint);
		int sum=0;
		String buy_print="";
		
		System.out.println(b1.cart.length);
		
		for(int i=0; i< b1.i; i++) {
			sum += b1.cart[i].price;
			buy_print += b1.cart[i].pro_name + " ";
		}
		
		System.out.println("구매 목록" + buy_print);
		System.out.println("총 구매 금액" + sum);
		System.out.println("총 보너스 포인트" + b1.bonusPoint);
	}

}
