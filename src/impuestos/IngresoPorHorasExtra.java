package impuestos;

public class IngresoPorHorasExtra extends Ingreso{

		private int cantHoras;

		public IngresoPorHorasExtra(String mes, String concepto, double montoPercibido, int cantHoras) {
			super(mes, concepto, montoPercibido);
			this.setCantHoras(cantHoras);
		}
		
		public int getCantHoras() {
			return cantHoras;
		}

		public void setCantHoras(int cantHoras) {
			this.cantHoras = cantHoras;
		}
		
		public double getMontoImponible() {
			return 0;
		}
}
