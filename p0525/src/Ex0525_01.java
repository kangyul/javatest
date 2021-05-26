import java.util.Scanner;

public class Ex0525_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck(); //52장의 카드 생성 후, kind, number 입력 완료
		
		loop: while(true) {
			d.menu_print();
			int option = scan.nextInt();
			switch(option) {
			case 1:
				System.out.println("0~51 사이의 번호를 입력해주세요.");
				int num = scan.nextInt();
				d.print_1card(num);
				break;
			case 2:
				d.print_5card();
				break;
			case 3:
				d.print_52card();
				break;
			case 4:
				d.shuffle();
				break;
			case 5:
				// 카드 7장을 내것과 컴퓨터 것을 출력시키는 메소드
				// MYCARD: SPADE,1 HEART,9, 
				// 컴퓨터CARD: SPADE,J DIAMOND,K...
				d.handOut7();
				break;
			case 6:
				d.compare();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			default:
				System.out.println("번호를 잘못 입력했습니다. ");
				break;
			}
			
		}
		
	}

}
