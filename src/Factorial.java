import java.util.Scanner;
class Factorial
{
	public static void main(String args[]){
		int res = 1;	
		int num = 0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number: ");
		num = scan.nextInt();
		for(int i =1; i<=num ; i++){
			res = res * i;
		}
		System.out.println(num+"! is: "+ res);
	}
}