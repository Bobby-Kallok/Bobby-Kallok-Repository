package edu.monmouth.employee;

public class PieceEmployee implements Employee {
private int ratePerPiece;
private int piecesMade;

public PieceEmployee(int ratePerPiece ) {
	this.ratePerPiece = ratePerPiece;
}
	@Override
	public int getMonthlyPay() {
		return ratePerPiece * piecesMade;
	}

	@Override
	public String toString() {
		return "PieceEmployee [ratePerPiece=" + ratePerPiece + ", piecesMade=" + piecesMade + "]";
	}
	public void setPiecesMade(int piecesMade) {
		this.piecesMade = piecesMade;
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
	PieceEmployee otherPieceEmployee = (PieceEmployee)otherObject;
	return otherPieceEmployee.ratePerPiece == this.ratePerPiece && otherPieceEmployee.piecesMade == this.piecesMade;
	}

}
