import java.util.Scanner;
class NumberReverse
{
	public static void main(String args[]){
		int num = 0;
		StringBuilder res = new StringBuilder();
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number: ");
		num = scan.nextInt();
		int length = String.valueOf(num).length();
		while(length != 0){
			int b = num%10;
			String inttostr = Integer.toString(b);
			res.append(inttostr);
			num = num/10;
			length --;
		}
		System.out.println(res);
		
	}
}