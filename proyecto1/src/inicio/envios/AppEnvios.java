package inicio.envios;

import java.util.Scanner;

public class AppEnvios {

	// Nuestro sistema ademas de enviar paquetes podra enviar cartas o dinero
	// Programar las clase necesarias para los diferentes servicios con sus
	// respectivos
	// metodos y atributos

	public static void main(String[] args) {
		Envio.bienvenida();
		int zona;
		int tipoEnvio;
		int peso;
		float precioTotal = 0;

		zona = solicitudZona();

		while (zona != 0) {
			tipoEnvio = obtenerTipoEnvio();

			switch (tipoEnvio) {
			case 1:
				peso = obtenerPeso();
				Carta carta = new Carta(zona, peso);
				precioTotal = carta.getPrecio();
				if (carta.isEnviable()) {
					System.out.println("El valor del envio es: " + precioTotal);
				} else {
					System.out.println("No se puede enviar ese peso");
				}

				break;
			case 2:
				peso = obtenerPeso();
				Paquete paquete = new Paquete(zona, peso);
				precioTotal = paquete.getPrecio();
				if (paquete.isEnviable()) {
					System.out.println("El valor del envio es: " + precioTotal);
				} else {
					System.out.println("No se puede enviar ese peso");
				}

				break;
			case 3:
				float importe = obtenerImporte();
				EnvioDinero envioDinero = new EnvioDinero(zona, importe);
				precioTotal = envioDinero.getPrecio();
				System.out.println("El valor del envio es: " + precioTotal);
				break;
			}
			zona = solicitudZona();
		}

	}

	private static float obtenerImporte() {
		System.out.println("Ingrese importe de dinero a enviar");
		Scanner sc = new Scanner(System.in);
		return sc.nextFloat();
	}

	private static int obtenerPeso() {
		System.out.println("Ingrese peso en gramos");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private static int obtenerTipoEnvio() {
		System.out.println("Ingrese tipo envio (1:Carta 2:Paquete 3:Dinero)");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private static int solicitudZona() {
		System.out.println("Ingrese zona de envio: 1:America 2:Europa 3:Asia 0:Salir");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private static float solicitarPesoEnvio() {
		System.out.println("Ingrese peso del envio: (0=Finalizar)");
		Scanner sc = new Scanner(System.in);

		return sc.nextFloat();
	}

}
