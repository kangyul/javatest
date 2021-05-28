package pakc01;

import java.util.Scanner;

public class Process01 {
	Scanner scan = new Scanner(System.in);
	
	int num1;
	int num2;
	
	Process01() {
		
	}
	 
	int[] getTwoNum() {
		int[] ans = new int[2];
		for(int i=0; i<2; i++) {
			System.out.println((i+1) + " 번째 수 입력: ");
			ans[i] = scan.nextInt();
		}		
		return ans;
	}
	
	void sum(int num1, int num2) {
		System.out.println("두 수의 합은: " + (num1 + num2));
	}
	
	void sumBetween(int num1, int num2) {
		int sum=0;
		int temp=0;
		
		if(num2 < num1) {
			temp = num1;
			num1 = num2; 
			num2 = temp;
		}
		
		for(int i=num1; i<num2+1; i++) {
			sum += i;
		}
		
		System.out.println("두 수 사이의 합은: " + sum);
	}
	
	void compare(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1 + "이/가 " + num2 + "보다 더 큽니다.");
		} else if(num2> num1) {			
			System.out.println(num2 + "이/가 " + num1 + "보다 더 큽니다.");
		} else {
			System.out.println("두 수의 크기는 같습니다.");
		}
	}
}
