package sumador;

public class ASumar {
	
	String valorInicial;
	
	public ASumar(String string) {
		this.valorInicial = string;
	}
	
	public String mostrar() {
		String numero = valorInicial;
		if (numero.length() == 1) {
			return (numero + " = " + numero);
		}
		return ("Número incorrecto");
	}
}