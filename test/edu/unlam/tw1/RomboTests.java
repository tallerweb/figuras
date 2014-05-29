package edu.unlam.tw1;

import org.junit.Assert;
import org.junit.Test;

public class RomboTests {

	@Test
	public void queCalculaArea() {
		Rombo r = new Rombo(1, 2);
		
		double areaEsperada = 1;
		double areaCalculada = r.getArea();
		
		Assert.assertEquals(areaEsperada, areaCalculada, 0);
	}

}
