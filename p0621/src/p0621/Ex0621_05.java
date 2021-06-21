package p0621;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex0621_05 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		MapProcess mp = new MapProcess();
		
		list.add(new Student(1, "홍길동", 100, 100, 100));
		list.add(new Student(2, "이순신", 90, 90, 91));
		list.add(new Student(3, "유관순", 99, 99, 98));
		list.add(new Student(4, "강감찬", 80, 80, 89));
		list.add(new Student(5, "김구", 100, 100, 99));
		list.add(new Student(6, "김유신", 70, 70, 79));
		list.add(new Student(7, "이율곡", 99, 99, 100));
		
		HashMap map  = mp.selectStudent(list);
		
		System.out.println("list 모든 이름: " + map.get("strName"));
		System.out.println("list result: " + map.get("result"));
		System.out.println("resultTitle: " + map.get("resultTitle"));
		System.out.println("name: " + map.get("name"));
	}

}
