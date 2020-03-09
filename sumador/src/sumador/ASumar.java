package sumador;

public class ASumar {
	
	String valorInicial;
	/**
	 * M�todo constructor para almacenar la variable
	 * @author Salvador Galindo Mart�nez
	 * @param string
	 * @version 1.0
	 */
	public ASumar(String string) {
		this.valorInicial = string;
	}
	
	/**
	 * M�todo que muestra una cadena de texto vac�a si el n�mero introducido
	 * es negativo.
	 * @author Luis Garcia Clavel
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