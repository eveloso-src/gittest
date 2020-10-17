package inicio.mediospago.entidades;

public class Efectivo extends MedioDePago {

	public Efectivo(float importe, String moneda) {
		super(importe, moneda);
	}

	@Override
	public boolean validar() {

		return true;
	}

}
