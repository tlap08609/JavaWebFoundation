package pattern;

public class stringSplit {

	public static void main(String[] args) {
		//postive or negative lookahead lookbehind web
		//http://fanli7.net/a/bianchengyuyan/regular_expression/2014/0727/523173.html
		//case1
		String nn = "A, B,,,E,F";
		String nnArray[] = nn.split("[,\\s]+");
		for (String na : nnArray) {
			System.out.print(na+" ");
		}
		System.out.println();
		//case2
		String ans = "tims alices tree Toms eva".replaceAll("[s]$", "'s");
		System.out.print(ans);

	}

}
