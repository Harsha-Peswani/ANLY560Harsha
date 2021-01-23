import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		ExceptionHandling eh = new ExceptionHandling();
		eh.nfe();
	}
	
	public void nfe (){
		System.out.println("Enter two number: ");
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		catch (NumberFormatException ex){
			System.out.println(ex.getMessage());
		}
		finally{
			sc.close();
		}
		
	}

}
