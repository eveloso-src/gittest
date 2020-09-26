package calculadora;

/*
 * Generar la clase Bicicleta con un atributo velocidad y un metodo acelarar con parametro
 * nuevaVelocidad que sea asignado al atributo velocidad
 */
public class Bicicleta {

	private int velocidad;

	public int acelerar(int nuevaVelocidad) {
		velocidad = nuevaVelocidad;
		return velocidad;
	}

}
