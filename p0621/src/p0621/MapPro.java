package p0621;

import java.util.ArrayList;
import java.util.HashMap;

public class MapPro {
	public HashMap searchName(ArrayList<Student> list, String name) {
		HashMap hs = new HashMap();
		StringBuffer sbf = new StringBuffer();
		String sNameResult = "이름이 검색되지 않았습니다.";
		String sNames = "";
		
		for(Student str : list) {
			sbf.append(str.getName() + " ");
			if(str.getName().contains(name)) {
				sNameResult = "이름이 검색되었습니다.";
				sNames += str.getName() + " ";
			}
		}
		
		String allNames = sbf.toString();
		hs.put("allNames", allNames);
		hs.put("sNameResult", sNameResult);
		hs.put("sNames", sNames);
		
		return hs;
	}
}
