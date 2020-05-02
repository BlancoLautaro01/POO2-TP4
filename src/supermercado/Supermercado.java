package supermercado;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombre, direcion;
	private ArrayList<Producto> productos = new	ArrayList<Producto>();
	
	public Supermercado(String nombre, String direcion) {
		super();
		this.setNombre(nombre);
		this.setDirecion(direcion);
	}

	public String getDirecion() {
		return direcion;
	}

	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public double getPrecioTotal() {
		double sumaPrecios = 0;
		for (Producto prod : this.productos) {
			 sumaPrecios += prod.getPrecio();
		}
		return sumaPrecios;
	}
}
