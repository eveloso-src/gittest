package inicio.teatro;

import java.util.Scanner;

//Se venden boletos de una funcion numerados del 0-49. Cada uno de esos boletos
//se corresponde con una butaca que tiene fila y columna.
//Solicitar que asiento elige la persona al  comprarlo y marcarlo (de alguna manera)
//Se ingresan valores de fila hasta que se ingrese fila 0
//Listar los asientos vendidos

public class AppTeatro {

	private static final int TOTAL_BUTACAS = 50;

	public static void main(String[] args) {

		Butaca[] butacas = new Butaca[50];

		for (int i = 0; i < TOTAL_BUTACAS; i++) {
			butacas[i] = new Butaca(i + 1);
		}

		int posicion = solicitarPosicion("posicion");
		int col;
		int fila;
		Butaca butaca;
		while (posicion != 99) {
			fila = solicitarPosicion("fila");
			col = solicitarPosicion("columna");
			butaca = Butaca.crear(posicion, fila, col);
			ButacaVIP butacaVip = new ButacaVIP(posicion);
			ButacaVIP butacaVip2 = new ButacaVIP(posicion, true);
			butacaVip.setCol(col);
			butacaVip.setFila(fila);

			if (butacas[posicion].isOcupado()) {
				System.out.println("Butaca ya vendida");
			} else {
				butaca.setOcupado(true);
				butacas[posicion] = butaca;
				System.out.println("Butaca confirmada");
			}

			posicion = solicitarPosicion("posicion");
		}
		for (int j = 0; j < butacas.length; j++) {
			if (butacas[j].isOcupado()) {
				System.out.println("Butaca ocupada numero " + butacas[j].getNumero());
			}
		}

	}

	private static int solicitarPosicion(String x) {
		System.out.println("Ingrese el numero de " + x + " (Fin=99)");
		Scanner sc = new Scanner(System.in);

		return sc.nextInt();
	}

}
