package impuestos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrabajadorTest {
	
	private Ingreso ingreso;
	private IngresoPorHorasExtra ingresoHE;
	private Trabajador juan;
	
	@BeforeEach
	public void setUp() {
		ingreso = new Ingreso("Enero", "sueldo", 20000);
		ingresoHE = new IngresoPorHorasExtra("Enero", "sueldo", 5000, 20);
		juan = new Trabajador("Juan");
		
	}
	
	@Test
	public void testIngresos() {
		assertEquals(0, juan.getIngresos().size());
		juan.getIngresos().add(ingreso);
		juan.getIngresos().add(ingresoHE);
		assertEquals(2, juan.getIngresos().size());
	}
	
	@Test
	public void testGetMontos() {
		assertEquals(new Double(0), juan.getTotalPercibido());
		assertEquals(new Double(0), juan.getMontoImponible());
		assertEquals(new Double(0), juan.getImpuestoAPagar());
		juan.getIngresos().add(ingreso);
		assertEquals(new Double(20000), juan.getTotalPercibido());
		assertEquals(new Double(20000), juan.getMontoImponible());
		assertEquals(new Double(400), juan.getImpuestoAPagar());
		juan.getIngresos().add(ingresoHE);
		assertEquals(new Double(25000), juan.getTotalPercibido());
		assertEquals(new Double(20000), juan.getMontoImponible());
		assertEquals(new Double(400), juan.getImpuestoAPagar());
	}
}
