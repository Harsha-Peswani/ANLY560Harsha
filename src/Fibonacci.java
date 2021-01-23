import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Enter a value at which Fibonacci number is required:");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println(fibo(n));
	}
	
	public static int fibo(int n){
		if (n<=1)
			return n;
		else
			return fibo(n-1) + fibo(n-2);		
	}

}
