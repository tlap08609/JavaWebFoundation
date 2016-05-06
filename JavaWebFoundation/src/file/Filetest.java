package file;

import java.io.File;

public class Filetest {

	public static void main(String[] args) {
		File tim = new File("c:\\test\\test.txt");
		System.out.println("檔案是否存在？"+tim.exists());
		System.out.println("檔案名稱："+tim.getName());
		System.out.println(tim.length()+"byte");

	}

}
