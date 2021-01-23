

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		System.out.println("Enter a number or a word to check for pallindrome: ");
		Scanner sc = new Scanner(System.in);
		String pal = sc.nextLine();
		if(checkpallindrome(pal))
			System.out.println(pal + " Is a Pallindrome");
		else
			{		
			 System.out.println("The pallindrome is : " + makepallindrome(pal) ); 
			}
 	}
	public static boolean checkpallindrome(String pal){
		for(int i =0; i < pal.length()/2; i++){
			if(pal.charAt(i)!= pal.charAt(pal.length()-1-i))
				return false;
		}
				return true;		
	}
	public static String makepallindrome(String pal){
		String add = "";
		int i = pal.length() -1;
		while(!checkpallindrome(add+pal)){
			add = add + pal.charAt(i);
			i--;
		}
		return(add+pal);
		
	}

}
