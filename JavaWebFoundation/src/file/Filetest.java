package file;

import java.io.File;

public class Filetest {

	public static void main(String[] args) {
		File tim = new File("c:\\test\\test.txt");
		System.out.println("�ɮ׬O�_�s�b�H"+tim.exists());
		System.out.println("�ɮצW�١G"+tim.getName());
		System.out.println(tim.length()+"byte");

	}

}
