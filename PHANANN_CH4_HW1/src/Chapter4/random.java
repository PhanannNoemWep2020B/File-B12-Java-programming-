package Chapter4;

public class random {

	public static void main(String[] args) {
		// create array of number with 15 element 
		    int[] number = new int[15];
		    int count = 0;
		    String index = "";
		//set random number between 0 to 10 to each elements of array
		      //get random value
		    	System.out.println((int)(Math.random()*11));
		      //set this random value into each array element 
		    	for(int i = 0; i< number.length; i++) {
		    		number[i] = (int)(Math.random()*11);
		    		System.out.println(number[i]+"");
		      //count element which equal to 5
		    		if(number[i] == 5) {
		    			count++;
		    			index +=index + i;
		    		}
		    	}
		      //if no number 5 
		    	if(count == 0) {
		    		System.out.println("Not fonund");
		    	}
            }
      }
