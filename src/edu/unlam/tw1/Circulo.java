package edu.unlam.tw1;

public class Circulo extends Figura {

	double radio;

	public Circulo(double radio) {
		if (radio < 0) {
			throw new ParametroNegativoException("No se puede instanciar un círculo con radio negativo");
		}
		this.radio = radio;
	}
	
	public double getArea() {
		return Math.PI * this.radio * this.radio;
	}
	
}
