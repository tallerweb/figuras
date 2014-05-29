package edu.unlam.tw1;

import java.util.LinkedList;
import java.util.List;

public class FiguraCompuesta extends Figura {

	private List<Figura> listaDeFiguras;

	public FiguraCompuesta() {
		this.listaDeFiguras = new LinkedList<Figura>();
	}
	
	public double getArea() {
		double areaTotal = 0;
		for(Figura cadaFigura : this.listaDeFiguras) {
			areaTotal += cadaFigura.getArea();
		}
		return areaTotal;
	}

	public void agregarFigura(Figura figura) {
		this.listaDeFiguras.add(figura);
	}

}










