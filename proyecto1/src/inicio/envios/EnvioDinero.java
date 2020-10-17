package inicio.envios;

public class EnvioDinero extends Envio {

	private float importe;

	public EnvioDinero(int zona, float importe) {
		super(zona);
		this.importe = importe;

		switch (zona) {
		case 1:
			this.precio = PRECIO_ZONA_1;
			break;
		case 2:
			this.precio = PRECIO_ZONA_2;
			break;
		case 3:
			this.precio = PRECIO_ZONA_3;
			break;
		}
		this.enviable = true;

	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

}
