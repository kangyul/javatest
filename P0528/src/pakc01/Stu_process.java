package pakc01;

import java.util.Scanner;

import javax.net.ssl.SSLContext;

import java.util.ArrayList;

public class Stu_process {
	
	static Scanner scan = new Scanner(System.in);
	// 학생성적추가 메소드 
	void student_insert(ArrayList list) {
		String stu_name = "";
		int kor=0, eng=0, math=0;
		
		while(true) {
			System.out.println("학생 이름을 입력하세요.(0. 상위 메뉴 이동)>>");
			stu_name = scan.next();
			if(stu_name.equals("0")) {
				System.out.println("상위 메뉴 이동");
				break;
			}
			System.out.println("국어 점수를 입력하세요.>>");
			kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요.>>");
			eng = scan.nextInt();
			System.out.println("수학 점수를 입력하세요.>>");
			math = scan.nextInt();
			// list 저장
			list.add(new Student(stu_name, kor, eng, math));
			
		}
	}
	
	void student_print(ArrayList list) {
		System.out.printf("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("===========================================================");
		for(int i=0; i<list.size(); i++) {
			Student s = (Student) list.get(i);
			System.out.printf("%d\t", s.stu_num);
			System.out.printf("%s\t", s.stu_name);
			System.out.printf("%d\t", s.kor);
			System.out.printf("%d\t", s.eng);
			System.out.printf("%d\t", s.math);
			System.out.printf("%d\t", s.total);
			System.out.printf("%.2f\t", s.avg);
			System.out.printf("%d\n", s.rank);
		}
		System.out.println("===========================================================");
	}
	
	void student_update(ArrayList<Student> list) {
		System.out.println("수정하실 학생의 이름을 입력하세요.");
		String name = scan.next();
		
		int index = -1;
		
		for(int i=0; i<list.size(); i++) {
			Student s = (Student) list.get(i);
			if(s.stu_name.equals(name)) {
				index = i;
				System.out.println("수정하실 과목을 선택하세요.");
				System.out.println("1. 국어 2. 영어 3. 과학");
				int subIndex = scan.nextInt();
				
				switch (subIndex) {
				case 1:
					System.out.println("현재 점수: " + s.kor);
					System.out.println("새로운 국어점수 입력:");
					s.kor = scan.nextInt();
					break;
				case 2:
					System.out.println("현재 점수: " + s.eng);
					System.out.println("새로운 영어점수 입력:");
					s.eng = scan.nextInt();;					
					break;
				case 3:
					System.out.println("현재 점수: " + s.math);
					System.out.println("새로운 수학점수 입력:");
					s.math = scan.nextInt();;					
					break;
					
				default:
					System.out.println("범위를 벗어났습니다.");
					break;
				} // switch
				
				s.total = s.eng + s.kor + s.math;
				s.avg = s.total / 3.0;
				
			} else {
				System.out.println("해당 학생은 존재하지 않습니다.");
				return;
				
			}
		} 
		
		
	} // student_update
	
	void student_search(ArrayList list) {
		System.out.println("검색하실 학생의 이름을 입력하세요.");
		String name = scan.next();
		
		int index = -1;
		
		for(int i=0; i<list.size(); i++) {
			Student s = (Student) list.get(i);
			if(s.stu_name.equals(name)) {
				System.out.printf("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
				System.out.println("===========================================================");
				System.out.printf("%d\t", s.stu_num);
				System.out.printf("%s\t", s.stu_name);
				System.out.printf("%d\t", s.kor);
				System.out.printf("%d\t", s.eng);
				System.out.printf("%d\t", s.math);
				System.out.printf("%d\t", s.total);
				System.out.printf("%.2f\t", s.avg);
				System.out.printf("%d\n", s.rank);
				break;
				
			} else {
				System.out.println("해당 학생은 존재하지 않습니다.");
				return;
				
			}
		} 
	}
	
	void studnet_rank(ArrayList list) {
		int rank=0;
		
		for(int i=0; i<list.size(); i++) {
			Student s1 = (Student) list.get(i);
			rank = 1;
			for(int j=0; j<list.size(); j++) {
				Student s2 = (Student) list.get(j);
				if(s1.avg < s2.avg) {
					rank++;
				}
			}
			s1.rank = rank;
		}
	}

}
