package pack01;

import java.util.Scanner;

public class Ex0527_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Buyer b = new Buyer();
		
		loop: while(true) {
			System.out.println("[ 쇼핑몰 프로그램 ]");
			System.out.println("1. 맥북 노트북 구매");
			System.out.println("2. 아이폰 구매");
			System.out.println("3. OLED TV 구매");
			System.out.println("4. 구매목록 보기");
			System.out.println("5. 현금 충전");			
			System.out.println("0. 구매 종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1: // purchasing macbook pro
				b.buy(new Computer());
				b.checkCurrent();
				break;
			case 2: /// purchasing iphone
				b.buy(new SmartPhone());
				b.checkCurrent();
				break;
			case 3: // purchasing oled tv
				b.buy(new Tv());
				b.checkCurrent();
				break;
			case 4: // show shopping list				
				b.summary();
				break;
			case 5: // 현금 충전
				// 충전 금액, 결제 방식 물어보기
				System.out.println("현재 보유 금액: " + b.getMoney());
				System.out.println("얼마를 충전하시겠습니까? (0. 상위 메뉴 이동)");
				int cash = scan.nextInt();
				if(cash == 0) {
					System.out.println("상위메뉴로 이동합니다.");
					break;
				}
				// alternative: cash += b1.getMoney();
				b.setMoney(cash);
				System.out.println("충전 후 금액: " + b.getMoney());
				break;
			case 0:
				System.out.println("쇼핑을 종료합니다.");
				break loop;
			default:
				break;
			}
			
		}
		
//		Product p = new Product();
//		System.out.println("이름을 입력하세요.");
//		String name = scan.next();
//		p.setPro_name(name);
//		
//		System.out.println("Customer name is: " + p.getPro_name());
//		p.setPrice(100);
//		System.out.println("Price: " + p.getPrice());
//		p.setBonusPoint(50);
//		System.out.println("Bonus Point: "+p.getBonusPoint());
		
//		scan.close();
	}

}
