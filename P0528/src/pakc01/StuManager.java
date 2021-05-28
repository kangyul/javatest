package pakc01;

import java.util.ArrayList;
import java.util.Scanner;

public class StuManager {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Stu_process p = new Stu_process();
		
		while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("[ 1. 학생성적 추가 ]");
			System.out.println("[ 2. 학생성적 출력 ]");
			System.out.println("-----------------------");
			System.out.println("[ 원하는 번호를 입력하세요. ]");
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1: // 학생성적추가
				p.student_insert(list);
				break;
			case 2:
				p.student_print(list);
				break;
			case 3:
				p.student_insert(list);
				break;
			case 4:
				
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			
		}
	}

}
