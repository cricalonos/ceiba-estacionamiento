package co.com.ceiba;

/**
 * Clase principal del sistema.
 * 
 * @author cristian.londono
 *
 */
public class Main {

	public static void main(String[] args) {
		Suma suma = new Suma();
		int resultado = suma.sumarNumeros(2, 2);
		System.out.println(resultado);
	}

}
