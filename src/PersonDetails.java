import java.util.Scanner;
class PersonDetails
{
	public static void main(String args[]){
		String Fname, Lname, number, address;
		int age = 0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Person Details \nFirst Name: ");
		Fname = scan.nextLine();
		System.out.println("Last Name: ");
		Lname = scan.nextLine();
		System.out.println("Phone Number: ");
		number = scan.nextLine();
		System.out.println("Address: ");
		address = scan.nextLine();
		System.out.println("Age: ");
		age = scan.nextInt();
		
		System.out.println("\nThe following are the person details:\nFirst Name: " + Fname + "\nLast Name: " +
							Lname + "\nPhone Number: " + number + "\nAddress: " + address + "\nAge: " + age);		
	}
}