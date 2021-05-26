package pack01;

public class Ex0526_03 {

	public static void main(String[] args) {
		Car c = null;
		FireEngine f1 = new FireEngine(); // 객체선언
		FireEngine f2 = null;
		
		f1.water();
		c = f1;
		
		f2 = (FireEngine) c;
		f2.water();
		
		f2 = f1; 
		
		
	}

}
