package conFlow;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		//輸入兩數，求得最大公因數 e.g.a:792,b=102,gcd=6;a:117,b=663,gcd=39;
		//兩變數互換的應用:1.用三變數2.加減乘除（會有溢位的問題)3.XOR最好
		System.out.println("請輸入第一個數字");
		Scanner sn = new Scanner(System.in);
		//int temp;
		int a,b,end;
		if (sn.hasNext("\\d+")) {
			a = sn.nextInt();
			System.out.println("請輸入第二個數字");
			if (sn.hasNext("\\d+")) {
				b = sn.nextInt();
				if (a < b) {
					//temp = a; a = b; b = temp;
					//a = a + b;b = a - b;a = a - b;
					a = a ^ b;b = a ^ b;a = a ^ b; 
				}
				while (a != 0) {
					a = a % b;
					if (a != 0) {
						//temp = a; a = b; b = temp;
						//a = a + b;b = a - b;a = a - b;
						a = a ^ b;b = a ^ b;a = a ^ b; 
					}
				}
				end = b;
				System.out.print("最大公因數為:"+end);
			} else {
				System.out.println("請輸入數字好嗎？下回繼續");
			}
		} else {
			System.out.println("請輸入數字好嗎？下回繼續");
		}
		sn.close();
		
	}

}
