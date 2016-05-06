package conFlow;

import java.util.Scanner;

public class UpperOrLowerCase {

	public static void main(String[] args) {
		//接受使用者輸入一個字元，如果小寫就轉換成大寫，相反亦之，但如果
		//輸出的不是英文字元，則輸出"你所輸入的不是英文字母"
		//TODO 將字串 kITTY sNoopY MiCKY 轉換為 Kitty Snoopy Micky
		//(第一個字母大寫，其它的字母皆為小寫)
		Scanner sn = new Scanner(System.in);
		System.out.println("請輸入英文字元");
		if (sn.hasNext("[a-zA-Z]")) {
			if (sn.hasNext("[A-Z]")) {
				System.out.print("你輸入的是大寫，我來幫你改成小寫: ");
				System.out.println((sn.next()).toLowerCase());
			} else{
				System.out.print("你輸入的是小寫，我來幫你改成大寫: ");
				System.out.println((sn.next()).toUpperCase());
			}
		} else {
			System.out.println("你所輸入的不是英文字母");
		}
	}

}
