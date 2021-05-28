package pakc01;

import java.util.Scanner;

public class Ex0528_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Process01 p1 = new Process01();
		
		loop: while(true) {
			System.out.println("[프로그램 ]");
			System.out.println("1. 두 수의 합");
			System.out.println("2. 두 수 사이의 합");
			System.out.println("3. 두 수 크기 비교");
			System.out.println("0. 프로그램 종료");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				int[] ans1 = p1.getTwoNum();
				p1.sum(ans1[0], ans1[1]);
				break;
			case 2:
				int[] ans2 = p1.getTwoNum();
				p1.sumBetween(ans2[0], ans2[1]);
				break;
			case 3:
				int[] ans3 = p1.getTwoNum();
				p1.compare(ans3[0], ans3[1]);
				break;
			case 0:
				System.out.println("프로그램 종료");
				break loop;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			} // switch 
			
		} // while
		
		scan.close();
		
	} // main

} // class
