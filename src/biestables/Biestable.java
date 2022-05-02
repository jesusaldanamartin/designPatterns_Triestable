package biestables;

public class Biestable {
	
	private Estado estado;
	
	public Biestable() {
		estado = new Rojo(this);
	}
	
	public void abrir() {
		estado.abrir();
	}

	public void cerrar() {
		estado.cerrar();
	}
	
	public String estado() {
		return estado.estado();
	}
	
	public void cambioColor(Estado state) {
		this.estado = state;
	}
	
	public void cambio() {
		this.estado.cambio();
	}
}

