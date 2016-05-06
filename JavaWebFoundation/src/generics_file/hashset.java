package generics_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class hashset {
//附件Data.csv檔案為一用逗號分隔檔案，檔案編碼為big5，第一行為資料標頭，共有30,000筆資料，
//這30,000筆資料中以保單號為區別會有重覆資料，請寫一隻程式，將重複的資料過濾(也就是以保單號為key
//，過濾後保單號不重複)，並以下列格式輸出:
//公司代號1 公司代號2 人員代號2 保單號 人員代號1
	public static void main(String args[]) throws IOException {
		Long p,n = null;
		File in = new File("Data.csv");
		BufferedReader br = null;
		HashSet<String> hs = new HashSet<>();
		String line = "";
		p = System.currentTimeMillis();
		try {
			br = new BufferedReader(new InputStreamReader(
                    new FileInputStream(in), "BIG5"));
			while ((line = br.readLine()) != null) {
				String[] array = line.split(",");
				if(hs.add(array[0])){
					System.out.print(array[2]+" "+array[3]+" "+array[4]+" "+array[0]+" "+array[1]);
					System.out.println();
				}
			}
			n = System.currentTimeMillis(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
					System.out.println("花費時間:"+(n-p));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
