package conFlow;

public class MultiplicationTable {

	public static void main(String[] args) {
		//單層迴圈
		System.out.println("------------------");
		System.out.println("單層迴圈");
		int a = 1;
		int b = 1;
		while (a != 10 && b != 10) {
			if (a != 9) {
				System.out.printf("%d*%d=%d\t",b,a,a*b);
				a++;
			} else {
				System.out.printf("%d*%d=%d\n",b,a,a*b);
				a = 1;
				b++;
			}
		}
		//用for,while 做出一個99乘法表
		System.out.println("--------------------------");
		System.out.println("for99乘法表");
 		for (int f = 1 ; f <= 9 ; f++) {
 	 		for (int g = 1 ; g <= 9 ; g++) {
 	 			System.out.print(f+"*"+g+"="+(f*g)+" ");
 	 		}
 	 		System.out.println();
 		}
 		System.out.println("--------------------------");
		System.out.println("while99乘法表");
		int f = 1;
		int g = 1;
		while (f <= 9) {
			while (g <= 9){
				System.out.print(f+"*"+g+"="+(f*g)+" ");
				g++;
			}
			f++;
			g=1;
			System.out.println();
		}
		//做出一個偶數99乘法表
		//0*0=0 2*0=0 4*0=0 6*0=0 8*0=0
		//0*2=0 2*2=4 4*2=8 6*2=12 8*2=16
		System.out.println("--------------------------");
		System.out.println("偶數乘法表");
		for (int i = 0 ; i <= 8 ; i=i+2) {
			for (int l = 0 ; l <= 8 ; l=l+2) {
				//System.out.printf("\%s", );
				System.out.print(l+"*"+i+"="+(l*i)+" ");
			}
			System.out.println();
		}

	}

}
