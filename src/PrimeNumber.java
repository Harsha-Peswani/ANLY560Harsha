import java.util.Scanner;
class PrimeNumber
{
	public static void main(String args[]){
		int num = 0;		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number between 1 to 100: ");
		num = scan.nextInt();
		if (num < 100){
		for ( int i = 1 ; i < num ; i++){
			boolean isPrime = true;
			for(int j = 2 ; j<i; j ++) {
				if (i% j == 0){
					isPrime = false;
					break;					
				}		
			}
			if (isPrime)
				System.out.print(i + " ");
		}
		}
		else
			System.out.println("Invalid Number");
	}
}