package String;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pra {

	public static void main(String[] args) {
		String tt = " hello,world!!! ";
		System.out.println(tt);
		System.out.println(tt.trim());
		System.out.println();
		
		//int tt1 = char(65);
		char ttt = 'A';
		System.out.print((char)65);
		System.out.print((int)ttt);
		HashMap <Character,Float> ct= new HashMap<>();
		String input = "A125986566tlap086091@livemail.tw";
		Matcher mt = Pattern.compile("(?i)[A-Z][12][0-9]{8}").compile("(?i)^[_A-Z\\d-\\+\\.\\=]+@[A-Z\\d-]+(\\.[A-Z\\d-]+)*(\\.[A-Z]{2,})$").matcher(input);
		while (mt.find()){
			System.out.println("access");
			System.out.println(mt.group());
		}
//		System.out.print();
	}

}
