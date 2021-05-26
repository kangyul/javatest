
public class Ex0521_03 {

	public static void main(String[] args) {
		LottoBall b = new LottoBall();
		
		for(int i=0; i<b.ball.length; i++) {
			System.out.println(b.ball[i]);
		}
		
		int index = 0;
		int temp = 0;
		for(int i=0; i<200; i++) {
			index = (int)(Math.random()*45);
			temp = b.ball[0];
			b.ball[0] = b.ball[index];
			b.ball[index] = temp;
		}
		
		for(int i=0; i<b.ball.length; i++) {
			System.out.println(b.ball[i]);
		}
		
	}

}
