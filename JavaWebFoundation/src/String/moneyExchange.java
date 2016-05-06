package String;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Scanner;

public class moneyExchange {
	//輸入金額數12302.23，轉換為"壹萬貳仟參佰零貳元貳角參分"
	public static final String EMPTY = "";
	public static final String ZERO = "零";
	public static final String ONE = "壹";
	public static final String TWO = "貳";
	public static final String THREE = "參";
	public static final String FOUR = "肆";
	public static final String FIVE = "伍";
	public static final String SIX = "陸";
	public static final String SEVEN = "柒";
	public static final String EIGHT = "捌";
	public static final String NINE = "玖";
	public static final String TEN = "拾";
	public static final String HUNDRED = "佰";
	public static final String THOUSAND = "仟";
	public static final String TEN_THOUSAND = "萬";
	public static final String HUNDRED_MILLION = "億";
	public static final String YUAN = "元";
	public static final String JIAO = "角";
	public static final String FEN = "分";
	public static final String DOT = ".";
	
	private static moneyExchange formatter = null;
	
	private HashMap numberMap = new HashMap();
	private HashMap highNumberOfMoney = new HashMap();
	
	private NumberFormat nf = NumberFormat.getInstance();
	
	private moneyExchange(){
		nf.setMaximumFractionDigits(4);
		nf.setMinimumFractionDigits(2);
		nf.setGroupingUsed(false);
		numberMap.put("0", ZERO);
		numberMap.put("1", ONE);
		numberMap.put("2", TWO);
		numberMap.put("3", THREE);
		numberMap.put("4", FOUR);
		numberMap.put("5", FIVE);
		numberMap.put("6", SIX);
		numberMap.put("7", SEVEN);
		numberMap.put("8", EIGHT);
		numberMap.put("9", NINE);
		numberMap.put(DOT, DOT);
		highNumberOfMoney.put("1", TEN);
		highNumberOfMoney.put("2", HUNDRED);
		highNumberOfMoney.put("3", THOUSAND);
		highNumberOfMoney.put("4", TEN_THOUSAND);
		highNumberOfMoney.put("5", TEN);
		highNumberOfMoney.put("6", HUNDRED);
		highNumberOfMoney.put("7", THOUSAND);
		highNumberOfMoney.put("8", HUNDRED_MILLION);
		
	}
	public static moneyExchange getInstance(){
		if (formatter == null) {
			formatter = new moneyExchange();
		}
		return formatter;
	}
	public String format(String moneyStr){
		String result = "不能進行金錢轉換";
		if (isConversion(moneyStr)) {
			result = convertIntegerTochinese(moneyStr);
			result = convertPointTochinese(result);
		}
		return result;
	}
	public String format(double moneyDouble){
		return format(nf.format(moneyDouble));
	}
	public String format(int moneyInt){
		return format(nf.format(moneyInt));
	}
	public String format(long moneyLong){
		return format(nf.format(moneyLong));
	}
	public String format(Number moneyNum){
		return format(nf.format(moneyNum));
	}
	
	private String convertIntegerTochinese(String moneyStr) {
		String result;
		StringBuffer c2c = new StringBuffer();
		for (int i = 0 ;i < moneyStr.length(); i++) {
			c2c.append(numberMap.get(moneyStr.substring(i, i+1)));
		}
		int indexOfDot = c2c.indexOf(DOT);
		int moneyPatternCursor = 1;
		for (int i = indexOfDot-1 ; i > 0 ; i--) {
			c2c.insert(i, highNumberOfMoney.get(EMPTY + moneyPatternCursor));
			moneyPatternCursor = moneyPatternCursor == 8?1:moneyPatternCursor+1;
		}
		String fractionPart = c2c.substring(c2c.indexOf("."));
		c2c.delete(c2c.indexOf("."), c2c.length());
		while (c2c.indexOf("零拾") != -1) {
			c2c.replace(c2c.indexOf("零拾"), c2c.indexOf("零拾")+2, ZERO);
		}
		while (c2c.indexOf("零佰") != -1) {
			c2c.replace(c2c.indexOf("零佰"), c2c.indexOf("零佰")+2, ZERO);
		}
		while (c2c.indexOf("零仟") != -1) {
			c2c.replace(c2c.indexOf("零仟"), c2c.indexOf("零仟")+2, ZERO);
		}
		while (c2c.indexOf("零萬") != -1) {
			c2c.replace(c2c.indexOf("零萬"), c2c.indexOf("零萬")+2, TEN_THOUSAND);
		}
		while (c2c.indexOf("零億") != -1) {
			c2c.replace(c2c.indexOf("零億"), c2c.indexOf("零億")+2, HUNDRED_MILLION);
		}
		while (c2c.indexOf("零零") != -1) {
			c2c.replace(c2c.indexOf("零零"), c2c.indexOf("零零")+2, ZERO);
		}
		if (c2c.lastIndexOf(ZERO) == c2c.length()-1) {
			c2c.delete(c2c.length()-1, c2c.length());
		}
		c2c.append(fractionPart);
		result = c2c.toString();
		return result;
	}	

	private String convertPointTochinese(String moneyStr) {
		String result;
		StringBuffer c2c = new StringBuffer(moneyStr);
		int indexofDot = c2c.indexOf(DOT);
		c2c.replace(indexofDot, indexofDot+1, YUAN);
		c2c.insert(c2c.length()-1, JIAO);
		c2c.insert(c2c.length(), FEN);
		if (c2c.indexOf("零角零分") != -1) {
			c2c.replace(c2c.indexOf("零角零分"), c2c.length(), "整");
		} else if (c2c.indexOf("零分") != -1) {
			c2c.replace(c2c.indexOf("零分"), c2c.length(), "整");
		} else {
			if (c2c.indexOf("零角") != -1) {
				c2c.delete(c2c.indexOf("零角"), c2c.indexOf("零角")+2);
			}
		}
		result = c2c.toString();
		return result;
	}

	private boolean isConversion(String moneyStr) {
		int fractionDigits = moneyStr.length() - moneyStr.indexOf(DOT) -1 ;
		boolean flag = true;
		if (fractionDigits > 2) {
			System.out.println("金額"+moneyStr+"的小數位多於兩位。");
			flag = false;
		}
		return flag;
	}
	public static void main(String[] args) {
		//金額轉換 e.g.NT$1011 -> 壹千零壹拾壹元整輸出
		System.out.println("輸入金額數");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("轉換後金額為");
		System.out.println(getInstance().format(new Double(str)));

	}

}
