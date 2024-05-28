package edu.monmouth.hw4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import java.util.Stack;

public class HW4Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		try {
			properties.load(new BufferedReader (new FileReader(args[0])));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			PrintStream st = new PrintStream(properties.getProperty("log_file_name"));
			System.setOut(st);
			System.setErr(st);
			} catch(FileNotFoundException ioe) {
			System.err.println("Cannot redirect stderr and stdout " +
			ioe.getMessage());
			ioe.printStackTrace();
			System.exit(-1);
			}
		
		String inputString = properties.getProperty("words");
		String values[] = inputString.split(HW4Constants.DELIMITER);
		for ( String words : values) {
			System.out.println(words);
		}
		Stack<Character> palindromeStack = new Stack<Character>();
	
		for (int j = 0; j < values.length; j++) {// iterating through each word
		for (int i = 0; i < values[j].length() ; i++) { //creating stack from word
			palindromeStack.push(values[j].charAt(i));
		}
		StringBuilder palindromeStringBuilder = new StringBuilder();
		for (int i = 0; i < values[0].length() ; i++) {//popping letter onto palindrome stringbuilder
			char letter = palindromeStack.pop();
			palindromeStringBuilder.append(letter);
		}

		String palindromeString = palindromeStringBuilder.toString();
		if (values[j].equals(palindromeString)) {
			System.out.println(values[j] + " is a palindrome");
		}else {
			System.out.println(values[j] + " is not a palindrome");
		}
		}
	}

}
