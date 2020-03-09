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
	
	
	public String mostrarNegativo() {
		String numero = valorInicial;
		if (Integer.parseInt(numero) > 0) {
			return (numero + " = " + numero);
		}else {
			return ("");
		}
	}
	
	
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
