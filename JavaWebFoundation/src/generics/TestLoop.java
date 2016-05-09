package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestLoop {

	public static void main(String[] args) {
		Map<String,List<String>> map1 = new HashMap<>();
		List<String> aa = new ArrayList<>() ;
		aa.add("a");
		aa.add("b");
		aa.add("c");
		map1.put("1",aa);
//		原本的map
		for (Map.Entry<String, List<String>> entry : map1.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
//		把1傳遞給list,loop的結果
		List<String> bb = map1.get("1");
		System.out.print("map1的hashcode "+map1.get("1").hashCode()+" bb的hashcode"+bb.hashCode()+"\n");
		System.out.print("記憶體位置一不一樣??::"+ (bb == map1.get("1"))+"\n");
		bb.add("ss");
		for(String tt : bb){
		System.out.print(tt+" ");
		}
		System.out.println();
		//map的結果
		for(Map.Entry<String, List<String>> entry : map1.entrySet()){
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println();
//		第二部分
		System.out.println("第二部分:");
		Map<String,Integer> map2 = new HashMap<>();
		map2.put("1",44);
		map2.put("2",55);
		map2.put("3",44);
//		原本的map
		for(Map.Entry<String, Integer> entry : map2.entrySet()){
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
//		把1傳遞給int,loop的結果
		int testB = map2.get("1");
		Integer b = new Integer(map2.get("1"));
		System.out.print("記憶體位置一不一樣??:"+ (b == map2.get("1"))+"\n");
		//System.out.println(b instanceof Object);
		System.out.print("map2的hashcode "+map2.get("1").hashCode()+" b的hashcode"+b.hashCode()+"\n");
		b = b+2;
		System.out.println("b:"+b);
		System.out.println("------");
		//map的結果
		for(Map.Entry<String, Integer> entry : map2.entrySet()){
		System.out.println(entry.getKey()+" "+entry.getValue());
		}	
		
		
		

	}

}
