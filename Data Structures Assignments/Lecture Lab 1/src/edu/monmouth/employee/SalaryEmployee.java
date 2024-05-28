
package edu.monmouth.employee;

public class SalaryEmployee implements Employee {
private int yearlySalary;

public SalaryEmployee(int yearlySalary) {
	this.yearlySalary = yearlySalary;
}
	@Override
	public int getMonthlyPay() {
		return yearlySalary / 12;
	}
	@Override
	public String toString() {
		return "SalaryEmployee [yearlySalary=" + yearlySalary + "]";
	}
	@Override
	public boolean equals(Object otherObject) {
	if (otherObject == null) {
	return false;
	}
	
	if (getClass() != otherObject.getClass()) {
	return false;
	}
	if (this == otherObject) {
	return true;
	}
	SalaryEmployee otherSalaryEmployee = (SalaryEmployee)otherObject;
	return otherSalaryEmployee.yearlySalary == this.yearlySalary;
	}
}
