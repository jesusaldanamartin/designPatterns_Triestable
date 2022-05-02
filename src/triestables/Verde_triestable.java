package triestables;

import biestables.Biestable;
import biestables.Rojo;
import biestables.Verde;

public class Verde_triestable extends Verde {
	
	public Verde_triestable(Biestable bs) {
		super(bs);
	}
	
	@Override
	public void cerrar() {
		// TODO Auto-generated method stub
		bs.cambioColor(new Amarillo(bs));
		
	}
}


