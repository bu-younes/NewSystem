import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner (System.in );
	        int value1;
	        int value2;

	        
	        
	        
	        System.out.println("Please enter firest input");
	        while (!scanner.hasNextInt()) 
	            {
	            System.out.println("Your firest input does not match, please enter a number between 0 and 100");
	            scanner.next();
	            }
	        value1 = scanner.nextInt();

	        while (value1 > 100 || value1 < 0) 
	            {
	            System.out.println("Your firest input does not match, please enter a number between 0 and 100");
	            value1 = scanner.nextInt();
	   }
	        
	        
	        System.out.println("Please enter second input");
	        while (!scanner.hasNextInt()) 
	            {
	            System.out.println("Your second input does not match, please enter a number between 0 and 100");
	            scanner.next();
	            }
	        value2 = scanner.nextInt();

	        while (value2 > 100 || value2 < 0) 
	            {
	            System.out.println("Your second input does not match, please enter a number between 0 and 100");
	            value2 = scanner.nextInt();
	            

	   }	
	        System.out.println(">> Firest number is :" + value1);

	        System.out.println(">> Second number is  :" + value2);		
		
		
	
		}
	}
		