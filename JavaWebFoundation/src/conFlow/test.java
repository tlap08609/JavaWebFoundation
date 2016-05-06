package conFlow;
//得義面試考題
public class test {

	public static void main(String[] args) {
		printStar(10);
		
	}

	public static void printStar(int width) {
		int a;
		for (a = 1; a <= width; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (a = width-1; a >= 1; a--) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
