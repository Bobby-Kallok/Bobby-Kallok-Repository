package edu.monmouth.tree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;



public class TreeApp {
   public static void main(String[] args) {
       // verify there is 1 and only 1 command line argument
	   
		if (args[0] == null ) {
			System.err.println("Improper command line arguements");
			System.exit(-1);
		}
       
       // load the properties file using command line argument
		
		  Properties properties = new Properties();
			try {
				properties.load(new BufferedReader (new FileReader(args[0])));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
       
       // list all properties to System.out
	  
			   properties.list(System.out);
			   
       // obtain the value of log_file_name property
            
       // redirect stdout & stderr to the value of log_file_name
			
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
	       properties.list(System.out);
       
	// obtain the value of node_values property
			
			String inputString = properties.getProperty("node_values");
			String values[] = inputString.split(HW5Constants.DELIMITER_1);
	
	// create an instance of the Tree class
	Tree tree = new Tree();
	// verify min, max and find operate on an empty tree
	System.out.println("Minimum value of empty tree: " + tree.min());
	 System.out.println("Maximum value of empty: "+  tree.max());
	 System.out.println("10 in empty tree: " + tree.find(10));
	
	// parse the key / value pairs of node_values and insert into tree
 	
	for ( String pairs : values) {
		int key;
		double value;
		String val[] = pairs.split(HW5Constants.DELIMITER_2);
		key = Integer.parseInt (val[0]);
		value = Double.parseDouble (val[1]);
		tree.insert(key, value);
	}
	
      	// print out the keys using inorder
	tree.traverse(2);
      
      
      // determine if the value 12 is in the tree
	
	System.out.println("12 in tree: " + tree.find(12));

      // determine if the value 80 is in the tree
	
	System.out.println("80 in tree: " + tree.find(80));
     
	// print out the minimum value in the tree 
	
	System.out.println("Minimum value: " + tree.min());

	// print out the maximum value in the tree      
      
     System.out.println("Maximum value: "+  tree.max());
      } 
   }  