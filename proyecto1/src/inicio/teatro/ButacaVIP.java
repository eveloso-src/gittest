package inicio.teatro;

public class ButacaVIP extends Butaca {

	private boolean incluyeBebida;

	public ButacaVIP(int posicion) {
		super(posicion);
		incluyeBebida = false;
	}

	public ButacaVIP(int posicion, boolean incluyeBebida) {
		super(posicion);
		this.incluyeBebida = incluyeBebida;
	}

	public boolean isIncluyeBebida() {
		return incluyeBebida;
	}

	public void setIncluyeBebida(boolean incluyeBebida) {
		this.incluyeBebida = incluyeBebida;
	}

	public float getPrecio() {
		if (incluyeBebida) {
			return precio * 1.5f;
		} else {
			return precio * 1.2f;
		}
	}

}
