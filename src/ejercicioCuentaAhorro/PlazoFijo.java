package ejercicioCuentaAhorro;

public class PlazoFijo extends Cuenta {
	
	//1. Atributos
	public int plazo;
	public double interes;
	
	
	//Método constructor
	public PlazoFijo(String titular, float cantidad, int plazo, double interes) {
		super(titular, cantidad);
		this.plazo = plazo;
		this.interes = interes;
	}
	
	//Metodo obtener importe de interés
	public double obtenerImporteInteres() {
		return cantidad*(interes/100);
	}
	
	//Método para mostrar información
	public void mostrarInformacionPlazoFijo() {
		System.out.println("Información de la cuenta Plazo Fijo");
		imprimirDatosCuenta(); //método imprimir datos de la clase cuenta
		System.out.println("Plazo: " + plazo);
		System.out.println("Interés: " + interes);
		System.out.println("Total de interés: " + obtenerImporteInteres());
	}
}
