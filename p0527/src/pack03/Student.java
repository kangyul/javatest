package pack03;

import java.util.Scanner;

public class Student {
	 static Scanner scan = new Scanner(System.in);
	
	 static int count;
	 private String stuNum;
	 private String name;
	 private int kor, engl, math, total;
	 private double avg;
	 private int rank;
	 static String searchName="";
	 static int sI = -1;
	
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
	
	Student(String name, int kor, int engl, int math) {
		this.name = name;
		this.kor = kor;
		this.engl = engl;
		this.math = math;
		this.total = kor + engl + math;
		this.avg = this.total / 3.0;
	}

	public String getStuNum() {
		return stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEngl() {
		return engl;
	}

	public void setEngl(int engl) {
		this.engl = engl;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
}
