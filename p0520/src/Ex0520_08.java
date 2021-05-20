import java.util.Scanner;

public class Ex0520_08 {

	public static void main(String[] args) {
		// 두 수를 입력, sum메소드호출 return 값 출력
		// 
		Scanner scan = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("두 수 사이의 값의 합은: " + sum(num1, num2));
		
		scan.close();
	} // main
	
	static int sum(int num1, int num2) {
		int sum=0;
		for(int i = num1; i<num2+1; i++) {
			sum += i;
		}
		return sum;
	} // sum

} // class
