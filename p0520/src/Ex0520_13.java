import java.util.Scanner;

public class Ex0520_13 {
	static Scanner scan = new Scanner(System.in);
	static int count;
	public static void main(String[] args) {
		// 10명 학생입력 
		Student[] student = new Student[10];
		
		printMain();
		
		
		
		loop: while(true) {
			System.out.println("옵션 입력: ");
			int option = scan.nextInt();
			
			switch (option) {
			case 1:
				addStudent(student);
				break;
			case 2:
				printStudent(student);
				break;
			case 3:
				updateStudent(student);
				break;
			case 4:
				searchStudent(student);
				break;	
			case 5:
				rankStudent(student);
				break;
			case 0:
				break loop;
			default:
				System.out.println("옵션이 존재하지 않습니다. 다시 입력해 주세요.");
				break;
			} // switch
		} // while

	} // main
	
	static void printMain() {
		System.out.println("학생성적입력 프로그램");
		System.out.println("1. 학생 성적 추가");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 학생 성적 수정");
		System.out.println("4. 학생 성적 검색");
		System.out.println("5. 학생 등수 처리");
		System.out.println("0. 프로그램 종료");
	} // printMain()
	
	static void addStudent(Student[] student) {
		
		for(int i=count; i < student.length; i++) {
			System.out.println("이름 입력: (0. 메인메뉴로 이동)");
			String name = scan.next();
			if (name.equals("0")) {
				break;
			}
			System.out.println("국어 점수 입력: ");
			int kor = scan.nextInt();
			System.out.println("영어 점수 입력: ");
			int eng = scan.nextInt();
			System.out.println("수학 점수 입력: ");
			int math = scan.nextInt();
			student[i] = new Student(name, kor, eng, math);
			Student.stu_num++;
		}
	}
	
	static void printStudent(Student[] student) {
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("--------------------------------------------");
		for(int i=0; i<Student.stu_num; i++) {
			System.out.print(student[i].name + "\t");
			System.out.printf("%d\t", student[i].kor);
			System.out.printf("%d\t", student[i].eng);
			System.out.printf("%d\t", student[i].math);
			System.out.printf("%d\t", student[i].total);
			System.out.printf("%.2f\n", student[i].avg);
		}
	}
	
	static void updateStudent(Student[] student) {
		System.out.println("3. 학생의 정보를 업데이트 합니다.");
		System.out.println("검색하실 학생의 이름을 검색하세요.");
		String stu_name = scan.next();
		
		for(int i=0; i<Student.stu_num; i++) {
			if(stu_name.equals(student[i].name)) {
				Student.index = i;
				break;
			}
		}
		
		if(Student.index == 0) {
			System.out.println("해당 학생이 존재하지 않습니다.");
		}
		
		System.out.println("수정 하실 과목을 선택하세요.");
		System.out.println("1. 국어 2. 영어 3. 수학");
		int subNum = scan.nextInt();
		if(subNum == 1) {
			System.out.println("국어 점수는 " + student[Student.index].kor);
			System.out.println("수정할 점수: ");
			
		} else if(subNum == 2) {
			System.out.println("영어 점수는 " + student[Student.index].eng);
		} else if(subNum == 3) {
			System.out.println("수학 점수는 " + student[Student.index].math);
		}
		
		student[Student.index].total = student[Student.index].kor + student[Student.index].eng + student[Student.index].math; 
		
	} // updateStudent()
	
	static void searchStudent(Student[] student) {
		System.out.println("3. 학생의 정보를 업데이트 합니다.");
		System.out.println("검색하실 학생의 이름을 검색하세요.");
		String stu_name = scan.next();
		
		for(int i=0; i<Student.stu_num; i++) {
			if(stu_name.equals(student[i].name)) {
				Student.index = i;
				break;
			}
		}
		
		if(Student.index == 0) {
			System.out.println("해당 학생이 존재하지 않습니다.");
		}
		
		System.out.println("검색 하실 과목을 선택하세요.");
		System.out.println("1. 국어 2. 영어 3. 수학");
		int subNum = scan.nextInt();
		if(subNum == 1) {
			System.out.println("국어 점수는 " + student[Student.index].kor);
		} else if(subNum == 2) {
			System.out.println("영어 점수는 " + student[Student.index].eng);
		} else if(subNum == 3) {
			System.out.println("수학 점수는 " + student[Student.index].math);
		}
	} // searchStudent()
	
	static void rankStudent(Student[] student) {
		
	} // rankStudent

}
