package pack02;

import java.util.Scanner;

public class Student {
   	 static Scanner scan = new Scanner(System.in);
	
	 static int count;
	 String stuNum;
	 String name;
	 int kor;
	 int engl;
	 int math;
	 int total;
	 double avg;
	 int rank;
	 static String searchName="";
	 static int searchIndex;
	 static int indexChecker = -1;
	
	{
		stuNum = "S" + String.format("%03d", ++count);
	}
	
	Student() {
		
	}
	
	Student(String name) {
		this.name = name;
		this.kor = 0;
		this.engl = 0;
		this.engl = 0;
		this.total = kor + engl + math;
		this.avg = this.total / 3.0;
	}
	
	Student(String name, int kor) {
		
	}
	
	Student(String name, int kor, int engl, int math) {
		this.name = name;
		this.kor = kor;
		this.engl = engl;
		this.math = math;
		this.total = kor + engl + math;
		this.avg = this.total / 3.0;
	}
	
}
