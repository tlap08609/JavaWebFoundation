package arraypra;

public class BubbleSort {
	//Algorithm
	//http://www.csie.ntnu.edu.tw/~u91029/Algorithm.html
	public static void main(String[] args) {
		int tt[] = { 25, 13, 39, 19, 9, 47, 10, 57, 58, 283, 43, 349 };
		//int temp;
		for (int i = 0; i < tt.length - 1; i++) {
			for (int j = i + 1; j < tt.length; j++) {
				if (tt[i] > tt[j]) {
					tt[i] = tt[i] ^ tt[j];
					tt[j] = tt[i] ^ tt[j];
					tt[i] = tt[i] ^ tt[j];
					//temp = tt[i];
					//tt[i] = tt[j];
					//tt[j] = temp;
				}
			}
		}
		for (int ts : tt) {
			System.out.print(ts + " ");
		}
		System.out.println();

	}

}
