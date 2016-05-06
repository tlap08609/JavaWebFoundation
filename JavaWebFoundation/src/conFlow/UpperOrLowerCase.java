package conFlow;

import java.util.Scanner;

public class UpperOrLowerCase {

	public static void main(String[] args) {
		//將字串 kITTY sNoopY MiCKY 轉換為 Kitty Snoopy Micky
		//(第一個字母大寫，其它的字母皆為小寫)
		Scanner sn = new Scanner(System.in);
		System.out.println("請輸入英文字元或英文語句");
		if (sn.hasNext("[a-zA-Z]+")) {
			String [] tt = sn.nextLine().split(" ");
			for (int a = 0 ; a<= tt.length-1 ; a++) {
				if ((tt[a].substring(0,1)).matches("[A-Z]")) {
					System.out.print(tt[a].substring(0,1).toLowerCase()+tt[a].substring(1,tt[a].length()).toUpperCase()+" ");
				} else {
					System.out.print(tt[a].substring(0,1).toUpperCase()+tt[a].substring(1,tt[a].length()).toLowerCase()+" ");
				}
			}
		} else {
			System.out.println("你所輸入的不是英文字母");
		}
	}
}
