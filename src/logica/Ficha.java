package logica;

public abstract class Ficha {
	protected int posx;
	protected int posy;
	
	public Ficha(int posx, int posy) {
		this.posx = posx;
		this.posy = posy;
	}

	public int getPosx() {
		return posx;
	}

	public void setPosx(int posx) {
		this.posx = posx;
	}

	public int getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}
	
	public abstract int mover();//Cantidad de espacios que se puede mover
	

}
