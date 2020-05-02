package supermercado;

public class Producto {
	
	private String nombre;
	protected double precio;
	private boolean precioCuidado = false;
	
	public Producto(String nombre, double precio, boolean precioCuidado) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPrecioCuidado(precioCuidado);
	}
	
	public Producto(String nombre, double precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean esPrecioCuidado() {
		return precioCuidado;
	}

	public void setPrecioCuidado(boolean precioCuidado) {
		this.precioCuidado = precioCuidado;
	}
	
	public void aumentarPrecio(double aumento) {
		this.setPrecio(aumento + this.getPrecio());
	}
}