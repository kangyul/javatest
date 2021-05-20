import java.util.Scanner;

public class Ex0520_05 {

	public static void main(String[] args) {
		// 두 수를 입력바당 더하기를 해서 결과값을 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("두 수 입력.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		
		System.out.println("두 수의 합은: " + add(num1, num2));
		System.out.println("두 수의 차는: " + sub(num1, num2));
		System.out.println("두 수의 곱은: " + sub(num1, num2));
		System.out.println("두 수의 몫은: " + sub(num1, num2));
		
		
		scan.close();
	} // main
	
	static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	static int sub(int num1, int num2) {
		return num1 - num2;
	}

	static int multi(int num1, int num2) {
		return num1 * num2;
	}

	static int div(int num1, int num2) {
		return num1 / num2;
	}

} // class
