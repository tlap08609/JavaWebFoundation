package file;

import java.io.FileNotFoundException;

/*兩件重要的事情：
1.window對於換行，會增加/r/n（換行又回到第一個字），會增加兩個字元，在這範例中，第一排有51個字，可是我用53
還是不能印到第二行的字
2.在read()的api描述中，他可回傳讀到的數量，也可回傳-1*/
import java.io.FileReader;
import java.io.IOException;

public class PureTextFile1 {

	public static void main(String[] args) throws IOException {
		char tt[] = new char[53];
		FileReader tt1 = new FileReader("c:\\_Java\\test.txt");
//		System.out.println(tt1);
		int num = tt1.read(tt);
		String str1 = new String(tt,0,num);
		System.out.println("總共讀取了："+num);
		System.out.println("檔案內容有"+str1);
		tt1.close();
	}

}
