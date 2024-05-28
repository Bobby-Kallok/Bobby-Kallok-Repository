package edu.monmouth.employee;

public class SalesEmployee implements Employee {
private int commission;
private int yearlyBase;

public SalesEmployee(int yearlyBase) {
	this.yearlyBase = yearlyBase;
}
	@Override
	public int getMonthlyPay() {
		return (yearlyBase) / 12;
	}
	
	@Override
	public String toString() {
		return "SalesEmployee [commission=" + commission + ", yearlyBase=" + yearlyBase + "]";
	}
	public void setCommission(int commission) {
		this.commission = commission;
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
	SalesEmployee otherSalesEmployee = (SalesEmployee)otherObject;
	return otherSalesEmployee.yearlyBase == this.yearlyBase && otherSalesEmployee.commission == this.commission;
	}

}
