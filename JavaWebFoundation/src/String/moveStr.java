package String;

import java.util.HashMap;
import java.util.Scanner;

public class moveStr {

	public static void main(String[] args) {
		// TODO 字元移動
		// ab**cd**e*12 -> *****abcde12
		System.out.println("請輸入字串:");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		System.out.println("處理前:"+str);
		int sum = beginMove(ch);
		System.out.println("此'*'字元數量為:"+sum);
		

	}
	public static int beginMove(char[] ch){
		int i,j = ch.length-1;
		for (i = j;j >= 0;j--) {
			if (ch[i] != '*') {
				i--;
			} else if (ch[j] != '*') {
				ch[i] = ch[j];
				ch[j] = '*';
				i--;
			}
		}
			System.out.print("處理後的字串為:");
			for (int k = 0 ; k < ch.length;k++) {
				System.out.print(ch[k]);
			}
			System.out.println();
			return i+1;
		
	}

}
