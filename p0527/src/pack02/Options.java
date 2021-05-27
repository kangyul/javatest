package pack02;

public class Options extends Student {
	
	Options() {
		
	}
	
	static void printMain() {
		System.out.println("---------------------");
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 학생성적추가");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적검색");
		System.out.println("5. 등수처리");
		System.out.println("0. 프로그램종료");
		System.out.println("---------------------");
	}

	static void addStudent(Student[] s) {
		for (int i = count; i < s.length; i++) {
			System.out.println("학생 이름을 입력해주세요. (0. 상위 메뉴 이동)");
			String name = scan.next();
			if (name.equals("0")) {
				System.out.println("상위 메뉴로 이동합니다.");
				break;
			}

			System.out.println("국어 성적을 입력해주세요.");
			int kor = scan.nextInt();
			System.out.println("영어 성적을 입력해주세요.");
			int engl = scan.nextInt();
			System.out.println("수학 성적을 입력해주세요.");
			int math = scan.nextInt();
			s[i] = new Student(name, kor, engl, math);
		}

	}

	static void printStudent(Student[] s) {
		System.out.printf("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("=============================================");
		for (int i = 0; i < count; i++) {
			System.out.printf("%s\t", s[i].stuNum);
			System.out.printf("%s\t", s[i].name);
			System.out.printf("%d\t", s[i].kor);
			System.out.printf("%d\t", s[i].engl);
			System.out.printf("%d\t", s[i].math);
			System.out.printf("%d\t", s[i].total);
			System.out.printf("%.2f\t", s[i].avg);
			System.out.printf("%d\n", s[i].total);
		}
	}

	static void updateStudent(Student[] s) {
		System.out.println("수정하실 학생의 이름을 입력하세요.");
		searchName = scan.next();

		for (int i = 0; i < count; i++) {
			if (searchName.equals(s[i].name)) {
				searchIndex = i;
				break;
			}
		}

		if (indexChecker == -1) {
			System.out.println("해당 학생은 존재하지 않습니다.");
			return;
		}

		int subjectNum = 0;
		System.out.println("수정하실 과목을 선택해주세요.");
		System.out.println("1. 국어 2. 영어 3. 수학");
		subjectNum = scan.nextInt();
		int newScore = 0;

		switch (subjectNum) {
		case 1:
			s[searchIndex].kor = newScore;
			break;
		case 2:
			s[searchIndex].engl = newScore;
			break;
		case 3:
			s[searchIndex].math = newScore;
			break;
		default:
			System.out.println("해당 과목은 존재하지 않습니다.");
			break;
		}

		s[searchIndex].total = s[searchIndex].kor + s[searchIndex].engl + s[searchIndex].math;
		s[searchIndex].avg = s[searchIndex].total / 3.0;

	}

	static void searchStudent(Student[] s) {
		System.out.println("검색하실 학생의 이름을 입력하세요.");
		searchName = scan.next();

		for (int i = 0; i < count; i++) {
			if (searchName.equals(s[i].name)) {
				searchIndex = i;
				break;
			}
		}

		if (indexChecker == -1) {
			System.out.println("해당 학생은 존재하지 않습니다.");
			return;
		}

		System.out.printf("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("=============================================");
		for (int i = searchIndex; i < searchIndex + 1; i++) {
			System.out.printf("%s\t", s[i].stuNum);
			System.out.printf("%s\t", s[i].name);
			System.out.printf("%d\t", s[i].kor);
			System.out.printf("%d\t", s[i].engl);
			System.out.printf("%d\t", s[i].math);
			System.out.printf("%d\t", s[i].total);
			System.out.printf("%.2f\t", s[i].avg);
			System.out.printf("%d\n", s[i].rank);
		}

	}

	static void rankStudent(Student[] s) {
		for (int i = 0; i < count; i++) {
			s[i].rank = 1;
		}

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				if (s[i].avg > s[j].avg) {
					s[j].rank++;
				}
			}
		}
	}
}
