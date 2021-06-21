package p0621;

import java.util.ArrayList;
import java.util.HashMap;

public class MapProcess {

	public HashMap selectStudent(ArrayList<Student> list) {
		HashMap map = new HashMap();
		StringBuffer sbf = new StringBuffer();
		String name = "";
		String resultTitle = "데이터가 없습니다.";
		int result=0; // 0은 데이터가 없음; 1: 데이터가 있음. 
		
		
		for(Student s:list) {
			sbf.append(s.getName()+" ");
			if(s.getName().equals("홍길동")) {
				result = 1;
				resultTitle = "데이터가 있습니다.";
				name = "홍길동";				
			}
		}
		
		String strName = sbf.toString();
		map.put("strName", strName);
		map.put("result", result);
		map.put("resultTitle", resultTitle);
		map.put("name", name);
		
		
		return map;
	}
	
}
