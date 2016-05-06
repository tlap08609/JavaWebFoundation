package generics_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class hashmap {
//附件Data.csv檔案為一用逗號分隔檔案，檔案編碼為big5，第一行為資料標頭，共有30,000筆資料，
//這30,000筆資料中以保單號為區別會有重覆資料，請寫一隻程式，將重複的資料過濾(也就是以保單號為key
//，過濾後保單號不重複)，並以下列格式輸出:
//公司代號1 公司代號2 人員代號2 保單號 人員代號1
	public static void main(String args[]) throws IOException {
		Long p,n = null;
		File in = new File("Data.csv");
		Map<String, List<String>> objHM1 = new LinkedHashMap<>();
		BufferedReader br = null;
		String line = "";
		p = System.currentTimeMillis();
		try {
			br = new BufferedReader(new InputStreamReader(
                    new FileInputStream(in), "BIG5"));
			while ((line = br.readLine()) != null) {
				List<String> list = new ArrayList<String>();
				String[] array = line.split(",");
				list.add(array[1]);
				list.add(array[2]);
				list.add(array[3]);
				list.add(array[4]);
				objHM1.put(array[0], list);
			}
			for (Map.Entry<String, List<String>> entry : objHM1.entrySet()) {
				String key = entry.getKey();
				List<String> values = entry.getValue();
				System.out.println(values.get(1) + "\t" + values.get(2) + "\t"
						+ values.get(3) + "\t" + key + "\t"+ "\t"
						+ values.get(0));
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
