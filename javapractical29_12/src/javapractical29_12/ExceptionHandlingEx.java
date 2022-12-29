package javapractical29_12;
import java.util.Scanner;

public class ExceptionHandlingEx {

	
	
	

		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in); 
	        System.out.println("Enter the value of first number");
	        int i=sc.nextInt();
	        System.out.println("Enter the value of first number");
	        int j=sc.nextInt();
	        sc.close();
	        System.out.println("Values of variable before calculation i:"+i+" j:"+j);
	        try { 
	        	System.out.println(i/j); 
	        }
	        catch (Exception e) { 
	        	System.out.println(e);
	        }
	        System.out.println("calculation done");
		


	}

}
