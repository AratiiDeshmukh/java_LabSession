	/*write a program take 2 strings as input from user and find if both the
	  strings are same or not*/
	package practicaljava;
	import java.util.Scanner;

	class Identicalstring {
		
		public static void main(String[] args)
			{
			    String str1,str2;
				Scanner scanner = new Scanner(System.in);
				

				
			
				System.out.println("Enter the first string: ");
								
				str1 = scanner.nextLine();

				
				
				System.out.println("Enter the second string :");
				 str2 = scanner.nextLine();
							

				
				System.out.println("\nAre both strings same: ");

				if (str1.equals(str2) == true) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			}
	}

