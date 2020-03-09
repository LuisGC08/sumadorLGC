package sumador;

public class ASumar {
	
	String valorInicial;
	/**
	 * M�todo constructor para almacenar la variable
	 * @author Luis Garcia Clavel
	 * @param string
	 * @version 1.0
	 */
	public ASumar(String string) {
		this.valorInicial = string;
	}
	
	/**
	 * M�todo que mide la longitud de la variable introducida 
	 * y muestra el resultado
	 * @return devuelve el resultado correcto si cumple la condici�n y si no, 
	 * devuelve un mensaje de error
	 */
	public String mostrar() {
		String numero = valorInicial;
		if (numero.length() == 1) {
			return (numero + " = " + numero);
		}
		return ("N�mero incorrecto");
	}	
	
	/**
	 * M�todo que muestra una cadena de texto vac�a si el n�mero introducido
	 * es negativo.
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
	
	/**
	 * M�todo que suma los digitos de un n�mero y muestra los n�meros sumados y el resultado de la suma
	 * @return 
	 */
	public String total() {
		int suma = 0;
		String fin = "";
		for(int i = 0; i < valorInicial.length(); i++) {
			String digito = valorInicial.substring(i, i+1);
			suma += Integer.parseInt(digito);
			if (i < 1) {
				fin += digito;
			}else {
				fin += " + " + digito;
			}
		}
		return (fin + " = " + suma);
	}
	
}
