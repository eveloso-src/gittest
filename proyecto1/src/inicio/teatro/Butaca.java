package inicio.teatro;

public class Butaca {

	private int numero;
	private int fila;
	private int col;
	private boolean ocupado;
	protected float precio;

	// constructor por defecto
	public Butaca() {
		this.ocupado = false;
	}

	public Butaca(int numero) {
		this.numero = numero;
		this.ocupado = false;
	}

	private Butaca(int numero, int fila, int col) {
		this.numero = numero;
		this.fila = fila;
		this.col = col;
		this.ocupado = false;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public static Butaca crear(int posicion, int fila2, int col2) {
		return new Butaca(posicion, fila2, col2);
	}

}
