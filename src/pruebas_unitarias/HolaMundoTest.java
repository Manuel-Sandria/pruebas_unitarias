package pruebas_unitarias;

import static org.junit.Assert.*;
import org.junit.Test;

public class HolaMundoTest {
	
	@Test
	public void testSuma() {
		long resultadoReal = HolaMundo.suma(2, 2);
		long resultadoEsperado = 4;
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testResta() {
		long resultadoReal = HolaMundo.resta(2, 1);
		long resultadoEsperado = 0;
		assertEquals(resultadoEsperado, resultadoReal);
	}

}