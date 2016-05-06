package PatternMatches;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncoderPra {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String text = URLEncoder.encode("http://openhome.cc","UTF-8");
		System.out.println(text);
		String text1 = URLEncoder.encode("林","UTF-8");
		System.out.println(text1);
		//用ISO-8859-1解碼會gg
		String text2 = URLDecoder.decode("%E6%9E%97","ISO-8859-1");
		System.out.println(text2);
	}

}
