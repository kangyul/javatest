
public class Ex0521_05 {

	public static void main(String[] args) {
		String num="";
		int count=10;
		// S001, S002
//		System.out.printf("%d\n", 5);
//		System.out.printf("%04d\n", 5);
//		System.out.printf("%07.2f\n", 78.123);
//		System.out.printf("%10s\n", "더좋은");
//		System.out.printf("%,d", 123456789);
		String str_num = "S" + String.format("%03d", ++count);
		System.out.println(str_num);
		
//		String.format(num, args)

	}

}
