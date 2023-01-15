import java.util.HashMap;

public class Appear {

		// TODO Auto-generated method stub

		
	
	        
		    public static void findSingleNumbers(int[] arr) {
		        HashMap<Integer, Integer> map = new HashMap<>();

		        // Count the frequency of each number in the array
		        for (int num : arr) {
		            if (!map.containsKey(num)) {
		                map.put(num, 1);
		            } else {
		                map.put(num, map.get(num) + 1);
		            }
		        }

		        // Find the numbers that appear only once
		        for (int num : map.keySet()) {
		            if (map.get(num) == 1) {
		                System.out.println(num);
		            }
		        }
		    }

		    public static void main(String[] args) {
		        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 80, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 12};
		        findSingleNumbers(arr); 
}}
