package ejercicioCuentaAhorro;

public class CajaAhorro extends Cuenta{
	
	//2. Métodos (heredar datos)

	public CajaAhorro(String titular, float cantidad) {
		super(titular, cantidad);
		// TODO Auto-generated constructor stub
	}

	public void imprimirInfoCajaAhorro() {
		System.out.println("Titular: " + titular);
		System.out.println("Cantidad: " + cantidad);

}//imprimir datos

	@Override
	public String toString() {
		return "CajaAhorro [titular=" + titular + ", cantidad=" + cantidad + "]";
	}//toString
	
	
}//cajaAhorro
