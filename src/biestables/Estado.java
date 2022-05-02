package biestables;

public abstract class Estado {
	
	protected Biestable bs;
	
	public Estado(Biestable biestable) {
		this.bs = biestable;
	}
	public abstract void abrir();
	public abstract void cerrar();
	public abstract String estado();
	
	protected abstract void cambio();
	
}


