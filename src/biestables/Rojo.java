package biestables;
import triestables.Rojo_triestable;

public class Rojo extends Estado {

	public Rojo(Biestable biestable) {
		super(biestable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		super.bs.cambioColor(new Verde(super.bs));
		
	}

	@Override
	public void cerrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String estado() {
		// TODO Auto-generated method stub
		return "Cerrado";
	}

	@Override
	protected void cambio() {
		// TODO Auto-generated method stub
		super.bs.cambioColor(new Rojo_triestable(super.bs));

	}
}
