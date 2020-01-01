import java.util.Arrays;
import java.util.Random;
public class mid_term {
	public static void main(String[] args) {
		//Initiate the array of integer with 15 elements		
		int[] numbers = new int[15];
		//Assign random number between -5 to 5
		for (int i = 0; i < numbers.length; i++) {
		    numbers[i] = new Random().nextInt(11)-5;
		 }
		 //Output the array as string in the console
		System.out.println(Arrays.toString(numbers));
				
		//a. find the largest number in this array
		int a = numbers[0];
	    for(int i = 0; i < numbers.length; i++) {
		   if(a < numbers[i]) {
			   a = numbers[i];
		   }
	   }
	   System.out.println(a);
	 //b. find the smallest number in this array
	   int b = numbers[0];
	   for(int i = 0; i < numbers.length; i++ ) {
		   if(b > numbers[i]) {
			  b = numbers[i]; 
		   }
	   }
	   System.out.println(b);
	 //c. Display the result of this boolean assertion : "all numbers greater than zero"
	   boolean isNegative = false;
	   for(int i = 0; i < numbers.length; i++) {
		   if(numbers[i]<0) {
			   isNegative = true;
			   break;
		   }
	   }
	
	   if(isNegative == false) {
		   System.out.println("All numbers are greater than zero");
	   }
		//d. Display the result of this boolean assertion : "at least one numbers greater than zero"
	   for(int i = 0; i < numbers.length; i++) {
		   if(numbers[i] > 0) {
			   System.out.println("at least one number greater than zero");
			   break;
		   }
	   }
	   
	   //e Display how many numbers greater than zero or even appears in this arrays
	   int count = 0;
	   for(int i = 0; i < numbers.length; i++) {
		   if(numbers[i] > 0) {
			   count++;
		   }
	   }
	   System.out.println(count + " are positive numbers");
	}
}