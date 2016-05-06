package function;

public class Recursive {
	//TODO
	//費波那西數列(Fibonacci Sequence)的定義如下：   
    //f(x) = 0	                   if x == 0 
    //f(x) = 1	                   if x == 1 
    //f(x) = f(x-1) + f(x-2)	       if x > 1     
	//請寫程式顯示費波那西數列前31個數字。  
	static int fib(int n) {
		if (n == 1 || n == 2)
			return n;
		else
			return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		System.out.println("�O��f(6)�Ĥ�����" + fib(4));
		System.out.println("�O��f(10)�ĤQ����" + fib(10));
	}
}
