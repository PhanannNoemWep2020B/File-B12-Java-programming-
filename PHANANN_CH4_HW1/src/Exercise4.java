
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String[] employee = { "Doung", "Chan", "Minea", "Mesa", "Romdoul", "Veha", "Por", "Kanika" };
	      int[] salary = { 560, 560, 500, 500, 190, 190, 560,700};
	     
	      float number = 470;
	      int min = salary[0];
	      for(int j = 0 ;j<salary.length;j++) {
	    	  if(salary[j] <= min) {
	    		  min = salary[j];
	    	  }
	      }
	      System.out.println("4.Employee who has higher salary than average: " + number);
	      for (int j = 0; j < salary.length; j++) {
		   if (salary[j] > min) {
	    	   System.out.println(employee[j] + " : $ " + salary[j]);
	       }
	}
	 
	   System.out.println("...................................");

	}

}
