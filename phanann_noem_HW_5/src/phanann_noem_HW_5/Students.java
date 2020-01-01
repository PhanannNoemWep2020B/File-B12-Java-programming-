package phanann_noem_HW_5;

public class Students {
	//1. We would like to model the book as the class Book.
	private String firstName;
	public String name;
	public String batch;
	
	//Create constructor 
  Students(){
	  
  }
  //borrow
  
  //
 Students(String batch, String name){
	 
 }
  
  //setter to firstName
  void setFirstName(String firstName) {
	  this.firstName = firstName;
  }
  
  //getter to firstName
  String getFirstName() {
	  return firstName;
  }
  
  //Constructor for result
  Students(String firstName){
	  this.firstName = firstName;
  }
  
}
