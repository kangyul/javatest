package pakc01;

import java.util.Scanner;

public class Lotto_process {
	Scanner scan = new Scanner(System.in);
	
	Lotto_process() {

	}
	
	void createLotto(int[] ball) {
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		System.out.println("번호가 생성되었습니다.");
	}
	
	void shuffleLotto(int[] ball) {
		int index=0;
		int temp=0;
		for(int i=0; i<1000; i++) {
			index = (int)(Math.random()*45);
			temp = ball[index];
			ball[index] = ball[0];
			ball[0] = temp;
		}
	}
	
	void getNum(int[] myPick) {
		for(int i=0; i<6; i++) {
			myPick[i] = scan.nextInt();
		}
	}
	
	void printResult(int[] ball, int[] myPick) {
		System.out.println("당첨번호는: ");
		for(int i=0; i<6; i++) {
			System.out.print(ball[i] + " ");
		}
	}
	
	
	
}
