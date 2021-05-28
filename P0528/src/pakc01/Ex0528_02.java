package pakc01;

import java.util.Scanner;

public class Ex0528_02 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] ball = new int[45];
		int[] myPick = new int[6];
		int option = 0;
		Lotto_process lp = new Lotto_process();
		
		loop: while(true) {
			System.out.println("[ 로또 프로그램 ]");
			System.out.println("[ 1. 로또번호 생성 ]");
			System.out.println("[ 2. 로또번호 섞기 ]");
			System.out.println("[ 3. 로또번호 개인번호 6개 입력 ]");
			System.out.println("[ 4. 로또번호 당첨번호 출력 ]");
			System.out.println("[ 0. 프로그램 종료 ]");
			System.out.println("------------------------------");
			System.out.println("원하는 번호를 입력하세요.");
			option = scan.nextInt();
			
			switch (option) {
			case 1:
				lp.createLotto(ball);
				break;
			case 2:
				lp.shuffleLotto(ball);
				break;
			case 3:
				lp.getNum(myPick);
				break;
			case 4:
				lp.printResult(ball, myPick);
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop;

			default:
				break;
			}
		}
		
		
	}

}
