package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

	public static void main(String[] args) {
		// 
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

		
		//Matcher cm = Pattern.compile("(?i)[A-Z]+").matcher("tlap0860");
//		Matcher cm = Pattern.compile("[_A-Z\\d-\\+]+").matcher("!");
//		if (cm.find()) {
//			System.out.print("true") ;
//		} else {
//			System.out.print("false");
//		}
		//asii gg
//		Matcher cm = Pattern.compile("[9-0]").matcher("1");
//		if (cm.find()) {
//			System.out.print("true") ;
//		} else {
//			System.out.print("false");
//		}
		
		Matcher cm = Pattern.compile("s\\b").matcher("tims alices tree Toms eva");
		if (cm.find()) {
			System.out.print("true") ;
			System.out.print(cm.group(0)) ;
		} else {
			System.out.print("false");
		}
//		String ans = "           我".replaceAll("(?m)^\\s+", "");
//		System.out.print(ans);		
		

	}

}
