package pack01;

import java.util.ArrayList;

public class Buyer {

	private String member_id;
	private String member_pw;
	private String name;
	private int money = 2000;
	private int bonusPoint;

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pw() {
		return member_pw;
	}

	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money += money;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	private int count = 0;

	Product[] cart = new Product[10]; // 구매목록 저장
	ArrayList list = new ArrayList();
	
	// 구매 메소드 -> 물품가격을 빼줌, 보너스포인트
	void buy(Product p) { // 다형성: 부모의 참조변수로 자손의 객체를 다루는 것
		if (money < p.getPrice()) {
			System.out.println("잔액이 부족합니다.");
			return;
		}

		money -= p.getPrice();
		bonusPoint += p.getBonusPoint();

		System.out.println(p.getPro_name() + " 구매되었습니다.");
		list.add(p); 
	}
	
	void checkCurrent() {
		System.out.println("현재 보유금액 " + money);
		System.out.println("현재 보유 보너스 포인트 " + bonusPoint);
	}
	
	void summary() {
		String product_list = "";
		
		if(list.isEmpty()) {
			System.out.println("구매한 물품이 없습니다.");
			return;
		}
		
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			Product p = (Product) list.get(i);
			product_list += p.getPro_name() + " / ";
			sum += p.getPrice();
		}
		System.out.println("총 구매 개수: " + list.size());
		System.out.println(product_list);
	}

}
