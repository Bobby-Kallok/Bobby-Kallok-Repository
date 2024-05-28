package edu.monmouth.hw3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Example {
	public static void main(String[] args)  {
		/*final String FNAME = "Airplane.txt";
		final int BADFILE=-1, BADREAD=-2, REQUIREDFIELDS=3;
		final String DELIMITER = ",";
		String inputString=null;
		List<Airplane> list = new ArrayList<Airplane>();
		
		try {
			BufferedReader in
			   = new BufferedReader(new FileReader(FNAME));
			
			while((inputString = in.readLine()) != null) {
				System.out.println(inputString);
				String values[] = inputString.split(DELIMITER);
				if(values.length != REQUIREDFIELDS) {
					continue;
				}
				String manufacturer = values[0];
				try {
					AirplaneTypes type = AirplaneTypes.valueOf(values[1]);
					int capacity = Integer.parseInt(values[2]);
					Airplane airplane = new Airplane(manufacturer, type, capacity);
					System.out.println(airplane);
					list.add(airplane);
				}catch (IllegalArgumentException e) {
					System.err.println("Bad capacity " + inputString);
					continue;
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println("Cannot open file " + FNAME + e.getMessage());
			e.printStackTrace();
			System.exit(BADFILE);
		} catch (IOException e) {
			System.err.println("Cannot read file " + FNAME + e.getMessage());
			e.printStackTrace();
			System.exit(BADREAD);
		}
		
		System.out.println("list fully populated from file...");
		Iterator<Airplane> iterator = list.iterator();
		while(iterator.hasNext()==true) {
			System.out.println(iterator.next());
		}
		System.out.println("Navigating forward with ListIterator...");
		ListIterator<Airplane> listIterator = list.listIterator();
		while(listIterator.hasNext()==true) {
			System.out.println(listIterator.next());
		}
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println("Iterating forward with enhanced loop");
		for(Airplane airplane : list) {
			System.out.println(airplane);
		}
		Airplane myAirplane = new Airplane("Boeing", AirplaneTypes.PROPELLOR, 20);
		if (list.contains(myAirplane) == true) {
			System.out.println("myAirplane exists in list!");
		}
		Airplane findMe = new Airplane("Airbus", AirplaneTypes.GLIDER, 200);
		if (list.contains(findMe) == true) {
			System.out.println("findMe exists in list!");
		}
		System.out.println("Moving data to array...");
		Airplane planeArray[] = new Airplane[list.size()];
		planeArray = list.toArray(planeArray);
		for(Airplane p : planeArray) {
			System.out.println(p);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		*/
		
		
	}

}
