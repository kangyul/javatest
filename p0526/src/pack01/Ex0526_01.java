package pack01;

public class Ex0526_01 {

	public static void main(String[] args) {
		Tv t = new Tv();
		CaptionTv ctv = new CaptionTv();
		ctv.text = "lalala";
		
		Tv t2 = new CaptionTv(); // polymorphism
		
		Tv tt=null;
		CaptionTv cctv=null;
		cctv = (CaptionTv) tt; // 조상과 자손의 참조변수는 서로 교환이 가능함.  
		// 
		
		
		// t = ctv; // 다형성: 조상의 참조변수로 자손의 객체를 다루는 것. 
		// Tv = new CaptionTv();
		
		// ctv = t; 자손의 참조변수로 조상의 객체를 다루는 것은 안 됨.
		
		
		
		
	}

}
