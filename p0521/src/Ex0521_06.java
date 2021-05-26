import java.util.Scanner;

public class Ex0521_06 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Student2[] s = new Student2[10];
		Student_Main sMain = new Student_Main();
		Student_Print sPrint = new Student_Print();
		
		
		while(true) {
			sMain.printMain(); // shows options
			int option = scan.nextInt();
			switch (option) {
			case 1: // 1. get Student info
				
				break;
			case 2: // 2. print Student info
				break;
			case 3: // 3. update Student info
				break;
			case 4: // 4. search Student info
				break;
			case 5: // 5. rank Student info
				break;
			case 0: // 0. end the program
				break;
			default:
				break;
			}
		}// while
	}// main
	
	
	
} // class
