
public class Point {
	int x;
	int y;

	Point() {
		
	}
	
	Point(int x, int y) { // 매개변수가 있는 생성자
		this.x = x;
		this.y = y;
	} 
	
	String getLocation() {
		return "X: " + x + "," + "Y: " + y;
	}
}
