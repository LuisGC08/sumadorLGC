package sumador;

public class ASumar {
	
	String valorInicial;
	
	public ASumar(String string) {
		this.valorInicial = string;
	}
	
	
	public String mostrarNegativo() {
		String numero = valorInicial;
		if (Integer.parseInt(numero) > 0) {
			return (numero + " = " + numero);
		}else {
			return ("");
		}

	}
}