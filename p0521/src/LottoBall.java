
public class LottoBall {
	static int[] ball = new int[45];
	
	LottoBall() {
		
	}
	
	static {
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		
		int index = 0;
		int temp = 0;
		for(int i=0; i<200; i++) {
			index = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[index];
			ball[index] = temp;
		}
		
		for(int i=0; i<ball.length; i++) {
			System.out.println(ball[i]);
		}
	}
	
	

}
