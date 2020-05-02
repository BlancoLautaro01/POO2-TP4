package supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	
	private double descuento = 0; //double entre 0 y 100
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, double descuento) {
		super(nombre, precio, precioCuidado);
		this.setDescuento(descuento);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado) {
		super(nombre, precio, precioCuidado);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		super(nombre, precio);
		this.setDescuento(descuento);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super(nombre, precio);	
	}
	
	public double getPrecio() {
		return precio * (1 - this.getDescuento());
	}

	public double getDescuento() {
		return descuento / 100;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
}
