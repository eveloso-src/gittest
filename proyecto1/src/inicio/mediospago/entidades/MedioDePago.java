package inicio.mediospago.entidades;

public abstract class MedioDePago {

	public static int CODIGO_PAGO_EFECTIVO = 1;
	public static int CODIGO_PAGO_TARJETA = 2;
	public static int CODIGO_PAGO_CHEQUE = 3;

	private float importe;
	private String moneda; // ARS -USD - EUR -RBR - PCH - PBL - PUR
	private int id;

	public MedioDePago(float importe, String moneda) {
		this.importe = importe;
		this.moneda = moneda;
	}

	public abstract boolean validar();

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

}
