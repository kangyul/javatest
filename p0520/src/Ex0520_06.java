import java.util.Scanner;

public class Ex0520_06 {

	public static void main(String[] args) {
		// 실수를 입력받아 -> 반올림
		Scanner scan = new Scanner(System.in);
		System.out.println("실수를 입력하세요.");
		double num = scan.nextDouble();
		System.out.println("1. 반올림 2. 올림 3. 버림");
		int option = scan.nextInt();
		System.out.println(": " + myMath(num, option));
		scan.close();
	}
	
	static double myMath(double num, int option) {
		double result = 0;
		if(option == 1) {
			result = Math.round(num);			
		} else if(option == 2){
			result = Math.ceil(num);
		} else if(option == 3) {
			result = Math.floor(num);
		}
		return result;
	}

}
