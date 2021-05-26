package pack03;

import java.util.Scanner;

public class Ex0526_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 조상: Product 
		// 자손: Refrigerator -"비스포크", 300, 30
		// Washer - "트럼", 180, 18
		// Conditioner - "무풍", 230, 23
		// Styler - "스타일러", 130, 13
		// 초기보유금액 - 2000만원
		// 구매 물품 - 비스포크 2대, 트럼 3대, 무풍 1대, 스타일러 2대 
		// 총구매금액 출력, 총 구매 개수 출력, 총 구매 목록 출력
		Buyer b = new Buyer();
		
		loop: while(true) {
			System.out.println("구매하실 물건을 선택하세요.");
			System.out.println("1. Refrigerator 2. Washer 3. Conditioner 4. Styler 0. End Shopping");
			int option = scan.nextInt();
			switch (option) {
			case 1:
				b.buy(new Refrigerator());
				break;
			case 2: 
				b.buy(new Washer());
				break;
			case 3: 
				b.buy(new Conditioner());
				break;
			case 4: 
				b.buy(new Styler());
				break;
			case 0: 
				System.out.println("구매를 종료합니다.");
				break loop;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
		
		int sum=0;
		String goods="";
		for(int i=0; i<b.i; i++) {
			sum += b.cart[i].price;
			goods += b.cart[i].pro_name + " ";
		}
		
		System.out.println("총 구매 금액: " + sum);
		System.out.println("총 구매 개수: " + b.i);
		System.out.println("총 적립 포인트: " + b.bonusPoint);
		System.out.println("총 구매 목록: " + goods);
		
	}

}
