package sumador;

public class ASumar {
	
	String valorInicial;
	/**
	 * Método constructor para almacenar la variable
	 * @author Luis Garcia Clavel
	 * @param string
	 * @version 1.0
	 */
	public ASumar(String string) {
		this.valorInicial = string;
	}
	
	/**
	 * Método que mide la longitud de la variable introducida 
	 * y muestra el resultado
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
}