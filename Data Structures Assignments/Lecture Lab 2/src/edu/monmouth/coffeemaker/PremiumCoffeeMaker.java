package edu.monmouth.coffeemaker;

import java.util.Objects;

public class PremiumCoffeeMaker implements CoffeeMaker, Comparable<PremiumCoffeeMaker> {

	private int capacity;
	private boolean hasGrinder;
	
	public PremiumCoffeeMaker(int capacity, boolean hasGrinder) {
		setCapacity(capacity);
		setHasGrinder(hasGrinder);
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public boolean isHasGrinder() {
		return hasGrinder;
	}
	public void setHasGrinder(boolean hasGrinder) {
		this.hasGrinder = hasGrinder;
	}
	@Override
	public void brew() {
		System.out.println("Premium Coffee Maker is brewing...");

	}

	@Override
	public String toString() {
		return "PremiumCoffeeMaker [capacity=" + capacity + ", hasGrinder=" + hasGrinder + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PremiumCoffeeMaker other = (PremiumCoffeeMaker) obj;
		return capacity == other.capacity && hasGrinder == other.hasGrinder;
	}
	@Override
	public int compareTo(PremiumCoffeeMaker otherPremiumCoffeeMaker) {
		if(this.capacity < otherPremiumCoffeeMaker.capacity) {
			return -1;
		}
		if(this.capacity > otherPremiumCoffeeMaker.capacity) {
			return 1;
		} 
		return 0;
	}
	

}
