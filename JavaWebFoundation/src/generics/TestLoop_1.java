package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TestLoop_1 {

	public static void main(String[] args) {
		Map<String,Map<String,List<String>>> map = new LinkedHashMap<>();
		Map<String,List<String>> tt = new HashMap<>();
		tt.put("1", new ArrayList<>(Arrays.asList("aa","bb")));
		map.put("a", tt);
//		for(Map.Entry<String,Map<String,List<String>>> ee : map.entrySet()){
//			System.out.print(ee.getKey());
//			System.out.println();
			for(Map.Entry<String,List<String>> ee1 : tt.entrySet()){
				System.out.println(ee1.getKey()+ee1.getValue());
//			}
			
		}
		
		
		

	}

}
