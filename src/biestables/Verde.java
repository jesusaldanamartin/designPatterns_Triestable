package biestables;
import triestables.Verde_triestable;

public class Verde extends Estado {
	
	 	public Verde(Biestable biestable) {
			super(biestable);
			// TODO Auto-generated constructor stub
		}

	 	@Override
		public void abrir() {
			// TODO Auto-generated method stub
			super.bs.cambioColor(new Rojo(super.bs));
			
		}

		@Override
		public void cerrar() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String estado() {
			// TODO Auto-generated method stub
			return "Abierto";
		}
		
		@Override
		protected void cambio() {
			// TODO Auto-generated method stub
			super.bs.cambioColor(new Verde_triestable(super.bs));
		}
}

