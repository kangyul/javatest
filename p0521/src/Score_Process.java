import java.util.Scanner;

public class Score_Process {
	
	Score_Process scoreP = new Score_Process();
	static Scanner scan = new Scanner(System.in);
	
	void top_title() {
		System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("---------------------------------------------------");
	}

	void mainPrint() {
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 학생성적추가");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적검색");
		System.out.println("5. 등수처리");
		System.out.println("0. 프로그램종료");
		System.out.println("------------------------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
	}

	// 학생성적추가 메소드

	void student_insert(Student[] s) {
		String name = "";
		int kor = 0, eng = 0, math = 0;

		for (int i = Student.count; i < s.length; i++) {
			// 번호는 자동으로 입력됨.
			System.out.println("이름을 입력하세요.>>(0.상위메뉴이동)");
			String check = scan.next();

			if (check.equals("0")) {
				System.out.println("상위메뉴로 이동합니다.");
				break;
			}
			name = check;
			System.out.println("국어점수를 입력하세요.>>");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>>");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>>");
			math = scan.nextInt();
			s[i] = new Student(name, kor, eng, math);
		}
	}

	void student_print(Student[] s) {
		scoreP.top_title();
		for (int i = 0; i < Student.count; i++) {
			System.out.print(s[i].stu_number + "\t");
			System.out.print(s[i].name + "\t");
			System.out.print(s[i].kor + "\t");
			System.out.print(s[i].eng + "\t");
			System.out.print(s[i].math + "\t");
			System.out.print(s[i].total + "\t");
			System.out.printf("%.2f\t", s[i].avg);
			System.out.print(s[i].rank + "\n");
		}
	}
}
