
public class result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student stu = new student(20 , "WEB2020B");
		stu.name = "phanann";
		stu.gender = 'M';
		System.out.println("My name is " + stu.name + ", age is " + stu.getAge());
		System.out.println("My gender is " + stu.gender + " and i study at class " + stu.getBatch() + ". I love you so much my class.");
	}

}
