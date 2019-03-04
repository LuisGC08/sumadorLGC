package sumador;

public class ASumar {
	
	String valorInicial;
	/**
	 * Método constructor para almacenar la variable
	 * @author Salvador Galindo Martínez
	 * @param string
	 * @version 1.0
	 */
	public ASumar(String string) {
		this.valorInicial = string;
	}
	
	/**
	 * Método que mide la longitud de la variable introducida 
	 * y muestra el resultado
	 * @author Salvador Galindo Martínez
	 * @version 1.0
	 * @return devuelve el resultado correcto si cumple la condición y si no, 
	 * devuelve un mensaje de error
	 */
	public String mostrar() {
		String numero = valorInicial;
		if (numero.length() == 1) {
			return (numero + " = " + numero);
		}
		return ("Número incorrecto");
	}	
	
	/**
	 * Método que muestra una cadena de texto vacía si el número introducido
	 * es negativo.
	 * @author Salvador Galindo Martínez
	 * @version 1.0
	 * @return 
	 */
	public String mostrarNegativo() {
		String numero = valorInicial;
		if (Integer.parseInt(numero) > 0) {
			return (numero + " = " + numero);
		}else {
			return ("");
		}

	}
}
