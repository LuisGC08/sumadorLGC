package sumador;

public class SGMFunciona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ASumar ob1 = new ASumar("3");
		System.out.println(ob1.mostrar());
		
		ASumar ob2 = new ASumar("-7");
		System.out.println(ob2.mostrarNegativo());
		
		ASumar ob3 = new ASumar("2546");
		System.out.println(ob3.total());
	}

}
