import java.util.Scanner;

public class Ex0520_07 {

	public static void main(String[] args) {
		// 두 수를 입력받아 -> cal() 메소드 호출
		// cal() -> 더하기, 곱하기, 빼기, 나누기를 해서 리턴 받음.
		Scanner scan = new Scanner(System.in);
		SignData s = new SignData();
		System.out.println("main method" + s);
		System.out.println("두 수 입력.");
		s.num1 = scan.nextInt();
		s.num2 = scan.nextInt();
		
		cal(s);
		
		System.out.println("두 수 더하기: " + s.result1);
		System.out.println("두 수 빼기: " + s.result2);
		System.out.println("두 수 곱하기: " + s.result3);
		System.out.println("두 수 나누기: " + s.result4);
		
	} // main
	
	static void cal(SignData s1) {
		System.out.println("cal method: "+s1);
		s1.result1 = s1.num1 + s1.num2;
		s1.result2 = s1.num1 - s1.num2;
		s1.result3 = s1.num1 * s1.num2;
		s1.result4 = s1.num1 / s1.num2;
	}
	

} // class
