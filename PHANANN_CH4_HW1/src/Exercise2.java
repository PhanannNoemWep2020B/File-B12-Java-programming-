
public class Exercise2 {
	public static void main(String[] args) {
		String[] employee = { "Doung", "Chan", "Minea", "Mesa", "Romdoul", "Veha", "Por", "Kanika" };
		int[] salary = { 560, 560, 500, 500, 190, 190, 560,700};
		System.out.println("2. Employee who has lowest salary:");
		  int count = 0;
		  int average = 0;
		  int sum = 0;
		   for(int j = 0 ;j<salary.length;j++) {
			  sum += salary[j];
			  count++;
		   }
		   average = sum/count;
		   for (int j = 0; j < salary.length; j++) {
			   if (salary[j] < average) {
		    	   System.out.println(employee[j] + " has the lowest salary of " + "$" + salary[j]);
		       }
		}
		 
		   System.out.println("...................................");
		   
	}
}
