import java.util.Scanner;
class Grade
{
	public static void main(String args[]){
		int marks = 0;	
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the score received by the student out of 10: ");
		marks = scan.nextInt();
		if (marks <= 10){
		if (marks == 10){
			System.out.println("Perfect Score");
		}
		else if (marks == 9){
			System.out.println("Excellent");
		}
		else if (marks == 8){
			System.out.println("Nice Job");
		}
		else if (marks == 7){
			System.out.println("Average");
		}
		else if (marks < 7){
			System.out.println("Below Average");
		}
		}
		else System.out.println("Invalid Score");
	}
}