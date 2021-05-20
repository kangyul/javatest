
public class MyMath2 {
	long a,b; // instance variable - 객체 선언 후 사용, 클래스 내 사용
	
	long add() { // 인스턴스 메소드 - 객체 선언 후 사용, 클래스 내 사용
		return a+b;
	}
	
	static long add(long a, long b) { // 클래스 메소드 - 객체선언 없이 사용
		return a+b;
	}
	
	
}
