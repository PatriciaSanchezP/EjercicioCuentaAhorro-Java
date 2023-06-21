package tests;

import ejercicioCuentaAhorro.CajaAhorro;
import ejercicioCuentaAhorro.PlazoFijo;

public class ClaseTest {

	public static void main(String[] args) {

		//Instancia #1 (cuentaAhorro)
		CajaAhorro instancia1 = new CajaAhorro("Felipe Maqueda", 1000.0f); //cuando no quiero polimorfear
		
		//Instancia "2 (plazoFijo)
		PlazoFijo instancia2 = new PlazoFijo("Jesus Gonzalez", 2500.0f, 12, 5.0);
		
		//Mostrar información de las cuentas
		instancia1.imprimirInfoCajaAhorro(); //titular y cantidad
		System.out.println(); //espacio entre información
		instancia2.mostrarInformacionPlazoFijo(); //titular, cantidad, plazo
		
	}
}
