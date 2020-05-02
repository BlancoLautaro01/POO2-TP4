package impuestos;

import java.util.ArrayList;

public class Trabajador {
	
	private String nombre;
	private ArrayList<Ingreso> ingresos = new	ArrayList<Ingreso>();

	
	public Trabajador(String nombre) {
		super();
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Ingreso> getIngresos() {
		return ingresos;
	}
	
	public double getTotalPercibido() {
		double totalPercibido = 0;
		for (Ingreso prod : this.ingresos) {
			totalPercibido += prod.getMontoPercibido();
		}
		return totalPercibido;
	}
	
	public double getMontoImponible() {
		double montoImponible = 0;
		for (Ingreso prod : this.ingresos) {
			montoImponible += prod.getMontoImponible();
		}
		return montoImponible;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}


}
