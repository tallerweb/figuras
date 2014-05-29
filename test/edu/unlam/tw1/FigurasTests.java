package edu.unlam.tw1;


import org.junit.Assert;
import org.junit.Test;

public class FigurasTests {

	@Test
	public void lala() {
		
		FiguraCompuesta fc = new FiguraCompuesta();
		fc.agregarFigura(new Circulo(1));
		fc.agregarFigura(new Rombo(1, 2));
		
		double areaEsperada = Math.PI + 1;
		double areaCalculada = fc.getArea();
		
		Assert.assertEquals(areaEsperada, areaCalculada, 0);
		
	}
	
	@Test
	public void queTengoFigurasCompuestasCompuestas() {
		FiguraCompuesta fc1 = new FiguraCompuesta();
		fc1.agregarFigura(new Circulo(1));
		fc1.agregarFigura(new Rombo(1, 2));
		
		FiguraCompuesta fc2 = new FiguraCompuesta();
		fc2.agregarFigura(new Rombo(2, 4));
		fc2.agregarFigura(new Circulo(2));
		
		FiguraCompuesta fcc = new FiguraCompuesta();
		fcc.agregarFigura(fc1);
		fcc.agregarFigura(fc2);
		
		Assert.assertEquals(20.7, fcc.getArea(), 0.1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
