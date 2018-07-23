package co.com.ceiba;

/**
 * Clase principal del sistema.
 * 
 * @author cristian.londono
 *
 */
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		int resultado = main.sumarNumeros(2, 2);
		System.out.println(resultado);
	}

	public int sumarNumeros(int primerNumero, int segundoNumero) {
		return primerNumero + segundoNumero;
	}

}
