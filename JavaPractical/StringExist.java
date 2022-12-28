
	package practicaljava;
	import java.util.Scanner;
	public class StringExist {
		
		
		
			public static void main(String[] args) 
			{
				Scanner scanner = new Scanner (System.in);
				
				System.out.println("Enter The Text1- ");
				String a = scanner.nextLine();
				System.out.println("Enter The Text2- ");
				String b = scanner.nextLine();
				
				if(a.equals(b))
				{
					System.out.println("The Text is same");
				}
				else
				{
					System.out.println("The Text is not same");
				}
			}
	}
		

