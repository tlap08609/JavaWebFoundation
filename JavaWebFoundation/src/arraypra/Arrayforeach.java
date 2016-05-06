package arraypra;

public class Arrayforeach {

	public static void main(String[] args) {
		// array
		System.out.println("�C�[�`");
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
			System.out.println("��" + x + "�C���X���G" + sum);
		}

		System.out.println("--------");
		// 
		System.out.println("��[�`");
		for (int x = 0; x < tim[x].length; x++) {
			sum = 0;
			for (int y = 0; y < tim.length; y++) {
				sum += tim[y][x];
			}
			System.out.println("��" + x + "�檺�X���G" + sum);
		}
		System.out.println("--------");
		// sum�k�s
		sum = 0;
		System.out.println("�Ҧ������[�`");
		// �Ҧ��[�`
		for (int x = 0; x < tim[x].length; x++) {
			for (int y = 0; y < tim.length; y++) {
				sum += tim[y][x];
			}
		}
		// �]�i�H��foreach��
		// for (int[] aa : tim) {
		// for (int tt : aa) {
		// sum += tt;
		// }
		// }
		System.out.println("�X���G" + sum);

	}

}
