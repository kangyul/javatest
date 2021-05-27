package pack03;

import java.util.ArrayList;

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

	static void addStudent(ArrayList<Student> arrL) {
		while (true) {
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
			arrL.add(new Student(name, kor, engl, math));
		}

	}

	static void printStudent(ArrayList<Student> arrL) {
		System.out.printf("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("===================================================");
		for (int i = 0; i < arrL.size(); i++) {
			System.out.printf("%s\t", arrL.get(i).getStuNum());
			System.out.printf("%s\t", arrL.get(i).getName());
			System.out.printf("%d\t", arrL.get(i).getKor());
			System.out.printf("%d\t", arrL.get(i).getEngl());
			System.out.printf("%d\t", arrL.get(i).getMath());
			System.out.printf("%d\t", arrL.get(i).getTotal());
			System.out.printf("%.2f\t", arrL.get(i).getAvg());
			System.out.printf("%d\n", arrL.get(i).getRank());
		}
	}

	static void updateStudent(ArrayList<Student> arrL) {
		System.out.println("수정하실 학생의 이름을 입력하세요.");
		searchName = scan.next();

		sI = -1;

		for (int i = 0; i < count; i++) {
			if (searchName.equals(arrL.get(i).getName())) {
				sI = i;
				break;
			}
		}

		if (sI == -1) {
			System.out.println("해당 학생은 존재하지 않습니다.");
			return;
		}

		int subjectNum = 0;
		System.out.println("수정하실 과목을 선택해주세요.");
		System.out.println("1. 국어 2. 영어 3. 수학");
		subjectNum = scan.nextInt();

		if (subjectNum < 1 || subjectNum > 3) {
			System.out.println("잘못된 입력입니다. (1~3으로 입력)");
			return;
		}

		System.out.println("새로운 점수를 입력해주세요.");
		int newScore = scan.nextInt();

		switch (subjectNum) {

		case 1:
			arrL.get(sI).setKor(newScore);
			break;
		case 2:
			arrL.get(sI).setEngl(newScore);
			break;
		case 3:
			arrL.get(sI).setMath(newScore);
			break;
		default:
			System.out.println("해당 과목은 존재하지 않습니다.");
			break;
		}
		arrL.get(sI).setTotal(arrL.get(sI).getKor() + arrL.get(sI).getMath() + arrL.get(sI).getEngl());
		arrL.get(sI).setAvg(arrL.get(sI).getTotal() / 3.0);
	}

	static void searchStudent(ArrayList<Student> arrL) {
		System.out.println("검색하실 학생의 이름을 입력하세요.");
		searchName = scan.next();

		sI = -1;

		for (int i = 0; i < count; i++) {
			if (searchName.equals(arrL.get(i).getName())) {
				sI = i;
				break;
			}
		}

		if (sI == -1) {
			System.out.println("해당 학생은 존재하지 않습니다.");
			return;
		}

		System.out.printf("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("=============================================");
		for (int i = sI; i < sI + 1; i++) {
			System.out.printf("%s\t", arrL.get(i).getStuNum());
			System.out.printf("%s\t", arrL.get(i).getName());
			System.out.printf("%d\t", arrL.get(i).getKor());
			System.out.printf("%d\t", arrL.get(i).getEngl());
			System.out.printf("%d\t", arrL.get(i).getMath());
			System.out.printf("%d\t", arrL.get(i).getTotal());
			System.out.printf("%.2f\t", arrL.get(i).getAvg());
			System.out.printf("%d\n", arrL.get(i).getRank());
		}

	}

	static void rankStudent(ArrayList<Student> arrL) {

		for (int i = 0; i < arrL.size(); i++) {
			int rank = 1;
			for (int j = 0; j < arrL.size(); j++) {
				if (arrL.get(i).getAvg() < arrL.get(j).getAvg()) {
					rank++;
				}
			}
			arrL.get(i).setRank(rank);
		}
	}

	static void deleteStudent(ArrayList<Student> arrL) {
		System.out.println("현재 학생 리스트");
		printStudent(arrL);
		System.out.println("삭제할 학생 이름 입력");
		String name = scan.next();

		sI = -1;

		for (int i = 0; i < arrL.size(); i++) {
			if (name.equals(arrL.get(i).getName())) {
				sI = i;
				break;
			}
		}

		if (sI == -1) {
			System.out.println("해당 학생은 존재하지 않습니다.");
			return;
		}

		arrL.remove(sI);

	}

}
