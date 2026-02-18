package logica;

public class Rey extends Ficha{

	public Rey(int posx, int posy) {
		super(posx, posy);
	}

	@Override
	public int mover() {
		if (posx == 8 &&(posy ==1 || posy==8) || posx == 1 &&((posy ==1 || posy==8))) {
			return 3;
		}
		if((posx == 1 || posx == 8)&&(posy != 1 || posy != 8)){
			return 5;
		}
		if((posy == 1 || posy == 8)&&(posx != 1 || posx != 8)){
			return 5;
		}
		return 8;
		
	}

}
