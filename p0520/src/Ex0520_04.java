import java.util.Scanner;

public class Ex0520_04 {

	public static void main(String[] args) {
		// 두 수를 입력받아 큰 수와 작은 수를 표시하시오.
		Scanner scan = new Scanner(System.in);
		Compare c = new Compare();
		System.out.println("1st Num: ");
		c.bigNum = scan.nextInt();
		System.out.println("2nd Num: ");
		c.smallNum = scan.nextInt();
		
		compare(c);
		
		if(c.equal == 1) {
			System.out.println("두 수가 같습니다.");
		} else {
			System.out.println(c.bigNum + "이/가" + c.smallNum + "보다 큽니다.");
		}
		
		scan.close();
	}
	
	static void compare(Compare c) {
		int temp=0;
		if(c.bigNum > c.smallNum) {
			
		} else if(c.bigNum < c.smallNum){
			temp = c.bigNum;
			c.bigNum = c.smallNum;
			c.smallNum = temp;
		} else {
			c.equal = 1;
		}
	}

}
