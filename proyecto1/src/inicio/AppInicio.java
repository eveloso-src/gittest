/*
 * Comentario de varias lineas
 * 
 * Esta una clase de inicio del curso java
 * 
 
 */

package inicio;

/**
 * JAVADOC: es una forma estandar de escribir documentacion para clase o metodo
 * 
 * @author
 *
 */
public class AppInicio {

	// comentario de una linea

	// metodo publico de nombre main con parametros.
	/**
	 * Metodo que inicia la aplicacion
	 * 
	 * @param args
	 */
	public static void main(String[] args) { // firma del metodo

		Bicicleta bici = new Bicicleta();
		Bicicleta bici2 = new Bicicleta();
		System.out.println("Velocidad actual: " + bici.getVelocidad());
		bici.acelerar(10);
		System.out.println("Velocidad actual: " + bici.getVelocidad());
		bici.frenar(20);
		System.out.println("Velocidad actual: " + bici.getVelocidad());
		bici.frenar(3);
		System.out.println("Velocidad actual: " + bici.getVelocidad());
		bici.detener();
		System.out.println("Velocidad actual: " + bici.getVelocidad());
		bici.frenar(4);
		System.out.println("Velocidad actual: " + bici.getVelocidad());
		bici.detener();
		System.out.println("Velocidad actual: " + bici.getVelocidad());

	}

}
