package file;

import java.io.FileNotFoundException;

/*��󭫭n���Ʊ��G
1.window��󴫦�A�|�W�[/r/n�]����S�^��Ĥ@�Ӧr�^�A�|�W�[��Ӧr���A�b�o�d�Ҥ��A�Ĥ@�Ʀ�51�Ӧr�A�i�O�ڥ�53
�٬O����L��ĤG�檺�r
2.�bread()��api�y�z���A�L�i�^��Ū�쪺�ƶq�A�]�i�^��-1*/
import java.io.FileReader;
import java.io.IOException;

public class PureTextFile1 {

	public static void main(String[] args) throws IOException {
		char tt[] = new char[53];
		FileReader tt1 = new FileReader("c:\\_Java\\test.txt");
//		System.out.println(tt1);
		int num = tt1.read(tt);
		String str1 = new String(tt,0,num);
		System.out.println("�`�@Ū���F�G"+num);
		System.out.println("�ɮפ��e��"+str1);
		tt1.close();
	}

}
