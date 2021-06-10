package practice;

public class Student {
	static int count;
	private String stu_num;
	private String name;
	private int kor;
	private int engl;
	private int math;
	private int total;
	private double avg;
	private int rank;
	
	{
		stu_num = "S" + String.format("%30d", ++count);
	}
	
	Student() {
		
	}
	
	Student(String name, int kor, int engl, int math) {
		this.name = name;
		this.kor = kor;
		this.engl = engl;
		this.math = math;
		this.total = kor+engl+math;
		this.avg = this.total / 3.0;
	}

	public String getStu_num() {
		return stu_num;
	}

	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
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
