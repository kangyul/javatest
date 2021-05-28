package pakc01;

public class Student {
	
	static int count;
	int stu_num;
	String stu_name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	{
		stu_num = count++;
	}
	
	Student() {
		
	}
	
	Student(String stu_name, int kor, int eng, int math) {
		this.stu_name = stu_name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total / 3.0;
	}
}
