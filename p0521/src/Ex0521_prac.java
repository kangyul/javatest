import java.util.Scanner;

public class Ex0521_prac {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Student2[] s = new Student2[10];
		
		// infinite loop
		loop: while(true) {
			
			menu_print();
			
			int choice = scan.nextInt();
			
			switch(choice) {
			
			case 1: // 학생성적추가
				student_insert(s);
				break;
			case 2: // 학생성적 출력
				student_print(s);
				break;
			case 3: // 학생성적 수정
				student_update(s);
				break;
			case 4:
//				student_search(s);
				break;
			case 5:
//				student_rank;
				break;
			case 0: // 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break loop;
			default:
				
				break;
			
			} // switch
						
		} // while
		
	} // main
	
	// 상단 메뉴 출력 메소드 
	static void menu_print() {
		System.out.println("[ 학생 성적 처리 프로그램]");
		System.out.println("1. 학생성적추가");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적검색");
		System.out.println("5. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("-------------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
	}
	
	// 1. 학생성적추가 메소드
	static void student_insert(Student2[] s) {
		for(int i=Student.count; i<s.length; i++) {		
			// 반복 시작
			System.out.println("학생 이름을 입력하세요.(0.상위 메뉴 이동)");
			String name = scan.next();
			if(name.equals("0")) {
				// 0이 입력되었을 경우
				System.out.println("상위 메뉴로 이동합니다.");
				break;
			} else {
				// 0이 아닌 경우
				System.out.println("국어 점수를 입력하세요.");
				int kor = scan.nextInt();
				System.out.println("영어 점수를 입력하세요.");
				int eng = scan.nextInt();
				System.out.println("수학 점수를 입력하세요.");
				int math = scan.nextInt();
				s[i] = new Student2(name,kor,eng,math);
				System.out.println("1명의 학생이 등록되었습니다!");		
				Student.count++;
			}
			// 반복 끝					 
		}
		
	} // 1. 학생성적추가 메소드
	
	// 2. 학생 성적 출력 메소드
	
	static void student_print(Student2[] s) {
		System.out.printf("학번\t이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("-------------------------------------");
		for(int i=0; i<Student.count; i++) {
			System.out.printf("%s\t", s[i].stu_number);
			System.out.printf("%s\t", s[i].name);
			System.out.printf("%d\t", s[i].kor);
			System.out.printf("%d\t", s[i].eng);
			System.out.printf("%d\t", s[i].math);
			System.out.printf("%d\t", s[i].total);
			System.out.printf("%.2f\n", s[i].avg);
		}
	}
	
	// 3. 학생 성적 수정 메소드
	
	static void student_update(Student2[] s) {
		
	}
	
	// 4. 학생 성적 검색 메소드

} // class
