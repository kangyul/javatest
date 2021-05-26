package pack01;

public class Ex0526_05 {

	public static void main(String[] args) {
		// Product 
		// p1에 c1 참조변수 복사
		// c1에 p2 참조변수 복사 
		// p1에 c2 참조변수 복사
		Product p1 = null;
		Computer c1 = new Computer();
		Computer c2 = null;
		SmartPhone s1 = new SmartPhone();
		SmartPhone s2 = null;
		
		p1 = s1;
		s1 = (SmartPhone) p1;
		s2 = s1;
		// c2.cpuSpeed();
		
		if(p1 instanceof Computer) {
			System.out.println("Computer의 참조변수 입니다.");
		} else if(p1 instanceof SmartPhone) {
			System.out.println("SmartPhone의 참조변수 입니다.");			
		}
		
		
//		Car c1 = null; // c1은 Car의 참조변수
//		FireEngine f1 = new FireEngine();
//		FireEngine f2 = null;
//		FireEngine f3 = null;
//		Ambulance a1 = new Ambulance();
//		Ambulance a2 = null;
//		Ambulance a3 = null;	
//		
//		c1 = f1;
//		
//		if(c1 instanceof Car) {
//			f3 = (FireEngine) c1;
//			System.out.println("FireEngine 참조변수에 복사했습니다.");
//		} else if(c1 instanceof Ambulance) {
//			a3 = (Ambulance) c1;
//			System.out.println("Ambulance 참조변수에 복사했습니다.");
//		}
//		
//		if(c1 instanceof FireEngine) {
//			System.out.println("FireEngine 변수입니다.");
//		}
		

	}

}
