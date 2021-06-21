package p0621;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex0621_06 {
	public static void main(String[] args) {
		// 홍길동, 이순신, 유관순, 강감찬, 김구, 김유신, 이율곡
		// 검색할 데이터 이름을 입력받아 -> 그 데이터를 매개변수로 MapPro 클래스의 메소드에 넘겨서
		// 데이터를 검색한 다음, 
		// main으로 데이터를 넘겨 출력하시오.
		// 전체이름 데이터, "이름이 검색되었습니다." 
		Scanner scan = new Scanner(System.in);
		String name = "";
		ArrayList<Student> list = new ArrayList<Student>();
		MapPro mp = new MapPro();
		
		list.add(new Student(1, "홍길동", 100, 100, 100));
		list.add(new Student(1, "홍길동", 100, 100, 100));
		list.add(new Student(2, "홍길자", 90, 90, 91));
		list.add(new Student(3, "홍길순", 99, 99, 98));
		list.add(new Student(4, "홍길억", 80, 80, 89));
		list.add(new Student(5, "김구", 100, 100, 99));
		list.add(new Student(6, "김유신", 70, 70, 79));
		list.add(new Student(7, "이율곡", 99, 99, 100));
		
		System.out.println("검색하실 이름을 입력하세요.");
		name = scan.next();
		
		HashMap hMap = mp.searchName(list, name);
		
		System.out.println("list 모든 이름: " + hMap.get("allNames"));
		System.out.println("검색 결과: " + hMap.get("sNameResult"));
		System.out.println(name + "이 포함된 이름: " + hMap.get("sNames"));
		
	}
}
