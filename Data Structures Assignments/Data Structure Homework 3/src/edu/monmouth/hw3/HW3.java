package edu.monmouth.hw3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import edu.monmouth.book.*;

public class HW3 {

	public static void main(String[] args) {
				try {
		PrintStream st = new PrintStream(HW3Constants.LOGFILENAME);
		System.setOut(st);
		System.setErr(st);
		} catch(FileNotFoundException ioe) {
		System.err.println("Cannot redirect stderr and stdout " +
		ioe.getMessage());
		ioe.printStackTrace();
		System.exit(-1);
		}
	
		
		String inputString=null;
		List<String> stringArrayList = new ArrayList<String>();
		List<String> stringLinkList = new LinkedList<String>();
		
		try {
			BufferedReader in
			   = new BufferedReader(new FileReader(HW3Constants.FNAME));
			System.out.println("Importing " + HW3Constants.FNAME);
			System.out.println("-------------------------------------------------------------");
			while((inputString = in.readLine()) != null) {
				System.out.println(inputString);
				stringArrayList.add(inputString);
				stringLinkList.add(inputString);
				
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.err.println("Cannot open file " + HW3Constants.FNAME + e.getMessage());
			e.printStackTrace();
			System.exit(HW3Constants.BADFILE);
		} catch (IOException e) {
			System.err.println("Cannot read file " + HW3Constants.FNAME + e.getMessage());
			e.printStackTrace();
			System.exit(HW3Constants.BADREAD);
		}
		System.out.println();
		String inputString2=null;
		List<Book> bookArrayList = new ArrayList<Book>();
		List<Book> bookLinkList = new LinkedList<Book>();
		
		try {
			BufferedReader in2
			   = new BufferedReader(new FileReader(HW3Constants.FNAME2));
			System.out.println("Importing " + HW3Constants.FNAME2);
			System.out.println("-------------------------------------------------------------");
			while((inputString2 = in2.readLine()) != null) {
				System.out.println(inputString2);
				String values[] = inputString2.split(HW3Constants.DELIMITER);
				if(values.length != HW3Constants.REQUIREDFIELDS) {
					continue;
				}
				String title = values[0];
				try {
					BookTypes type = BookTypes.valueOf(values[1]);
					int numberOfPages = Integer.parseInt(values[2]);
					double price = Double.parseDouble(values[3]);
					Book book = new Book(numberOfPages, price, title, type);
					System.out.println(book);
					bookArrayList.add(book);
					bookLinkList.add(book);
				}catch (IllegalArgumentException | BookException e) {
					System.err.println("Invalid Input " + inputString2);
					continue;
				}
			}
			in2.close();
		} catch (FileNotFoundException e) {
			System.err.println("Cannot open file " + HW3Constants.FNAME + e.getMessage());
			e.printStackTrace();
			System.exit(HW3Constants.BADFILE);
		} catch (IOException e) {
			System.err.println("Cannot read file " + HW3Constants.FNAME + e.getMessage());
			e.printStackTrace();
			System.exit(HW3Constants.BADREAD);
		}
		System.out.println();
		System.out.println("stringArrayList");
		System.out.println("-------------------------------------------------------------");
		System.out.println("stringArrayList isEmpty: " + stringArrayList.isEmpty());
		System.out.println("stringArrayList size: " + stringArrayList.size());
		System.out.println("stringArrayList remove: " + stringArrayList.remove(4));
		System.out.println("stringArrayList add: " + stringArrayList.add("Boolean"));
		System.out.println();
		
		System.out.println("Iterating through stringArrayList with Iterator");
		Iterator <String> iterator = stringArrayList.iterator(); //create iterator
		while(iterator.hasNext()){ //while there is a next
		System.out.println(iterator.next());// print next
		} 
		System.out.println();
		System.out.println("Iterating through stringArrayList with List Iterator");
		ListIterator<String> listIterator = stringArrayList.listIterator();
		while(listIterator.hasNext()){ //while there is a next
		System.out.println(listIterator.next());// print next
		}
		System.out.println();
		
		System.out.println();
		System.out.println("stringLinkList");
		System.out.println("-------------------------------------------------------------");
		System.out.println("stringLinkList remove: " + stringLinkList.remove("West Long Branch"));
		System.out.println("stringLinkList remove: " + stringLinkList.remove("House"));
		System.out.println("stringLinkList contains Spacex: " + stringLinkList.contains("Spacex"));
		System.out.println("stringLinkList contains House: " + stringLinkList.contains("House"));
		System.out.println("stringLinkList add: " + stringLinkList.add("Space car"));
		System.out.println();
		
		System.out.println("Iterating through stringLinkList with Iterator");
		Iterator <String> iterator1 = stringLinkList.iterator(); //create iterator
		while(iterator1.hasNext()){ //while there is a next
		System.out.println(iterator1.next());// print next
		} 
		System.out.println();
		System.out.println("Iterating through stringLinkList with List Iterator");
		ListIterator<String> listIterator1 = stringLinkList.listIterator();
		while(listIterator1.hasNext()){ //while there is a next
		System.out.println(listIterator1.next());// print next
		}
		System.out.println();
		
		System.out.println();
		System.out.println("bookArrayList");
		System.out.println("-------------------------------------------------------------");
		System.out.println("bookArrayList isEmpty: " + bookArrayList.isEmpty());
		System.out.println("bookArrayList size: " + bookArrayList.size());
		System.out.println("bookArrayList remove: " + bookArrayList.remove(4));
		System.out.println("bookArrayList add: ");
		try {
			bookArrayList.add(5, new Book(100, 4.0, "The Time Machine", BookTypes.HARDBACK));
		} catch (BookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println("Iterating through bookArrayList with Iterator");
		Iterator <Book> iterator3 = bookArrayList.iterator(); //create iterator
		while(iterator3.hasNext()){ //while there is a next
		System.out.println(iterator3.next());// print next
		} 
		System.out.println();
		System.out.println("Iterating through bookArrayList with List Iterator");
		ListIterator<Book> listIterator3 = bookArrayList.listIterator();
		while(listIterator3.hasNext()){ //while there is a next
		System.out.println(listIterator3.next());// print next
		}
		System.out.println();
		
		System.out.println();
		System.out.println("bookLinkList");
		System.out.println("-------------------------------------------------------------");
		try {
			System.out.println("bookLinkList remove Data Structures and Algorithms: " + bookLinkList.remove(new Book(426, 79.99 , "Data Structures and Algorithms",BookTypes.SOFTBACK)));
		} catch (BookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("bookLinkList remove The Grapes of Wrath: " + bookLinkList.remove(new Book(46, 79.99 , "The Grapes of Wrath",BookTypes.HARDBACK)));
		} catch (BookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("bookLinkList contains Harry Potter and the Half-Blood Prince: " + bookLinkList.contains(new Book(439, 19.99 ,"Harry Potter and the Half-Blood Prince",BookTypes.ELECTRONIC)));
		} catch (BookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("bookLinkList contains The Art of Salad Making: " + bookLinkList.contains(new Book(126, 14.99 ,"The Art of Salad Making",BookTypes.ELECTRONIC)));
		} catch (BookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("bookLinkList add: " + bookLinkList.add(new Book(126, 14.99 ,"The Art of Salad Making",BookTypes.ELECTRONIC)));
		} catch (BookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println("Iterating through bookLinkList with Iterator");
		Iterator <Book> iterator4 = bookLinkList.iterator(); //create iterator
		while(iterator4.hasNext()){ //while there is a next
		System.out.println(iterator4.next());// print next
		} 
		System.out.println();
		System.out.println("Iterating through bookLinkList with List Iterator");
		ListIterator<Book> listIterator4 = bookLinkList.listIterator();
		while(listIterator4.hasNext()){ //while there is a next
		System.out.println(listIterator4.next());// print next
		}
		System.out.println();

		}
	}


