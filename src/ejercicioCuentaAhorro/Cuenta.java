package ejercicioCuentaAhorro;

public class Cuenta {

	//1. Atributos
	String titular;
	float cantidad;
	
	
	//Constructor para pasarlo a las subclases
	public Cuenta(String titular, float cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}//constructor



	//2. Método para imprimir datos
	public void imprimirDatosCuenta() {
		System.out.println("Titular: " + titular);
		System.out.println("Cantidad: " + cantidad);
	}//imprimir datos
}//clase cuenta


