package pattern;

import java.util.regex.Pattern;

public class Validator {
	public static final boolean email(CharSequence s) {
		return Pattern.matches("(?i)^[_A-Z\\d-\\+\\.\\=]+@[A-Z\\d-]+(\\.[A-Z\\d-]+)*(\\.[A-Z]{2,})$",s);
	}
	public static final boolean idCard(CharSequence s) {
		return Pattern.matches("(?i)[A-Z][12][0-9]{8}",s);
	}
//	public static final boolean time(CharSequence s) {
//		return Pattern.matches("^(?:0?[0-9]|1[0-9]|2[0-3])(?::(?:0?[0-9]|[1-4][0-9]|5[1-9])){2}$", s);
//	}
	public static final boolean mobile(CharSequence s) {
		return Pattern.matches("^(?:\\+?886|0)(9[0-9]{8})$",s);
	}
	public static final boolean tele(CharSequence s) {
		return Pattern.matches("^(?:\\+?886|0)?0?([29][0-9]{8}|4[0-9]{7,8}|[3-8][0-9]{7})(?:\\s*(#)\\s*([0-9]{1,10}))?$",s);
	}
//	public static final boolean date(CharSequence s) {
//		return Pattern.matches("^[0-9]+[-/](?:(?:0?[13578]|1[02])[-/](?:0?[1-9]|[12][0-9]|3[01])|0?2[-/](?:0?[1-9]|[12][0-9])|(?:0?[469]|11)[-/](?:0?[1-9]|[12][0-9]|30))$",s);
//		if (s == null || !Pattern.matches("^[0-9]+[-/](?:(?:0?[13578]|1[02])[-/](?:0?[1-9]|[12][0-9]|3[01])|0?2[-/](?:0?[1-9]|[12][0-9])|(?:0?[469]|11)[-/](?:0?[1-9]|[12][0-9]|30))$", s)) return false;
//		if (!Pattern.matches("^[0-9]+[-/]0?2[-/]29$", s)) return true;
//		int y = Integer.parseInt(Utils.replace(s, "^([0-9]+)[-/].*$", "$1").toString());
//		return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);
//	}

}
