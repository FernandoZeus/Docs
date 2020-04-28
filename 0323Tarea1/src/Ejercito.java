
public class Ejercito extends UnidadArmada{

	protected String nombre;
	
	protected  int cantidad;
	
	public Ejercito(String nombre , int cantidad) {
		
		this.nombre=nombre;
		
		this.cantidad= cantidad;
	}

	
	public String obtenerTipo() {
		
		return null;
	}

	@Override
	public boolean ataqueEfectivo() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
