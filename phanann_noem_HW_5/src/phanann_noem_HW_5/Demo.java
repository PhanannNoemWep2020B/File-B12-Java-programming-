package phanann_noem_HW_5;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		Books book1 = new Books("Don't Make Me Think", "Steve Krung", 2000);
		Books book2 = new Books("Pro Java Programming", "Terrill", 2005);
		Books book3 = new Books("Programming in Python 3", "Mark Summerfield", 2005);
		Books book4 = new Books("The Clean Coder", "Robert", 2011);
		Books book5 = new Books("The Art of Agile Development", "James Shore", 2007);
		Books book6 = new Books("Head First Design Patterns", "Eric Freeman", 2004);
		Books book7 = new Books("The Linux Command Line", "Willian", 2009);
		Books book8 = new Books("Code Complete", "Steve", 1993);
		Books book9 = new Books("Unit Test Patterns", "Gerard Meszaros", 2003);
		Books book10 = new Books("The C++ Programming Language", "Bjarne Stroustup", 2013);
		
		book1.borrow();
		book2.returnBack();
		book3.borrow();
		book4.borrow();
		book5.returnBack();
		book6.returnBack();
		book7.borrow();
		book8.returnBack();
		book9.returnBack();
		book10.borrow();
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		System.out.println(book4.toString());
		System.out.println(book5.toString());
		System.out.println(book6.toString());
		System.out.println(book7.toString());
		System.out.println(book8.toString());
		System.out.println(book9.toString());
		System.out.println(book10.toString());
		
		List<Books> storeBook = new ArrayList<>();
		storeBook.add(book1);
		storeBook.add(book2);
		storeBook.add(book3);
		storeBook.add(book4);
		storeBook.add(book5);
		storeBook.add(book6);
		storeBook.add(book7);
		storeBook.add(book8);
		storeBook.add(book9);
		storeBook.add(book10);
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.format("%30s %20s %10s %30s", "TITLE", "AUTHOR", "YEARS", "STATUS");
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
		for(Books result: storeBook) {
			System.out.format("%30s %20s %10s %30s", result.getTitle(), result.getAuthor(), result.getPublishYear(), result.isBorrowed());
			System.out.println();
		}
		
		
	}

}
