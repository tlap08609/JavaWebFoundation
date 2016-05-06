package arraypra;

public class Dicequestion {

	public static void main(String[] args) {
		// 可算出骰子隨機甩一萬次的點數分佈狀況
		int[] dice = { 0, 0, 0, 0, 0, 0 };
		int dicetotal;
		for (int t = 1; t <= 10000; t++) {
			dicetotal = (int) (Math.random() * 6) + 1;
			++dice[dicetotal - 1];
		}
		for (int xxx : dice) {
			System.out.print(xxx + " ");
		}

	}

}
