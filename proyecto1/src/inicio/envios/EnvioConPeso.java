package inicio.envios;

public class EnvioConPeso extends Envio {

	public static int PESO_MAXIMO = 5000;

	private int peso;

	public EnvioConPeso(int zona, int peso) {
		super(zona);

		switch (zona) {
		case 1:
			this.precio = PRECIO_ZONA_1 * peso;
			break;
		case 2:
			this.precio = PRECIO_ZONA_2 * peso;
			break;
		case 3:
			this.precio = PRECIO_ZONA_3 * peso;
			break;
		}

		this.peso = peso;
		this.enviable = peso < PESO_MAXIMO;

	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
