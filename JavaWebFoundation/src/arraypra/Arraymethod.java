package arraypra;

public class Arraymethod {

	public static void main(String[] args) {
		// equal
		// char[] Array1 = { 'A', 'B', 'C', 'D', 'E',};
		// char[] Array2 = { 'A', 'B', 'C', 'D', 'E', 'F' };
		// �b�U�@�q�A�|�o�{���D�G�������e�@�˫o�񤣥X��
		// System.out.println("array�O�_�ۦP�H"+(Array1==Array2));
		// �t�~�@�ؤ覡�G
		// boolean flag = true;
		// if (Array1.length != Array2.length) {
		// flag = false;
		// } else {
		// for (int i = 0; i < Array1.length; i++) {
		// if (Array1[i] != Array2[i]) {
		// flag = false;
		// break;
		// }
		// }
		// }
		// if (flag) {
		// System.out.println("Array1�MArray3�����e�����ۦP");
		// } else {
		// System.out.println("Array1�MArray3�����e�������ۦP");
		// }

		// �ϥ�Arrays���O��euqals���@�k
		// boolean flag = Arrays.equals(Array1, Array2);
		// System.out.println(flag);
		// if (flag) {
		// System.out.println("Array1�MArray3�����e�����ۦP");
		// } else {
		// System.out.println("Array1�MArray3�����e�������ۦP");
		// }
		// System.out.println("-------------");
		// �}�C�Ƨ�sort
		// ��w�ƧǪkBubble Sort
		// int timSort[] = { 25, 13, 39, 19, 9, 47, 10, 57, 58, 283, 43, 349 };
		// int temp;
		// for (int i = 0; i < timSort.length - 1; i++) {
		// for (int j = i + 1; j < timSort.length; j++) {
		// if (timSort[i] > timSort[j]) {// �令�u<�v�N�O�Ѥj�ƨ�p�F
		// temp = timSort[i];// �H�U�T�沣�͸�Ƥ��������G
		// timSort[i] = timSort[j];
		// timSort[j] = temp;
		// }
		// }
		// }
		// for (int ts : timSort) {
		// System.out.print(ts + " ");
		// }
		// System.out.println();

		// ��sort�|���P�ܦh�A�w�]�O���W
		// Arrays.sort(timSort);

		// �@�Ӥ@�ӥs�X��
		// for (int ts : timSort) {
		// System.out.print(ts + " ");
		// }

		System.out.println("--------");
		// �j�M�}�C��������
		char[] SearchArray = { 'A', 'C', 'X', 'W', 'E', 'B' };
		// for (int j = 0; j < SearchArray.length; j++) {// ���s��ܥثe�}�C�����e
		// System.out.print(SearchArray[j] + " ");
		// }
		// System.out.println();
		// �p�G�n�j�M�uC�v�O�_�b�}�C��
		// ����Arrays.binarySearch�@�k
		boolean Sflag = false;
		int i;
		for (i = 0; i < SearchArray.length; i++) {
			if (SearchArray[i] == 'z') {
				Sflag = true;
				break;
			}
		}
		System.out.println(Sflag);
		if (Sflag) {
			System.out.println("C�O�b�}�C������" + (i + 1) + "�Ӧ�m");
		} else {
			System.out.println("C�b�}�C���䤣��");
		}

		// �ϥ�Arrays���O����binarySearch�@�k
		// int at = Arrays.binarySearch(SearchArray, 'C');
		// System.out.println("C�O�b�}�C������" + (at+1) + "�Ӧ�m");

		System.out.println("----------");

	}

}
