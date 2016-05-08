package String;

public class compare {

	public static void main(String[] args) {
		String tt = new String("hi");
		String tt1 = new String("hi");
		String aa = "hi";
		String aa1 = "hi";
		
		System.out.println(tt.hashCode());
		System.out.println(tt1.hashCode());
		System.out.println(tt .equals(tt1));
		System.out.println(aa == aa1);
		myO mm = new myO();
		mm.setI(100);
		System.out.println(mm.hashCode());
		myO mm1 = new myO();
		mm1.setI(100);
		System.out.println(mm1.hashCode());
		System.out.println(mm.equals(mm1));
	}

}
