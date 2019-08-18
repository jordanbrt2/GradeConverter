/* 
Students at university struggle to convert alphabetical grades into numerical grades 

This is a conversion program using the Grade Conversion table at from university 

Note: Lower bounds from the Grade Conversion table have been used 

A = 73
B = 63
C = 53
D = 43
E = 33
F = 0

Would like to build on this further

Contact me if interested. 
 

 */

import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		// Tell user to enter a letter grade A, B, C, D, E or F

				System.out.print("Enter a letter grade: ");

				String s = scan.nextLine();

				char ch = s.charAt(0);
				
				// Converts lowercase to Uppercase 

				ch = Character.toUpperCase(ch);

				

				if (ch >= 'A' && ch <= 'F')

				{

					System.out.print("The numeric value for grade " + ch + " is ");

					switch(ch)

					{

						case 'A': System.out.println(73); break;

						case 'B': System.out.println(63); break;

						case 'C': System.out.println(53); break;

						case 'D': System.out.println(43); break;
						
						case 'E': System.out.println(33); break;

						case 'F': System.out.println(0); 

					}

				}
				
				// In case you enter a invalid grade 

				else

					System.out.println(ch + " is an invalid grade");
		
		
		


}
}
