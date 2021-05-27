package pack03;

import java.util.ArrayList;
import java.util.Scanner;

public class Front {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> arrS = new ArrayList<Student>();
		
		loop: while(true) {
			Options.printMain();
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				Options.addStudent(arrS);
				break;
			case 2:
				Options.printStudent(arrS);
				break;
			case 3:
				Options.updateStudent(arrS);
				break;
			case 4:
				Options.searchStudent(arrS);
				break;
			case 5:
				Options.rankStudent(arrS);
				break;
			case 0:
				System.out.println("프로그램 종료");
				break loop;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		
		scan.close();
			
	}

}
