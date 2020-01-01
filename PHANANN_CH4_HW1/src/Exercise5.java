
public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 System.out.println("Employee who has same salary: ");
	            String[] employee5 = { "Doung", "Chan", "Minea", "Mesa", "Romdoul", "Veha", "Por", "Kanika" };
	            int[] salary5 = { 560, 560, 500, 500, 190, 190, 560, 700 };
	            int[] number = new int[salary5.length - 1];
	            String[] allength = new String[employee5.length - 1];
	            for (int i = 0; i < salary5.length; i++) {
	                for (int j = 1; j < salary5.length; j++) {
	                    if (salary5[i] == salary5[j] && i != j) {
	                        number[i] = salary5[i];
	                        allength[i] = employee5[i];
	                        break;
	                    }
	                }
	            }
	            sentence(number, allength);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }

	    static public void sentence(int[] salary, String[] name) {
	        int text;
	        String khmer;
	        for (int i = 0; i <= salary.length - 1; i++) {
	            for (int j = 0; j <= salary.length - 2; j++) {
	                if (salary[j] < salary[j + 1]) {
	                    text = salary[j];
	                    salary[j] = salary[j + 1];
	                    salary[j + 1] = text;
	                    khmer = name[j];
	                    name[j] = name[j + 1];
	                    name[j + 1] = khmer;
	                }
	            }
	        }
	     
	        for (int i = 0; i <= salary.length - 1; i++) {
	            System.out.println(name[i] + " : " + salary[i] + "$");
	        }
	}

}
