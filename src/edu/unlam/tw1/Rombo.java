package edu.unlam.tw1;

public class Rombo extends Figura {

	private double diagonalMenor;
	private double diagonalMayor;

	public Rombo(double diagonalMenor, double diagonalMayor) {
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
	}

	public double getArea() {
		return this.diagonalMenor * this.diagonalMayor / 2;
	}
	
}
