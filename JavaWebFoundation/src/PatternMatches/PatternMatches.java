package PatternMatches;
public class PatternMatches {

	public static void main(String[] args) {
		boolean flag = false ;
		
		//email:[^@]+@[a-zA-Z0-9\\._\\-]+\\.[a-zA-Z]+
		
		//手機號碼：0912345678 / 0912-345-678一般號碼：(02)23939889 / 02-2393-9889
		//[\\(]?[0-9]{1,2}[\\)\\-]?[0-9]{1,4}[\\-][0-9]{1,4}
//		String t1 = "[\\(\\)0-9\\- ]{6,}";
//		String t2 = "02-2393-9889";
		//中文地址：\u4E00-\u9FFF,\u4E00-\u9FA5

		//註冊生日檢驗 步驟

		String t1 = "[0-9]{1,4}[\\-/]?[0-9]{1,2}[\\-/]?[0-9]{1,4}";
		String t2 = "1987-05-01";
		//一、檢驗
		if(t2.matches(t1)){
			System.out.println("日期正確，下一步是？");
			flag = true ;
		}
		//檢驗成立，出現後續現象（我是用檢驗正確來表現）
		if(flag){
			System.out.println("檢驗正確，可以進入網頁");
		}else{
			System.out.println("not true");
		}

	}

}
