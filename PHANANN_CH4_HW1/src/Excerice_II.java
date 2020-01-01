
public class Excerice_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num1 = new int[15];
		int count = 0;
		String text = " ";
		for(int i = 0 ;i<num1.length;i++) {
			int random = (int)(Math.random()*11+0);
			num1[i] = random;
			System.out.print(num1[i]+" ");
			if(num1[i] == 5) {
				count++;
				text = text+i+" ";
			}
		}
		System.out.println();
		if(count != 0) {
			System.out.println("There are "+count+" number 5 found in index as bellow: ");
			System.out.println("Index: "+text);
		}else {
			System.out.println("Number 5 not found!");
		}
	}

}
