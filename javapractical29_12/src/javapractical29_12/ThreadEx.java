package javapractical29_12;
import java.util.Scanner;


	
	public class ThreadEx extends Thread{

	    public void run() {
	    	Scanner sc  = new Scanner(System.in);
	    	System.out.println("Enter a number to check if it is even or odd");
	    	int UserInput = sc.nextInt(); 
	    	sc.close(); 

	    	if((UserInput % 2) != 0) { 
	    		System.out.println("The given number is odd");
	    	} else {
	    		System.out.println("Entered number is Even");
	    	}
	    }

		public static void main(String args[]) {
			ThreadEx t = new ThreadEx(); 
			t.start(); 
			System.out.println("main Thread");
		}
	}