package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_process {
	static Scanner scan = new Scanner(System.in);
	static String searchName;
	static int sIndex;
	
	void printMain() {
		System.out.println("[ 학생 성적 프로그램 ]");
		System.out.println("[ 1. 학생성적 입력  ]");
		System.out.println("[ 2. 학생성적 출력  ]");
		System.out.println("[ 3. 학생성적 검색  ]");
		System.out.println("[ 4. 학생성적 수정  ]");
		System.out.println("[ 5. 학생등수 계산  ]");
		System.out.println("[ 0.   등수처리    ]");
		System.out.println("-------------------");
		System.out.println("원하는 번호를 입력하세요.");
	}
	
	void addStudent(ArrayList<Student> arrl) {
		String name="";
		int kor=0, engl=0, math=0;
		
		while(true) {
			System.out.println("학생 이름을 입력하세요. (0. 상위 메뉴 이동)");
			name = scan.next();
			if(name.equals("0")) break;
			System.out.println("국어 점수를 입력하세요.");
			kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요.");
			engl = scan.nextInt();
			System.out.println("수학 점수를 입력하세요.");
			math = scan.nextInt();
			
			Student s = new Student(name, kor, engl, math);
			arrl.add(s);
		}
	}
	
	void printStudent(ArrayList<Student> arrl) {
		System.out.print("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("============================================================");
		
		for(int i=0; i<arrl.size(); i++) {
			System.out.printf("%s\t", arrl.get(i).getStu_num());
			System.out.printf("%s\t", arrl.get(i).getName());
			System.out.printf("%d\t", arrl.get(i).getKor());
			System.out.printf("%d\t", arrl.get(i).getEngl());
			System.out.printf("%d\t", arrl.get(i).getMath());
			System.out.printf("%d\t", arrl.get(i).getTotal());
			System.out.printf("%.2f\t", arrl.get(i).getAvg());
			System.out.printf("%d\t", arrl.get(i).getRank());
		}
	}
	
	void searchStudent(ArrayList<Student> arrl) {
		System.out.println("검색하실 학생의 이름을 입력하세요.");
		searchName = scan.next();
		
		sIndex = -1;
		
		for(int i=0; i<arrl.size(); i++) {
			if(searchName.equals(arrl.get(i).getName())) {
				sIndex = i;
				break;
			}
		}
		
		
		
	}
	
	
	
	
	
}
