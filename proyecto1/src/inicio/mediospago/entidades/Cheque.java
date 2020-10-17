package inicio.mediospago.entidades;

public class Cheque extends MedioDePago {

	private String numero;
	private String librador;
	private String banco;

	public Cheque(float importe, String moneda, String numero) {
		super(importe, moneda);
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getLibrador() {
		return librador;
	}

	public void setLibrador(String librador) {
		this.librador = librador;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	@Override
	public boolean validar() {
		// verificar fecha
		// verificar numero
		return true;
	}
}
