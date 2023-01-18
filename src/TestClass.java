import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TestClass {
	public static void main(String[] args) {


		// TODO Auto-generated method stub
		
		
		
		/*Q1
		Problem: Given an array of integers, write a function that finds the maximum product that can be formed by multiplying any four integers.
		Input: [1, 2, 3, 4, 5, 6]
		Output: 120 (6 * 5 * 4 * 3)*/
		
		
		
		 int[] number = {1, 2, 3, 4, 5,6};
		 int total =0;
		 Arrays.sort(number);
		 
		total = number[2] *number[3] *number[4]* number[5];
		System.out.println("the total of last four intejer: " + total);
		 
		
		 System.out.println("");
		   System.out.println("*<<><><><><><><><><><><><><><><>>*");
		   System.out.println("*<<><><><><><><><><><><><><><><>>*");
		   System.out.println("");
		/*Q2
		Problem: Given an array of n integers, find the contiguous sub array with the second largest sum.
		Input: [1, -3, 2, 5, -1, 6, -2]
		Output: [2, 5, -1, 6] (sum = 10)*/
		
		
		/*Q3
		Problem: Given an array of integers, write a function that finds the third highest number in the array.
		Input: [1, 5, 9, 3, 7, 8, 2, 4, 6]
		Output: 7*/
		
		 int[] number1 = {8, 2, 7, 4,9,6};
		 for (int i= 0 ; i < number1.length; i++)
		 {
         System.out.println(number1[i]);
		 }
		 int m = number1.length;
		 Arrays.sort(number1);
		 System.out.println("the third highest number in the array is: " + number1[m-3]);
		 
		 System.out.println("");
		   System.out.println("*<<><><><><><><><><><><><><><><>>*");
		   System.out.println("*<<><><><><><><><><><><><><><><>>*");
		   System.out.println(""); 
         /*Q4
		Problem: Given an array of integers and a number k, write a function to determine if there are two 
		distinct elements in the array that add up to k and both elements should be even number.
		Input: [1, 2, 4, 6, 8, 10], k = 10
		Output: true (2 + 8 = 10)*/
		 int[] number2 = {6, 82, 2, 4,92,6};
		 int k =10;
		
		 for (int i = 0; i < number2.length; i++) {
		       for (int j = i + 1; j < number2.length; j++) {
		           if (number2[i] + number2[j] == k) {
		               System.out.println("The numbers are: " + number2[i] + " and " + number2[j]);
		           }}}
		 
		 
		 
		   
		/*Q5
		Problem: Given an array of integers, write a function to find the longest decreasing subarray.
		Input: [1, 2, 3, 4, 5, 4, 3, 2, 1]
		Output: [5, 4, 3, 2, 1]*/
		
		/*Q6
		Problem: Given an array of integers, write a function to find the number of times
		 a given integer value appears in the array where the value is greater than 10.
		Input: [1, 2, 15, 20, 15, 30, 20, 15, 15], val = 15
		Output: 4*/
		
		/*Q7
		Problem: Given an array of integers, write a function to find 
		the missing number in the array where the missing number should be a multiple of 5.
		Input: [5, 10, 20, 25, 30],
		Output: 15*/
		
		
		/*Q8
		Implement a stack data structure in Java using an array, with push and pop operations.*/
		  Stack<String> languages8 = new Stack();

		    // add elements
		    languages8.push("Python");
		    languages8.push("Java");
		    languages8.push("C");
		    System.out.println("the languages is: " + languages8);
		    
		    System.out.println(languages8.pop());
		    
		
		/*Q9
		Create a function in Java that checks whether a given string is a palindrome using a stack.*/
		
		
		/*Q10
		Design a stack in Java that supports push, pop, and get the middle element operations in O(1) time.*/
		
		
		/*Q11
		Given a list of integers, implement a stack in Java that can return the second largest element in O(1) time.*/
		
		
		/*Q12
        Create a function in Java that evaluates a postfix expression using a stack.*/
		
		

		
		    }
		}