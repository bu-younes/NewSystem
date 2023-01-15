import java.util.Arrays;
import java.util.Scanner;

public class PairsNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		boolean cond = true;
		
			int[] arr = {5, 3 , 2 , 6 , 15 , 15 ,10,1,4};
			
			
			while ( cond) {
			System.out.println("Enter the value of the sum to be searched for: ");
			        int key = scanner.nextInt();
			Arrays.sort(arr);
			        int counter = arr.length;
			        for(int i = 0 ; i<arr.length; i++){
			            if(arr[i] >= key){
			                counter = i;
			                break;
			}
			}
			        for(int i=0; i<counter ;i++){
			            for(int j=i+1; j<counter ;j++){
			                if(arr[i]+arr[j] == key){
			System.out.println("Pairs are: " + arr[i] +" "+ arr[j]);
			}
			              
			}
			        }
			        
		System.out.println("press 1 to Chk another NO.");
		int x = scanner.nextInt();
		if(x != 1)
		{
			cond= false;
		}
		}
		
		
	}

}
