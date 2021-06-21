package p0621;

public class Ex0621_01 {

	public static void main(String[] args) {
		String[] str = {"홍길동", "이순신", "유관순", "강감찬", "김유신"};
		StringBuffer sbf = new StringBuffer("");
		
		for(int i=0; i<str.length; i++) {
			sbf.append(str[i]); 
			if(i == str.length-1) break;
			sbf.append(", ");
		}
		
		System.out.println(sbf);
		
		String str2 = sbf.toString();
		
		System.out.println(str2);
		String[] result = str2.split(", ");
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
		
	}

}
