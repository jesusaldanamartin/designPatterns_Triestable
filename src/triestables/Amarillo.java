package triestables;

import biestables.Biestable;
import biestables.Estado;

public class Amarillo extends Estado {

	public Amarillo(Biestable biestable) {
		super(biestable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		super.bs.cambioColor(new Verde_triestable(super.bs));
	}

	@Override
	public void cerrar() {
		// TODO Auto-generated method stub
		super.bs.cambioColor(new Rojo_triestable(super.bs));
	}

	@Override
	public String estado() {
		// TODO Auto-generated method stub
		return "Precaución";
	}

	@Override
	protected void cambio(){ }
}
