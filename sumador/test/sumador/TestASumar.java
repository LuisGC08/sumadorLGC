package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

	@Test
	public void testNegativo() {
		ASumar sumi = new ASumar("-2");
		String resultado = sumi.mostrarNegativo();
		assertEquals("", resultado);
	}

