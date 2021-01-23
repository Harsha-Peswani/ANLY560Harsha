import java.util.Scanner;
class BasicCalculator
{
	public static void main(String args[]){
		int num = 0;
		int a = 0;
		int b = 0;
		int result = 0;		
		Scanner scan = new Scanner (System.in);
		System.out.println("Basic Calculator:\nEnter two numbers");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println("For Addition Enter 1 \nFor Subtraction Enter 2 \n" +
							"For Multiplication Enter 3 \nFor Division Enter 4");
		num = scan.nextInt();
		switch (num){
		case 1 : result = (a + b);
				 break;
		case 2 : result = (a - b);
		 		 break;
		case 3 : result = (a * b);
		 		 break;
		case 4 : result = (a / b);
		 		 break;
		default: System.out.println("Invalid Input");		
		}
		System.out.println("Resut is: " + result);
	}
}