package arraypra;

public class Arraymethod {

	public static void main(String[] args) {
		// equal
		// char[] Array1 = { 'A', 'B', 'C', 'D', 'E',};
		// char[] Array2 = { 'A', 'B', 'C', 'D', 'E', 'F' };
		// 在下一段你會發現問題：明明內容一樣卻比不出來
		// System.out.println("array是否相同？"+(Array1==Array2));
		// 另外一種方式：
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
		// System.out.println("Array1和Array3的內容完全相同");
		// } else {
		// System.out.println("Array1和Array3的內容不完全相同");
		// }

		// 使用Arrays類別中euqals的作法
		// boolean flag = Arrays.equals(Array1, Array2);
		// System.out.println(flag);
		// if (flag) {
		// System.out.println("Array1和Array3的內容完全相同");
		// } else {
		// System.out.println("Array1和Array3的內容不完全相同");
		// }
		// System.out.println("-------------");
		// 陣列排序sort
		// 氣泡排序法Bubble Sort
		// int timSort[] = { 25, 13, 39, 19, 9, 47, 10, 57, 58, 283, 43, 349 };
		// int temp;
		// for (int i = 0; i < timSort.length - 1; i++) {
		// for (int j = i + 1; j < timSort.length; j++) {
		// if (timSort[i] > timSort[j]) {// 改成「<」就是由大排到小了
		// temp = timSort[i];// 以下三行產生資料互換的結果
		// timSort[i] = timSort[j];
		// timSort[j] = temp;
		// }
		// }
		// }
		// for (int ts : timSort) {
		// System.out.print(ts + " ");
		// }
		// System.out.println();

		// 用sort會輕鬆很多，預設是遞增
		// Arrays.sort(timSort);

		// 一個一個叫出來
		// for (int ts : timSort) {
		// System.out.print(ts + " ");
		// }

		System.out.println("--------");
		// 搜尋陣列中的元素
		char[] SearchArray = { 'A', 'C', 'X', 'W', 'E', 'B' };
		// for (int j = 0; j < SearchArray.length; j++) {// 重新顯示目前陣列的內容
		// System.out.print(SearchArray[j] + " ");
		// }
		// System.out.println();
		// 如果要搜尋「C」是否在陣列中
		// 不用Arrays.binarySearch作法
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
			System.out.println("C是在陣列中的第" + (i + 1) + "個位置");
		} else {
			System.out.println("C在陣列中找不到");
		}

		// 使用Arrays類別中的binarySearch作法
		// int at = Arrays.binarySearch(SearchArray, 'C');
		// System.out.println("C是在陣列中的第" + (at+1) + "個位置");

		System.out.println("----------");

	}

}
