package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BmpFile {

	public static void main(String[] args) {
		//http://crazycat1130.pixnet.net/blog/post/1345538-%E9%BB%9E%E9%99%A3%E5%9C%96%EF%BC%88bitmap%EF%BC%89%E6%AA%94%E6%A1%88%E6%A0%BC%E5%BC%8F
		//利用表頭資訊的2-5的位元組，查出該檔案大小
		File file = new File("PG30009.bmp");
		byte data[] = new byte[54];
		int fileSize,value1,value2,value3,value4,low,high,num;
		FileInputStream fs = null;
		try {
			fs = new FileInputStream(file);
			fileSize = fs.available();
			num = fs.read(data,0,54);
			int title[] = new int[6];
			for (int i=2;i<5;i++) {
				if (data[i]<0) {
					title[i] = (int)data[i]+256;
				} else {
					title[i] = (int)data[i];
				}
			}
			low = title[2] % 16;
			high = (title[2]-low) / 16;
			value1 = high*16 + low;
			
			low = title[3] % 16;
			high = (title[3]-low) / 16;
			value2 = high*16*16*16 + low*16*16;
			
			low = title[4] % 16;
			high = (title[4]-low) / 16;
			value3 = high*16*16*16*16*16 + low*16*16*16*16;
			
			low = title[5] % 16;
			high = (title[5]-low) / 16;
			value4 = high*16*16*16*16*16*16 + low*16*16*16*16*16; 
			
			fileSize = value1+value2+value3+value4;
			fs.close();
			System.out.println("該檔案大小為:"+fileSize);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
