import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter a String to be reversed: ");
		Scanner sc = new Scanner(System.in);
		String rev = sc.nextLine();
		reversal(rev);
	}
	public static void reversal(String rev){
		String a = "";
		for(int i = rev.length()-1; i>=0 ; i--){
			a = a+rev.charAt(i);
		}
		System.out.println("Reversed String is:" + a);
	}

}
