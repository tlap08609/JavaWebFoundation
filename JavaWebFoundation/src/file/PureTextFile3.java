package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//BufferedWriter：寫進緩衝區，滿的時候才會寫進檔案，如果未滿（用flush）直接把緩衝區寫進檔案
public class PureTextFile3 {

	public static void main(String[] args) throws IOException {

		String str1 = "費式數列如下：";
		
		char chtt[] = { 'C', 'o', 'n', 't', 'i', 'n', 'u', 'e', '.', '.', '.' };
		int num;
		FileWriter tt = new FileWriter("C:\\_Java\\test1.txt");
		BufferedWriter tt1 = new BufferedWriter(tt, 20);
		tt1.write(str1);
		tt1.newLine();
		for (int i = 1; i < 10; i++) {
			num = fib(i);
			tt1.write(num + " ");
		}
		tt1.newLine();
		tt1.write(chtt);
		 tt1.flush();
		tt.close();
	}

	public static int fib(int x) {
		if ((x == 1) || (x == 0)) {
			return x;
		} else {
			return fib(x - 1) + fib(x - 2);
		}
	}

}
