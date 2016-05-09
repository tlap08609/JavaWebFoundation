package pattern;

public class ValidatorTest {

	public static void main(String[] args) {
		System.out.print("email:"+Validator.email("123@l.tw")+"\n");
		System.out.print("idCard:"+Validator.idCard("A225986566")+"\n");
		System.out.print("idCard合不合法??"+(pattern.RegIdCard.checkPID("A225986566") ? "合法" : "不合法")+"\n");
		System.out.print("tele:"+Validator.tele("0227014872")+"\n");
		System.out.print("mobile:"+Validator.mobile("0918883028")+"\n");
//		System.out.print("time:"+Validator.time("0853")+"\n");
//		System.out.print("date:"+Validator.date("0/10-")+"\n");
	}
}
