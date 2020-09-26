package ejercicios;

import java.util.Scanner;

public class Ejercicio203Lapices {

	private static final int PRECIO_MIN = 90;
	private static final int PRECIO_MAY = 85;
	private static final int CANT_LIMITE = 1000;

	public static void main(String[] args) {
		// de 1000 en adelante precio 85
		// sino precio es 90
		// solicitar cantidad de lapices
		// informar el total

		// DEBUG
		Scanner sc = new Scanner(System.in);
		int vector[] = new int[4];
		int vector2[] = { 1, 2, 1, 1 };

		System.out.println(vector);
		System.out.println(vector2);

		System.out.println("Ingrese la cantidad de lapices a comprar");
		int lapices = sc.nextInt();
		sc.close();
		int total = 0;
		if (lapices < CANT_LIMITE) {
			total = lapices * PRECIO_MIN;
		} else {
			total = lapices * PRECIO_MAY;
		}

		System.out.println("El total es: " + total);

	}
}
