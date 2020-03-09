package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

	@Test
	public void testUnaCifra() {
		ASumar sumi= new ASumar("6");
		String resultado = sumi.mostrar();
		assertEquals("6 = 6", resultado);
	}


