
public class Exercise1 {
	public static void main(String[] args) {
		 
		//Exercise 4-------------------------------------------------------------------------------
		String[] employ4 = { "Doung", "Chan", "Minea", "Mesa", "Romdoul", "Veha", "Por", "Kanika" };
        int[] salary4 = { 560, 560, 500, 500, 190, 190, 560, 700 };
        int[] newSuper = new int[salary4.length - 1];
        String[] employsalary = new String[employ4.length - 1];
        int max = salary4[0];
        int min = salary4[0];
        int average = 0;
        int sum = 0;
        
        for(int i = 0;i<salary4.length;i++) {
        	if(max<salary4[i]) {
        		max = salary4[i];
        	}
        	if(min>salary4[i]) {
        		min = salary4[i];
        	}
        }
        System.out.println("1.Employee who has highest salary:");
       for(int i = 0 ;i<employ4.length;i++) {
    	   if(max == salary4[i]) {
    		   System.out.println(employ4[i]+" has the highest salary of " +"$"+max);
    	   }
       }
       System.out.println("...................................");
       
		 }
  }

