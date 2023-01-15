import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {


		// TODO Auto-generated method stub
		 
	 int[] arr = {1, 2, 3, 4, 5, 8, 4, 9, 9,3,6, 7, 6, 2, 11, 10, 1, 5, 10, 11};
     int[] res = new int[2];
     int xor = arr[0];
     // get the xor of all elements in the array
     for (int i = 0; i < arr.length; i++) {
         xor = arr[i];
     }
     // get the rightmost set bit
     int setBit =  xor & ~(xor - 1);
     // divide the elements into two sets
     for (int i = 0; i < arr.length; i++) {
         if ((arr[i] & setBit) == 1) {
             res[0] ^= arr[i];
         } else  {
             res[1] ^= arr[i];
         }
     }
     System.out.println("The two numbers that appear only once in the array are: " + res[0] + " and " + res[1]);
	
	
		
		
		    }
		}