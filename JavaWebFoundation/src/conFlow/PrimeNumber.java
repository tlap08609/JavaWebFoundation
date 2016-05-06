package conFlow;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO 有沒有更好的作法？
		//找出2~100所有質數，每印出五個就換行
		int count = 0;
		for (int a = 2;a <= 100;a++) {
			boolean test = true ;
			for (int b = 2; b < a;b++) {
				if ( a%b == 0 ) {
					test = false;
					break;
				}
			}
			if (test) {
				count++;
				System.out.printf("%d\t",a);
				if (count ==5) {
					System.out.println();
					count = 0;
				}
			}
		}
	}
}
