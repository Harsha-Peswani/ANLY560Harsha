

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;

public class Duplicate {

	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		System.out.println("Enter the number of elements you wish to input: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		for(int i= 0 ; i<=n; i++){
			animals.add(sc.nextLine());
		}		
		checkduplicates(animals);
	}
	
	public static void checkduplicates(ArrayList<String> animals){
	       System.out.println("Duplicate elements are: ");
	        ArrayList<String> tempNames = new ArrayList<String>();
	        for(String name : animals) {
	             if(!tempNames.contains(name)) {
	                 tempNames.add(name);
	             }
	         }
	         for(String name : tempNames) {
	             System.out.println(name+" found "+ Collections.frequency(animals, name) +" times");   
	         }
	}
}
