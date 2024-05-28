package edu.monmouth.hw4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import edu.monmouth.book.*;

public class BookHW4 {
	public static void main(String args[]) {
		// validate 2 command line arguments are passed in
		
		if ((args[0] == null )|| (args[1] == null)) {
			System.err.println("Improper command line arguements");
			System.exit(-1);
		}
		
		// first argument is the name of the data file
		// second argument is the name of the file to which stdout & stderr are redirected
		
		// redirect stdout & stderr to specified file
		
		
		try {
		PrintStream st = new PrintStream(args[1]);
		System.setOut(st);
		System.setErr(st);
		} catch(FileNotFoundException ioe) {
		System.err.println("Cannot redirect stderr and stdout " +
		ioe.getMessage());
		ioe.printStackTrace();
		System.exit(-1);
		}
		
		// create a HashSet that contains Book objects (name it bookSet)
		
		Set<Book> bookSet = new HashSet<Book>();
		
		// open and read the data file, creating Book objects (if valid)
		// for each Book object created, add the Book object to the HashSet.
		String inputString = null;
		try {
			BufferedReader in
			   = new BufferedReader(new FileReader(args[0]));
			System.out.println("Importing " + args[0]);
			System.out.println("-------------------------------------------------------------");
			while((inputString = in.readLine()) != null) {
				System.out.println(inputString);
				String values[] = inputString.split(HW4Constants.DELIMITER);
				if(values.length != HW4Constants.REQUIREDFIELDS) {
					continue;
				}
				String title = values[0];
				try {
					BookTypes type = BookTypes.valueOf(values[1]);
					int numberOfPages = Integer.parseInt(values[2]);
					double price = Double.parseDouble(values[3]);
					Book book = new Book(numberOfPages, price, title, type);
					System.out.println(book);
					if (bookSet.add(book) == true) {
						System.out.println("successfully added book to HashSet");
					} else {
						System.out.println("Book was not added to HashSet");
					}
				}catch (IllegalArgumentException | BookException e) {
					System.err.println("Invalid Input " + inputString);
					continue;
				}
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.err.println("Cannot open file " + args[0] + e.getMessage());
			e.printStackTrace();
			System.exit(HW4Constants.BADFILE);
		} catch (IOException e) {
			System.err.println("Cannot read file " + args[0] + e.getMessage());
			e.printStackTrace();
			System.exit(HW4Constants.BADREAD);
		}
	
		System.out.println();
		// after data file is read and valid Book objects added to Hashset iterate over HashSet 
		// printing each Book object 
		System.out.println("Iterating through bookSet");
		System.out.println("-------------------------------------------------------------");
		
		Iterator <Book> it = bookSet.iterator(); //create iterator
		while(it.hasNext()){ //while there is a next
		System.out.println(it.next());// print next
		}
		System.out.println();
			
		// determine if the following 2 books are in the HashSet
		
		System.out.println("Finding books in bookSet");
		System.out.println("-------------------------------------------------------------");
		Book bookToFind = null;
		try {
			bookToFind = new Book(829, 23.95, "The Soloman Curse", BookTypes.HARDBACK);
			if(bookSet.contains(bookToFind)== true) {
				System.out.println(bookToFind + "\nExists in bookSet");
			} else {
				System.out.println(bookToFind + "\nDoes not exist in bookSet");
			}
			bookToFind = new Book(629, 87.00, "The BigBang Theory", BookTypes.HARDBACK);
			if(bookSet.contains(bookToFind)== true) {
				System.out.println(bookToFind + "\nExists in bookSet");
			} else {
				System.out.println(bookToFind + "\nDoes not exist in bookSet");
			}
		} catch (BookException e) {
			System.err.println("Cannot create a Book object from these values:\n" + bookToFind + e.getMessage());
		}
			
	}
}

