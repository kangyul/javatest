package p0621;

import java.util.ArrayList;

public class Ex0621_02 {
	public static void main(String[] args) {
		ArrayList<Student> arrl = new ArrayList<Student>();
		arrl.add(new Student(1, "홍길동", 100, 100, 100));
		arrl.add(new Student(2, "이순신", 90, 90, 91));
		arrl.add(new Student(3, "유관순", 99, 99, 98));
		arrl.add(new Student(4, "강감찬", 80, 80, 89));
		arrl.add(new Student(5, "김구", 100, 100, 99));
		arrl.add(new Student(6, "김유신", 70, 70, 79));
		arrl.add(new Student(7, "이율곡", 99, 99, 100));
		
		StringBuffer sbf = new StringBuffer();
		
		for(int i=0; i<arrl.size(); i++) {
			sbf.append(arrl.get(i).getStuNo() + ",");
			sbf.append(arrl.get(i).getName() + ",");
			sbf.append(arrl.get(i).getKor() + ",");
			sbf.append(arrl.get(i).getEng() + ",");
			sbf.append(arrl.get(i).getMath() + ",");
			sbf.append(arrl.get(i).getTotal() + ",");
			sbf.append(arrl.get(i).getAvg() + ",");
		}

		String[] names = sbf.toString().split(",");
		
		for(int i=0; i<names.length; i+=7) {
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%.2f\n", names[i],names[i+1],names[i+2],names[i+3],names[i+4],names[i+5], Double.parseDouble(names[i+6]));
		}
		
//		for(int i=0; i<names.length; i++) {
//			if(i == 0) {
//				System.out.print(names[i] + "\t");				
//				continue;
//			}
//			if(i % 6 == 0) {
//				System.out.printf("%.2f", Double.parseDouble(names[i]));
//				System.out.println("");
//			} else {
//				System.out.print(names[i] + "\t");				
//			}
//		}
		
		
		
		
	}
}
