package inicio.envios;

public class Envio {

	public static float PRECIO_ZONA_1 = 10;
	public static float PRECIO_ZONA_2 = 20;
	public static float PRECIO_ZONA_3 = 30;

	protected int zona;
	protected boolean enviable;
	protected float precio;

	public Envio(int zona) {
		this.zona = zona;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public boolean isEnviable() {
		return enviable;
	}

	public void setEnviable(boolean enviable) {
		this.enviable = enviable;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public static Envio crear() {
		Envio paq = new Envio(0);
		System.out.println("Paquete creado con peso 0");
		return paq;
	}

	public static void bienvenida() {
		System.out.println("Sistema de envios");
		System.out.println();
	}

}
