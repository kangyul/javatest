import java.util.Scanner;

public class Ex0520_03 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		SignData s = new SignData();
		int sign = 0;
		
		System.out.println("데이터를 입력하세요.>>");
		int num1 = scan.nextInt();
		System.out.println("두 번째 데이터를 입력하세요.>>");
		int num2 = scan.nextInt();
		System.out.println("사칙연산 선택하세요.>>");
		System.out.println("0. 더하기 1. 빼기 2. 곱하기 3. 나누기");
		System.out.println("번호를 선택하세요.>>");
		s.sign = scan.nextInt();
		
		double result = calculation(num1, num2, s);
		
		// #1 if statement
		// #2 Switch Statement;
		
//		if(sign == 0) {
//			System.out.print("더하기");
//		} else if(sign == 1) {
//			System.out.print("빼기");
//		} else if(sign == 2) {
//			System.out.print("곱하기");
//		} else if(sign == 3) {
//			System.out.print("나누기");
//		}
		
		// #3 Created String variable in SignData method
		
		System.out.println(s.signOutput + " 사칙연산 결과값: " + result);
		
		scan.close();
	} // main
	
	static double calculation(int num1, int num2, SignData s) {
		double result = 0;	
		
		switch (s.sign) {
		case 0: // 더하기
			s.signOutput = "더하기";
			result = num1 + num2;
			break;
		case 1: // 빼기
			s.signOutput = "빼기";
			result = num1 - num2;
			break;
		case 2: // 곱하기
			s.signOutput = "곱하기";
			result = num1 * num2;
			break;
		case 3: // 나누기
			s.signOutput = "나누기";
			result = num1 / num2;
			break;
		} // switch
		return result;
	} // calculation method

} // class
