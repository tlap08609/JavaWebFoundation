package conFlow;

public class Star {

	public static void main(String[] args) {
		System.out.println("------------------");
		// 直角三角形(上至下遞增)
		for (int a = 1; a <= 6; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------------");
		// 直角三角形(上至下遞減)
		for (int a = 6; a >= 1; a--) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------");
		// 反向直角三角形(上至下遞增)
		for (int a = 5; a >= 0; a--) {
			for (int b = 0; b <= 6; b++) {
				if (a > b) {
					System.out.print(" ");
				} else if (a < b) {
					System.out.print("*");
				}

			}
			System.out.println();
		}
		System.out.println("------------------");
		// 等腰三角形(上至下遞減)
		for (int a = 1; a <= 3; a++) {
			for (int b = 1; b <= 5; b++) {
				if (a == 1 && b == 3) {
					System.out.print("*");
				} else if (a == 2 && b >= 2 && b <= 4) {
					System.out.print("*");
				} else if (a == 3 && b >= 1 && b <= 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		System.out.println("------------------");
		//合併1,2
		for (int a = 1; a <= 6; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int a = 5; a >= 1; a--) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------");
		
		
		

	}

}
