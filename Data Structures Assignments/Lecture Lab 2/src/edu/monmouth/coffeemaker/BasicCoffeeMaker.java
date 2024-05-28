package edu.monmouth.coffeemaker;

import java.util.Objects;

public class BasicCoffeeMaker implements CoffeeMaker, Comparable<BasicCoffeeMaker> {
private String name;

public BasicCoffeeMaker(String name) {
	setName(name);
}
	
	public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


	@Override
	public void brew() {
		System.out.println("Basic Coffee Maker is brewing...");

	}

	@Override
	public String toString() {
		return "BasicCoffeeMaker [name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BasicCoffeeMaker other = (BasicCoffeeMaker) obj;
		return Objects.equals(name, other.name);
	}
	
	@Override
	public int compareTo(BasicCoffeeMaker otherCoffeeMaker) {
			return this.name.compareTo(otherCoffeeMaker.name);
		
	}

}
