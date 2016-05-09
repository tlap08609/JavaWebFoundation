package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

	public static void main(String[] args) {
		// http://blog.xuite.net/chuyichung/twblog/157410856-%E8%BA%AB%E5%88%86%E8%AD%89%E5%AD%97%E8%99%9F%E5%88%B0%E5%BA%95%E6%9C%83%E4%B8%8D%E6%9C%83%E9%87%8D%E8%A4%87%E9%98%BF%3F
		// TODO ID CARD
		// "(?i)^[_A-Z\\d-\\+]+(\\.[_A-Z\\d-]+)*@[A-Z\\d-]+(\\.[A-Z\\d-]+)*(\\.[A-Z]{2,})$"
		// ^(?i)[_a-z\\d-\\+]+(\\.[_a-z\\d-]+)*@[a-z\\d-]+(\\.[a-z\\d-]+)*(\\.[a-z]{2,})$
		// Matcher mt =
		// Pattern.compile("\\p{InCJKUnifiedIdeographs}").matcher("s遲s毓s霆s");
		// "".equals(anObject)
		// while (mt.find()) {
		// System.out.println("yes");
		// String ss = mt.group();
		// System.out.println(ss);
		// }
		// }
//		String mustSplitString = "A,;B, C, D, E";
//		String[] AfterSplit = mustSplitString.split("[,;\\s]+");
//		for (int i = 0; i < AfterSplit.length; i++)
//		System.out.println(AfterSplit[i]);
//		
//		String nn = "A, B,,,E,F";
//		String nnArray[] = nn.split("[,\\s]+");
//		for (String na : nnArray) {
//			System.out.print(na+" ");
//		}
//		System.out.println();
//		String nn1 = "A1aaaa1B2,,,222222E3333,,,,333F";
//		String nnArray1[] = nn1.split("[^A-Z]+");
//		for (String na1 : nnArray1) {
//			System.out.print(na1+" ");
//		}
//		Matcher mc = Pattern.compile("(?!asdf)[\\d]").matcher("1234asdf5678");
//		while (mc.find()) {
//			System.out.print(mc.group()+" ");
//		}
		//"asdf tims alices tree apple evas"
//		Matcher mc = Pattern.compile("^(?!^asdf$).+$").matcher("1234asdf5678");
//		while (mc.find()) {
//			//System.out.print("true");
//			System.out.print(mc.group()+" ");
//		}
		//String ans = "tims alices tree apple eva".replaceAll(regex, replacement);
		//System.out.print(ans);
		//String dateStr = "05/19/2001";
//		Matcher m = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})").matcher(dateStr);
//		if (m.matches()) {
//		
//	      System.out.println(m.group(0));
//		  int day   = Integer.parseInt(m.group(1));
//		  int month = Integer.parseInt(m.group(2));
//		  int year  = Integer.parseInt(m.group(3));
//		  System.out.print(day+" "+month+" "+year);
//		}
		//"(?i)^[_A-Z\\d-\\+]+(\\.[_A-Z\\d-]+)*@[A-Z\\d-]+(\\.[A-Z\\d-]+)*(\\.[A-Z]{2,})$"
//		String dateStr = "tlap086091@livemail.tw";
//		Matcher m = Pattern.compile("(?i)^[_A-Z\\d-\\+]+(\\.[_A-Z\\d-]+)*@[A-Z\\d-]+(\\.[A-Z\\d-]+)*(\\.[A-Z]{2,})$").matcher(dateStr);
//		if (m.matches()) {
//	      System.out.println(m.group(0));
		//nice
		//String ans = "tims alices tree apple eva".replaceAll("(?!<\\w)s", "'s");
		//System.out.print(ans);
		
		//Matcher cm = Pattern.compile("(?i)[A-Z]+").matcher("tlap0860");
//		Matcher cm = Pattern.compile("[_A-Z\\d-\\+]+").matcher("!");
//		if (cm.find()) {
//			System.out.print("true") ;
//		} else {
//			System.out.print("false");
//		}
		
				
		

	}

}
