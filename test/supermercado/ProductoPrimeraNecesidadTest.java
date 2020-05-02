package supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad queso;
	private ProductoPrimeraNecesidad agua;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 10); //Se agrego el descuento en vez de modificar a 8 el assert.
		queso = new ProductoPrimeraNecesidad("Queso", 10d, false, 25);
		agua = new ProductoPrimeraNecesidad("Agua", 5d, false, 50);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.getPrecio());
		assertEquals(new Double(7.5), queso.getPrecio());
		assertEquals(new Double(2.5), agua.getPrecio());
	}
}
