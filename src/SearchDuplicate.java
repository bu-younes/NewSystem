import java.util.Arrays;
import java.util.Scanner;

public class SearchDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int[] array = {1, 2, 3, 8, 5, 8, 7, 8, 9, 1};
		int target;
		int count = 0;

		System.out.println("Please select a number from the following array: " + Arrays.toString(array));
		while (!scanner.hasNextInt()) {
		  System.out.println("Your input is not a valid integer. Please select a number from the array: " + Arrays.toString(array));
		  scanner.next();
		}
		target = scanner.nextInt();

		for (int i = 0; i < array.length; i++) {
		  if (array[i] == target) {
		    count++;
		  }  
		  
		}
		
		
		
		
		
		

		System.out.println("The number " + target + " appears " + count + " times in the array.");
		
		
		
		
	}

}
