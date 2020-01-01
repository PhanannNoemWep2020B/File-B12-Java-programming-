package phanann_noem_HW_5;

public class Books {
	//1. We would like to model the book as the class Book.
	private String title;
	private String author;
	private int publishYear;
	public boolean isBorrowed;
	//Create constructor
	Books(){
		
	}
	
	//Create constructor 3 arguments
	Books(String title, String author, int publishYear){
		this.title = title;
		this.author = author;
		this.publishYear = publishYear;
	}
	
	//setter to title
	void setTitle(String title) {
		this.title = title;
	}
	
	//getter to title 
	String getTitle() {
		return title;
	}
	
	//setter to author
	void setAuthor(String author) {
		this.author = author;
	}
	
	//getter to author 
	String getAuthor() {
		return author;
	}
	
	//setter to publishYear
	void setPublishYear(int publishYear){
		this.publishYear = publishYear;
	}
	//getter to publishYear
	int getPublishYear() {
		return publishYear;
	}
	
	void borrow() {
		isBorrowed = true;
	}
	
	void returnBack() {
		isBorrowed = false;
	}
	
	String isBorrowed() {
		String borrowBooking;
		if(isBorrowed) {
			borrowBooking = "Not available";
		}else {
			borrowBooking = "available";
		}
		
		return borrowBooking;
	}
	public String toString() {
       isBorrowed();
       return "Title: " + title + "\n\t" + "by " + author + "--published " + publishYear + "\n\t" + "Status: " + isBorrowed() + " to borrow";
	}
}

