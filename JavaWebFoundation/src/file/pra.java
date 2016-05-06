package file;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class pra {

	public static void main(String args[]) throws IOException {
		FileOutputStream fos = new FileOutputStream("Target.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeFloat(17.625f);
	}
}
