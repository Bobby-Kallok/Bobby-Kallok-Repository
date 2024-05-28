package edu.monmouth.hw2;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import edu.monmouth.book.*;

public class HW2 {

	public static void main(String[] args) {
		
		final String LOGFILENAME = "HW2.txt";
		try {
		PrintStream st = new PrintStream(LOGFILENAME);
		System.setOut(st);
		System.setErr(st);
		} catch(FileNotFoundException ioe) {
		System.err.println("Cannot redirect stderr and stdout " +
		ioe.getMessage());
		ioe.printStackTrace();
		System.exit(-1);
		}
		
		ListNode list = new ListNode();
		
		System.out.println("First: " + list.first());
		System.out.println("Removed first: " + list.removeFirst());
		System.out.println("Last: " + list.last());
		System.out.println("Entire list: \n" + list);
		
		
		Book book1 = null;
		Book book2 = null;
		Book book3 = null;
		Book book4 = null;
		
		try{
			book1 = new Book(88, 25.75, "To Kill a Mockingbird", BookTypes.HARDBACK);
			book2 = new Book(129, 15, "For Whom the Bell Tolls", BookTypes.SOFTBACK);
			book3 = new Book(239, 32.50, "Undaunted Courage", BookTypes.HARDBACK);
			book4 = new Book(12, 12.50, "Goodnight Moon", BookTypes.HARDBACK);
		} catch(BookException e) {
			System.err.println("Cannot create all books");
			System.exit(HW2Constants.BOOKFAILURE);
		}
		
		
		list.insert(book1);
		list.insert(book2);
		list.insert(book3);
		
		System.out.println("After inserting 3 books: \n" + list);
		
		 list.insertEnd(book4);
		 
		System.out.println("After adding fourth book: \n" + list);
		
		System.out.println("First: " + list.first());
		
		System.out.println("Last: " + list.last());

		System.out.println("Removed first: " + list.removeFirst());
		System.out.println("Entire list: \n" + list);
		
	}
	
}
