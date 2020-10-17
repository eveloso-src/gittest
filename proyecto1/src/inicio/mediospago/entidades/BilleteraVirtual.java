package inicio.mediospago.entidades;

public class BilleteraVirtual extends MedioDePago {

	public BilleteraVirtual(float importe, String moneda) {
		super(importe, moneda);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validar() {
		// verificar usuario
		return false;
	}

}
