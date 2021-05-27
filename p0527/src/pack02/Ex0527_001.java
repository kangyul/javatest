package pack02;

import java.util.Scanner;

public class Ex0527_001 {

	public static void main(String[] args) {
		// 학생성적프로그램
		Scanner scan = new Scanner(System.in);
		Student[] s = new Student[10];
		
		loop: while(true) {
			Options.printMain();
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				Options.addStudent(s);
				break;
			case 2:
				Options.printStudent(s);
				break;
			case 3:
				Options.updateStudent(s);
				break;
			case 4:
				Options.searchStudent(s);
				break;
			case 5:
				Options.rankStudent(s);
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
