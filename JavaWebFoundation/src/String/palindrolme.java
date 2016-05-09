package String;

import java.util.Scanner;

public class palindrolme {

	public static void main(String[] args) {
		//回文
		//請輸入一個整數->123321->123321是回文!
		//請輸入一個整數->665->665不是回文!
		int n;
		System.out.println("請輸入一個整數");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		if (isPalindrome(n)) {
			System.out.println(n+"是回文!");
		} else {
			System.out.println(n+"不是回文!");
		}
	}
	public static boolean isPalindrome(int n) {
		int m = reverse(n);
		if (m==n) {
			return true;
		} else {
			return false;
		}
	}
	private static int reverse(int i) {
		int s,j=0;
		s = i;
		while (s != 0) {
			j = j*10+s%10;
			s = s/10;
		}
		return j;
	}
	

}
