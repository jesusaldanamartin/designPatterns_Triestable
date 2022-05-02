package triestables;

import biestables.Biestable;
import biestables.Rojo;
import biestables.Verde;

public class Rojo_triestable extends Rojo{

	public Rojo_triestable(Biestable bs) {
		super(bs);
	}
	
	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		bs.cambioColor(new Amarillo(bs));
		
	}
}


