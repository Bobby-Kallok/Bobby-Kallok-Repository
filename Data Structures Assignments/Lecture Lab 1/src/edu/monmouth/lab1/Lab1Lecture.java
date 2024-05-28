package edu.monmouth.lab1;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import edu.monmouth.employee.*;

public class Lab1Lecture {
    public static void main(String[] args) {
	// direct standard out & err to Lab1Lecture.txt
    	
    	final String LOGFILENAME = "Lab1Lecture.txt";
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
	// declare a List that stores Employee objects in a LinkedList
		
		List<Employee> list = new LinkedList<Employee>();
	    	
    	// construct a SalaryEmployee with a yearly salary of $30,000
    	SalaryEmployee salaryEmployee1 = new SalaryEmployee(30000);
    	
    	// construct a SalaryEmployee with a yearly salary of $35,000
    	SalaryEmployee salaryEmployee2 = new SalaryEmployee(35000);
    	
    	// construct a PieceEmployee that gets paid $60 per piece made
    	PieceEmployee pieceEmployee1 = new PieceEmployee(60);
    	// set the number of pieces made this month to 2,000
    	pieceEmployee1.setPiecesMade(2000);
    	
    	// construct a PieceEmployee that gets paid $40 per piece made
    	PieceEmployee pieceEmployee2 = new PieceEmployee(40);
    	// set the number of pieces made this month to 3,500
    	pieceEmployee2.setPiecesMade(3500);
    	
    	// construct a SalaryEmployee with a yearly salary of $100,000
    	SalaryEmployee salaryEmployee3 = new SalaryEmployee(100000);
    	
    	// construct a SalesEmployee with a yearly base of $60,000
    	SalesEmployee salesEmployee = new SalesEmployee(60000);
    	// set this month's commission to $30,000
    	salesEmployee.setCommission(30000);
    	
    	// add these Employees to the list
    	
    	list.add(salaryEmployee1);
    	list.add(salaryEmployee2);
    	list.add(pieceEmployee1);
    	list.add(pieceEmployee2);
    	list.add(salaryEmployee3);
    	list.add(salesEmployee);
    	
    			
	System.out.println("Iterating forward through list");
	// using an Iterator, iterate forward thru the list, printing each Employee's attributes
	
	Iterator <Employee> it = list.iterator(); //create iterator
	while(it.hasNext()){ //while there is a next
	System.out.println(it.next());// print next
	}
	System.out.println();	
	
	
	System.out.println("Iterating forward here is each monthlyPay");
	// using an Iterator, iterate thru the list, printing each Employee's monthly pay
	
	Iterator <Employee> it2 = list.iterator(); //create iterator
	Employee temp;
	while(it2.hasNext()){ //while there is a next
		temp = it2.next();
		System.out.println(temp.getMonthlyPay());// print next
		}
	System.out.println();	
	// remove salaryEmployee1 from the list
	
	list.remove(salaryEmployee1);
		
	System.out.println("Iterating forward after removal");
	// using an Iterator, iterate thru the list, printing each Employee's attributes
	
	Iterator <Employee> it3 = list.iterator(); //create iterator
	while(it3.hasNext()){ //while there is a next
		System.out.println(it3.next());// print next
		}
		System.out.println();	
	// declare an array of references to Employee objects
	// sized to the number of Employee objects in the List
		
	Employee[] employeeArray = new Employee[list.size()];

	// using a List method, transfer the List to the array
	employeeArray = list.toArray(employeeArray);

	System.out.println("Contents of array");	
	// iterate thru the array, printing out each Employee's attributes
	
	for (Employee employee : employeeArray) {
		System.out.println(employee);
	}
    }

}
