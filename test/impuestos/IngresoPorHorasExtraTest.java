package impuestos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IngresoPorHorasExtraTest {
	
	private IngresoPorHorasExtra ingresoHE;
	
	@BeforeEach
	public void setUp() {
		ingresoHE = new IngresoPorHorasExtra("Enero", "sueldo", 5000, 20);
		
	}
	
	@Test
	public void testConstructor() {
		assertEquals(5000, ingresoHE.getMontoPercibido());
		assertEquals("sueldo", ingresoHE.getConcepto());
		assertEquals("Enero", ingresoHE.getMes());
		assertEquals(20, ingresoHE.getCantHoras());
	}
	
	@Test
	public void testGetMontoImponible() {
		assertEquals(0, ingresoHE.getMontoImponible());
	}
}