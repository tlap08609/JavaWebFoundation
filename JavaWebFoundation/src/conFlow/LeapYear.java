package conFlow;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		//TODO 判斷是否閨年 e.g.89,41是,189,42不是
		GregorianCalendar gc = new GregorianCalendar();
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s","請輸入年份:");
		if (gc.isLeapYear(sc.nextInt()+1911)) {
			System.out.print("正確"); 
		} else {
			System.out.print("不正確");
		}
	}
}
