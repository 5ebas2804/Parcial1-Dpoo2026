package presentacion;
import logica.Ficha;
import logica.Peon;
import logica.Rey;
import logica.Torre;

public class Principal {
	public Principal() {
		Ficha f;
		f = new Peon(1,7);
		System.out.println("El peon puede mover " + f.mover() + " casillas");
		
		f = new Rey(3,1);
		System.out.println("El rey puede mover " + f.mover() + " casillas");
		
		f = new Torre(3,1);
		System.out.println("La torre puede mover " + f.mover() + " casillas");
				
	}
	public static void main(String[] args) {
		new Principal();
	}

}
