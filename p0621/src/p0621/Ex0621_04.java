package p0621;

import java.util.HashSet;
import java.util.Iterator;

public class Ex0621_04 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(1);
		set.add(2);
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(3);
		set.add(4);
		set.add(3);
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
	}
}
