package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PureTextFile2 {

	public static void main(String[] args) {
		// ��loopŪ�X���ɮ�
		try (FileReader tt = new FileReader("c:\\_Java\\test.txt")) {
			char tt1[] = new char[51];
			int count;
			String tt2;
			while ((count = tt.read(tt1)) != -1) {
				tt2 = new String(tt1, 0, count);
				System.out.println("�`�@Ū��" + count + "�Ӧr");
				System.out.println(tt2);
			}
			tt.close();
		}catch(FileNotFoundException e){
			System.out.println("�ҥ~�o��1");
		}catch(IOException e ){
			System.out.println("�ҥ~�o��2");
		}

	}

}
