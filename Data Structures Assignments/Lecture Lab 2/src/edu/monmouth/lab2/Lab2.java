package edu.monmouth.lab2;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import edu.monmouth.coffeemaker.*;

public class Lab2 {

	public static void main(String[] args) {
		
		if (args[0] == null ){
			System.err.println("Improper command line arguements");
			System.exit(-1);
		}
		try {
			PrintStream st = new PrintStream(args[0]);
			System.setOut(st);
			System.setErr(st);
			} catch(FileNotFoundException ioe) {
			System.err.println("Cannot redirect stderr and stdout " +
			ioe.getMessage());
			ioe.printStackTrace();
			System.exit(-1);
			}
         
		
	BasicCoffeeMaker bcm1 = new BasicCoffeeMaker("Keurig");
	BasicCoffeeMaker bcm2 = new BasicCoffeeMaker("Nespresso");
	BasicCoffeeMaker bcm3 = new BasicCoffeeMaker("Mr. Coffee");
	BasicCoffeeMaker bcm4 = new BasicCoffeeMaker("Black and Decker");
	
	PremiumCoffeeMaker pcm1 = new PremiumCoffeeMaker(24, true);
	PremiumCoffeeMaker pcm2 = new PremiumCoffeeMaker(32, true);
	PremiumCoffeeMaker pcm3 = new PremiumCoffeeMaker(16, false);
	PremiumCoffeeMaker pcm4 = new PremiumCoffeeMaker(48, false);
	
	List<BasicCoffeeMaker> basicList = new LinkedList<BasicCoffeeMaker>();
	
	basicList.add(bcm1);
	basicList.add(bcm2);
	basicList.add(bcm3);
	basicList.add(bcm4);
	
	
	System.out.println("Iterating through Basic Coffee Makers with Enhanced For Loop:");
	System.out.println("********************************************************************");
	System.out.println();
	
	for(BasicCoffeeMaker maker : basicList){
		System.out.println(maker);
	}
	System.out.println();
	System.out.println("Iterating through Basic Coffee Makers with Iterator:");
	System.out.println("********************************************************************");
	System.out.println();
	
	Iterator <BasicCoffeeMaker> it = basicList.iterator(); 
	while(it.hasNext()){ 
	System.out.println(it.next());
	}
	System.out.println();
	System.out.println("Iterating through Basic Coffee Makers with Linked List's Size() and Get():");
	System.out.println("********************************************************************");
	System.out.println();
	
	for (int i = 0; i < basicList.size(); i++) {
		CoffeeMaker temp;
		temp = basicList.get(i);
		System.out.println(temp);
	}
	System.out.println();
	System.out.println("Checking Whether Basic Coffee Makers are in List:");
	System.out.println("********************************************************************");
	System.out.println();
	
	BasicCoffeeMaker inlist = new BasicCoffeeMaker("Nespresso");
	BasicCoffeeMaker notInlist = new BasicCoffeeMaker("Not in list");
	
	if(basicList.contains(inlist)== true) {
		System.out.println(inlist + "\nExists in basicList");
	} else {
		System.out.println(inlist + "\nDoes not exist in basiclist");
	}
	
	if(basicList.contains(notInlist)== true) {
		System.out.println(notInlist + "\nExists in basicList");
	} else {
		System.out.println(notInlist + "\nDoes not exist in basicList");
	}
	
	System.out.println();
	System.out.println("Sorted List:");
	System.out.println("********************************************************************");
	System.out.println();
	
	Collections.sort(basicList);
	for(CoffeeMaker maker : basicList){
		System.out.println(maker);
	}
	System.out.println();
List<PremiumCoffeeMaker> pList = new LinkedList<PremiumCoffeeMaker>();
	
	pList.add(pcm1);
	pList.add(pcm2);
	pList.add(pcm3);
	pList.add(pcm4);
	
	
	System.out.println("Iterating through Premium Coffee Makers with Enhanced For Loop:");
	System.out.println("********************************************************************");
	System.out.println();
	for(PremiumCoffeeMaker maker : pList){
		System.out.println(maker);
	}
	System.out.println();
	System.out.println("Iterating through Premium Coffee Makers with Iterator:");
	System.out.println("********************************************************************");
	System.out.println();
	
	Iterator <PremiumCoffeeMaker> iter = pList.iterator(); 
	while(iter.hasNext()){ 
	System.out.println(iter.next());
	}
	System.out.println();
	System.out.println("Iterating through Premium Coffee Makers with Linked List's Size() and Get():");
	System.out.println("********************************************************************");
	System.out.println();
	
	for (int i = 0; i < pList.size(); i++) {
		PremiumCoffeeMaker temp;
		temp = pList.get(i);
		System.out.println(temp);
	}
	
	
	System.out.println();
	System.out.println("Sorted List:");
	System.out.println("********************************************************************");
	System.out.println();
	//basicList.sort(null);
	Collections.sort(pList);
	for(PremiumCoffeeMaker maker : pList){
		System.out.println(maker);
	}
	}

}
