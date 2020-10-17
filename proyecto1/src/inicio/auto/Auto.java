package inicio.auto;

public class Auto {

	private static final int TOTAL_CAMBIOS = 5;

	private int cambio;
	private int velocidad;

	public int getCambio() {
		return cambio;
	}

	public void setCambio(int cambio) {
		this.cambio = cambio;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int acelerar(int masVelocidad) {
		int velocidadEsperada = velocidad + masVelocidad;

		if ((velocidadEsperada / 10) == cambio - 1) {
			velocidad = velocidadEsperada;
			System.out.println("Acelerar: Velocidad actualizada: " + velocidad);
		} else {
			System.out.println("No se puede acelerar con este cambio");
		}
		return velocidad;
	}

	public int frenar(int menosVelocidad) {
		int velocidadEsperada = velocidad - menosVelocidad;
		if ((velocidadEsperada / 10) == cambio - 1) {
			velocidad = velocidadEsperada;
			System.out.println("Frenar: Velocidad actualizada " + velocidad);
		} else {
			System.out.println("No se puede acelerar con este cambio");
		}
		return velocidad;
	}

	public void subirCambio() {
		this.cambio++;
	}

	public void bajarCambio() {
		this.cambio--;
	}

}
