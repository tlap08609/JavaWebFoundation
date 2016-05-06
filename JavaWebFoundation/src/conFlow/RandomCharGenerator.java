package conFlow;

public class RandomCharGenerator {

	public static void main(String[] args) {
		//https://zh.wikipedia.org/wiki/ASCII
		for (int n=1; n <= 5; n++) {
			for (int s=1; s <= 20; s++) {
				int c = (int)(Math.random() * 75) + 48;
				if ( c >= 58 && c <= 64 || c >= 91 && c <= 96){
					s--;
					continue;
				}
				System.out.print((char)c);
			}
			System.out.println(", n=" + n);
		}

	}

}
