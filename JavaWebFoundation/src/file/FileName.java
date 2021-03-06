package file;

public class FileName {

	public static void main(String[] args) {
		//TODO 有時候需要將檔案名稱(包括主檔名與副檔名)存入表格的某個欄位內，
		//欄位的長度有限(這裡不考慮用CLOB欄位)，而檔名的長度則無限，因此對於過長的檔名須要縮短，縮短的原則如下：  
	    //假設某表格用來存放檔名的欄位長度最多20個字元，副檔名必須全部保留，主檔名則最多留下(20-1-副檔名的長度)字元，請寫一個程式，它能由鍵盤讀入一個檔案名稱，如果檔名的長度小於等於20，則檔名不作變動，直接於螢幕上顯示該檔名，否則顯示縮短後的檔名。例如輸入的檔名與輸出的檔名如下：   
	    //abc.gif  ===>  abc.gif
	    //a2345678901234567890.gif ===> a234567890123456.gif
	    //a2345678901234567890yh000.jpeg  ===> a23456789012345.jpeg

	}

}
