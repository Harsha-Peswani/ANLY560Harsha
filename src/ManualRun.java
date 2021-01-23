public class ManualRun { 
	public static void main(String[] args) { 		
		System.out.println("Say, Hi!!!");
		int count = args.length;
		System.out.println("Count is: " + count);
		for(int i = 0; i<count ; i++){
			System.out.println("Values is: "+ args[i]);
		}
		
	}
}
