package ejercicios;
// hacer un recuadro con un caracter elegido

// y en linea del medio, centrado, escribir la palabra pasada por parametro
// El alto y el ancho del recuadro debe pasarse tambien por parametro

/*
 * 
 
 #############################################################
 #                                                           #
 #                                                           #
 #                                                           #
 #                         hola                              #
 #                                                           #
 #                                                           #
 #                                                           #
 #                                                           #
 #############################################################
 
 */

public class Ejercicio901PantallaMensaje {

	public static void main(String[] args) {
		int ancho = 60;
		int alto = 10;
		dibujarPantalla("mensaje", ancho, alto, '=');
	}

	private static void dibujarPantalla(String string, int ancho, int alto, char caracter) {

		int filaTexto = alto / 2;
		int espacios = ancho - string.length();
		int margen = espacios / 2;
		for (int fila = 0; fila < alto; fila++) {

			for (int col = 0; col < ancho; col++) {
				if (fila == 0 || fila == alto - 1) {
					System.out.print(caracter);
				} else {
					// filas intermedias
					if (col == 0 || col == ancho - 1) {
						System.out.print(caracter);

					} else {
						if (fila == filaTexto) {
							if (col < margen || col > margen + string.length() + 1) {
								System.out.print(" ");

							} else {

								int posicion = col - margen;
								if (posicion < string.length()) { // esto no se hace!!
									System.out.print(string.charAt(posicion));

								}
//								System.out.print(" ");
							}
						} else {
							System.out.print(" ");
						}
					}

				}
			}

			System.out.println();
		}

	}

}
