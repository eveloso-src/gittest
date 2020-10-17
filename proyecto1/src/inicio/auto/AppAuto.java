package inicio.auto;

/*
 * Programar la clase auto que contenga:
 * Tiene 5 velocidades y para hacer un cambio 
 * debo tener la velocidad adecuada.
 * 0 -> cambio = 0
 * 1-10 -> numeroCambio = 1
 * 11-20 -> numeroCambio = 2
 * 21-30 -> numeroCambio = 3
 * 31-40 -> numeroCambio = 4
 * 41+ -> numeroCambio = 5
 * 
 * int numeroCambio
 * int velocidad
 * 
 * Programar getters y setters segun sea necesario
 * Y los metodos acelerar, frenar segun sea posible
 * validando las posibilidades y metodos 
 * subirCambio y bajarCambio
 * 
 * Proceso: subirCambio y luego acelerar validando
 * la velocidad
 * 
 * 
 */

public class AppAuto {

	public static void main(String[] args) {

		if (args != null && args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}

		System.out.println("Se construye un auto marca: " + args[0]);
		Auto a1 = new Auto();
		a1.subirCambio();
		a1.acelerar(9);
		a1.acelerar(40);
		a1.subirCambio();
		a1.acelerar(8);
		a1.bajarCambio();
		a1.frenar(8);

	}

}
