package arraypra;

public class Arrayforeach {

	public static void main(String[] args) {
		// array列加總
		System.out.println("列加總");
		int tim[][] = { { 1, 7, 15 }, { 9, 3, 4 }, { 6, 8, 13 }, { 11, 5, 2 },
				{ 10, 7, 9 } };
		int sum = 0;
		// System.out.println(tim.length);
		// System.out.println(tim[0][0]);

		for (int x = 0; x < tim.length; x++) {
			sum = 0;
			for (int y = 0; y < tim[x].length; y++) {
				sum += tim[x][y];

			}
			System.out.println("第" + x + "列的合為：" + sum);
		}

		System.out.println("--------");
		// 行加總
		System.out.println("行加總");
		for (int x = 0; x < tim[x].length; x++) {
			sum = 0;
			for (int y = 0; y < tim.length; y++) {
				sum += tim[y][x];
			}
			System.out.println("第" + x + "行的合為：" + sum);
		}
		System.out.println("--------");
		// sum歸零
		sum = 0;
		System.out.println("所有元素加總");
		// 所有加總
		for (int x = 0; x < tim[x].length; x++) {
			for (int y = 0; y < tim.length; y++) {
				sum += tim[y][x];
			}
		}
		// 也可以用foreach找
		// for (int[] aa : tim) {
		// for (int tt : aa) {
		// sum += tt;
		// }
		// }
		System.out.println("合為：" + sum);

	}

}
