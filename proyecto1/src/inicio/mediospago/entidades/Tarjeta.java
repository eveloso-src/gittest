package inicio.mediospago.entidades;

public class Tarjeta extends MedioDePago {

	private String numero; // 09090 9808 9877 9879
	private String vencimiento;
	private String titular;
	private String codigoSeguridad;
	private float recargoPorCiento;
	private float importeRecargo;

	public Tarjeta(float importe, String moneda, String numero) {
		super(importe, moneda);
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCodigoSeguridad() {
		return codigoSeguridad;
	}

	public void setCodigoSeguridad(String codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}

	public float getRecargoPorCiento() {
		return recargoPorCiento;
	}

	public void setRecargoPorCiento(float recargoPorCiento) {
		this.recargoPorCiento = recargoPorCiento;
	}

	public float getImporteRecargo() {
		return importeRecargo;
	}

	public void setImporteRecargo(float importeRecargo) {
		this.importeRecargo = importeRecargo;
	}

	@Override
	public boolean validar() {
		boolean resultado = true;
		// valida el numero
		// valada el importe
		return resultado;
	}
}
