package String;

import java.util.Scanner;

public class randomletterandnumber {

	public static void main(String[] args) {
		System.out.println("請輸入幾組號碼,幾個字元,e.g.先輸入3 enter再按4  =3組4字元");
		Scanner sn = new Scanner(System.in);
		int nc = sn.nextInt();
		int sc = sn.nextInt();
		for(int n=1; n <= nc; n++){
			for(int s=1; s <= sc; s++){
				int c = (int)(Math.random() * 75) + 48;
				if ( c >= 58 && c <= 64 || c >= 91 && c <= 96){
					s--;
					continue;
				}
				System.out.print((char)c);
			}
			System.out.println(", 第" + n + "組");
		}
		sn.close();
	}

}
