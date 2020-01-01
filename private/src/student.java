
public class student {
	public String name;
	private int age;
	public char gender;
	private String batch;
	
	//create default constructor 
	student(){
		
	}
	
	//create two constructor with different constructor
	student(String name, char gender){
		this.name = name;
		this.gender = gender;
	}
	
	//setter to age
    void setAge(int age){
		this.age = age;
	}
    
	//getter to age
   int getAge(){
		return age;
	}
   
   //setter to batch
   void setBatch(String batch) {
	   this.batch = batch;
   }
   
   //getter to batch
   String getBatch() {
	   return batch;
   }
   
   //constructor 
   student(int age, String batch){
	   this.age = age;
	   this.batch = batch;
   }
   
}
