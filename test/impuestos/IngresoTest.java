package impuestos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IngresoTest {
	
	private Ingreso ingreso;
	
	@BeforeEach
	public void setUp() {
		ingreso = new Ingreso("Enero", "sueldo", 20000);
		
	}
	
	@Test
	public void testConstructor() {
		assertEquals(20000, ingreso.getMontoPercibido());
		assertEquals("sueldo", ingreso.getConcepto());
		assertEquals("Enero", ingreso.getMes());
	}
	
	@Test
	public void testGetMontoImponible() {
		assertEquals(20000, ingreso.getMontoImponible());
	}
}