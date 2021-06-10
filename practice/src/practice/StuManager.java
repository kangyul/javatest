package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class StuManager {

	public static void main(String[] args) {
		ArrayList<Student> arrl = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		Stu_process p = new Stu_process();
		int choice=0;
		
		loop: while(true) {
			p.printMain();
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			
		}
		

	}

}
