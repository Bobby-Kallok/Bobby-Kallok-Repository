package edu.monmouth.hw4;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import edu.monmouth.book.*;

public class HashSetBadName {

	public static void main(String[] args) {
		
	/*
			try {
	PrintStream st = new PrintStream(args[1]);
	System.setOut(st);
	System.setErr(st);
	} catch(FileNotFoundException ioe) {
	System.err.println("Cannot redirect stderr and stdout " +
	ioe.getMessage());
	ioe.printStackTrace();
	System.exit(-1);
	}*/
		
		String inputString2 = null;// TODO Auto-generated method stub
		List<Book> bookArrayList = new ArrayList<Book>();
		List<Book> bookLinkList = new LinkedList<Book>();
		
		try {
			BufferedReader in2
			   = new BufferedReader(new FileReader(args[0]));
			System.out.println("Importing " + args[0]);
			System.out.println("-------------------------------------------------------------");
			while((inputString2 = in2.readLine()) != null) {
				System.out.println(inputString2);
				String values[] = inputString2.split(HW4Constants.DELIMITER);
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
					bookArrayList.add(book);
					bookLinkList.add(book);
				}catch (IllegalArgumentException | BookException e) {
					System.err.println("Invalid Input " + inputString2);
					continue;
				}
			}
			in2.close();
		} catch (FileNotFoundException e) {
			System.err.println("Cannot open file " + args[0] + e.getMessage());
			e.printStackTrace();
			System.exit(HW4Constants.BADFILE);
		} catch (IOException e) {
			System.err.println("Cannot read file " + args[0] + e.getMessage());
			e.printStackTrace();
			System.exit(HW4Constants.BADREAD);
		}
	}

}
