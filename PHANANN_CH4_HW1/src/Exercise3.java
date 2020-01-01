
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      String[] employee = { "Doung", "Chan", "Minea", "Mesa", "Romdoul", "Veha", "Por", "Kanika" };
      int[] salary = { 560, 560, 500, 500, 190, 190, 560,700};
      System.out.println("3.Employee who has lower salary than average: 470.0");
      int count = 1;
      int average = 1;
      int sum = 1;

      for(int j = 1 ;j<salary.length;j++) {
	  sum += salary[j];
	  count++;
      }
      average = sum/count;
      for (int j = 1; j < salary.length; j++) {
	   if (salary[j] < average) {
    	   System.out.println(employee[j] + " : " + salary[j] +"$");
       }
}
 
   System.out.println("...................................");
   
	}

}
