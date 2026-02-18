package logica;

public class Peon extends Ficha{

	public Peon(int posx, int posy) {
		super(posx, posy);
	}

	@Override
	public int mover() {
		if (posy == 2) {
			return 2;
		}
		if(posy == 8) {
			return 0;
		}
		return 1;
	}
	
}
