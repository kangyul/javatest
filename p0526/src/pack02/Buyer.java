package pack02;

public class Buyer {
	String mem_id;
	String mem_pw;
	String name;
	int money = 1000; // 1000만 원
	double bonusPoint = 0;

	Product[] cart = new Product[10]; // 구매목록확인 배열 

	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("돈이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p.pro_name + " 구매되었습니다.");
	}

}
