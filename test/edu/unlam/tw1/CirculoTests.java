package edu.unlam.tw1;

import org.junit.Assert;
import org.junit.Test;

public class CirculoTests {

	@Test
	public void queCalculaArea() {
		Figura c = new Circulo(1);
		
		double areaCalculada = c.getArea();
		double areaEsperada = Math.PI;
		
		Assert.assertEquals(areaEsperada, areaCalculada, 0);
	}
	
	@Test(expected=ParametroNegativoException.class)
	public void queNoSePuedeCrearCirculoConRadioNegativo() {
		new Circulo(-1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
