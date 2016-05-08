package pattern;

import java.util.Scanner;

public class RegIdCard {
	//https://zh.wikipedia.org/wiki/%E4%B8%AD%E8%8F%AF%E6%B0%91%E5%9C%8B%E5%9C%8B%E6%B0%91%E8%BA%AB%E5%88%86%E8%AD%89
	public static void main(String[] args) {
		boolean check = false;
		Scanner ss = new Scanner(System.in);
		System.out.println("請輸入身分證字號：");
		String input = ss.next();
		if (input.matches("[a-zA-Z][12][0-9]{8}")) {
			check = checkPID(input);
			if (check) {
				System.out.println("身份證字號正確！");
			} else {
				System.out.println("身份證字號不合法！");
			}
		} else {
			System.out.println("身份證字號錯誤！請檢查看看！");
		}

	}

	public static boolean checkPID(String input) {
		int[] num = { 10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22,
				35, 23, 24, 25, 26, 27, 28, 29, 32, 30, 31, 33 };
		String inputToUpper = input.toUpperCase();
		byte[] idToByte = inputToUpper.getBytes();
		int[] idToCount = new int[idToByte.length + 1];
		int firstChar = num[idToByte[0] - 65]; 
		idToCount[0] = (int) Math.floor(firstChar / 10); 
		idToCount[1] = (firstChar % 10); 
		// 第一個數字開始及以後的數字
		for (int i = 1; i < idToByte.length; i++) {
			idToCount[i + 1] = (idToByte[i] - 48);
		}
		// 開始計算總和
		int total = idToCount[0];
		for (int i = 1; i < idToCount.length - 1; i++) {
			total += (idToCount[i] * (10 - i));
		}
		// 決定回傳值
		if (idToCount[idToCount.length - 1] == 0 && (total % 10) == 0) {
			return true;
		} // 最後一碼為0 且total % 10 也為0
		else {
			return (idToCount[idToCount.length - 1] == (10 - (total % 10))) ? true
					: false;
		} // 最後一碼不為0 時要用10 –total % 10
	}
}
