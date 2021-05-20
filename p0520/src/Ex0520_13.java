import java.util.Scanner;

public class Ex0520_13 {
	static Scanner scan = new Scanner(System.in);
	static int count;
	public static void main(String[] args) {
		// 10명 학생입력 
		Student[] student = new Student[10];
		
		printMain();
		
		System.out.println("옵션 입력: ");
		int option = scan.nextInt();
		
		while(true) {
			switch (option) {
			case 1:
				addStudent(student);
				break;
				
			case 2:
				printStudent(student);
				break;
				
				
			default:
				break;
			} // switch
		} // while

	} // main
	
	static void printMain() {
		System.out.println("학생성적입력 프로그램");
		System.out.println("1. 학생 성적 추가");
	} // printMain()
	
	static void addStudent(Student[] student) {
		String name;
		int kor;
		int eng;
		int math;
		for(int i=count; i < student.length; i++) {
			System.out.println("이름 입력: (0. 메인메뉴로 이동)");
			name = scan.next();
			if (student[i].name.equals("0")) break;
			System.out.println("국어 점수 입력: ");
			kor = scan.nextInt();
			System.out.println("영어 점수 입력: ");
			eng = scan.nextInt();
			System.out.println("수학 점수 입력: ");
			math = scan.nextInt();
			
			
		}
	}
	
	static void printStudent(Student[] student) {
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("--------------------------------------------");
		for(int i=0; i<count; i++) {
			System.out.print(student[i].name + "\t");
			System.out.printf("%d\t", student[i].kor);
			System.out.printf("%d\t", student[i].eng);
			System.out.printf("%d\t", student[i].math);
			System.out.printf("%d\t", student[i].total);
			System.out.printf("%.2f\n", student[i].avg);
		}
	}

}
