package conFlow;

import java.util.GregorianCalendar;

public class Time_1970 {
	//西元年分除以400可整除，為閏年。
	//西元年分除以4可整除但除以100不可整除，為閏年。
	public static void main(String[] args) {

		// System.out.println("格林威治時間(秒數):"+System.currentTimeMillis());
		// 1.計算整年的秒數
		// 2.計算某月的秒數(先寫)

		int seconds = Integer.MAX_VALUE; // 2147483647
		int y = 1970; // 從1970年的第0秒，開始扣減
		while (seconds >= secondsInYear(y)) { // 判斷是否有>=一整年的秒數
			seconds -= secondsInYear(y); // 扣掉一年的秒數
			y++; // 接下來算下一年的秒數
		}
		System.out.println(y + "年");
		int m = 1; // 1月開始扣減
		while (seconds >= secondsInMouth(y, m)) { // 判斷是否有>=一整個月的秒數
			seconds -= secondsInMouth(y, m); // 扣掉一個月的秒數
			m++;
		}
		System.out.println(m + "月");
        int d = 1;
        while (seconds >= 86400) { // 判斷是否有>=一天的秒數
			seconds -= 86400;      // 扣掉一天的秒數
			d++;
		}
		System.out.println( d + "日");
        
		int h = 0;
        while (seconds >= 3600) { // 判斷是否有>=一小時的秒數
			seconds -= 3600;      // 扣掉一小時的秒數
			h++;
		}
		System.out.println( h + "時");
		
		int i = 0;
        while (seconds >= 60) { // 判斷是否有>=一分鐘的秒數
			seconds -= 60;      // 扣掉一分鐘的秒數
			i++;
		}
		System.out.println( i + "分");
		System.out.println( seconds + "秒");
        
        
	}

	public static long secondsInMouth(int y, int m) {
		long sum = 0;
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		GregorianCalendar gc = new GregorianCalendar(); // 標準時間套件
		if (gc.isLeapYear(y)) { // isLeapYear:專門判斷是否為閏年
			days[2] = 29; // 如果是閏年，二月要換成29天
		}
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) { // 閏年算法，/4 /100 /400
			days[2] = 29;
		}
		sum = days[m] * 86400;
		return sum;

	}

	public static long secondsInYear(int y) {
		long sum = 0;
		for (int n = 1; n <= 12; n++) {
			sum += secondsInMouth(y, n);
		}
		return sum;

	}

}
