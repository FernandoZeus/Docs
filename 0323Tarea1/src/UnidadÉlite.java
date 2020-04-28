public class UnidadÉlite extends UnidadArmada{

	final String TIPO = "UnidadÉlite";
	
	boolean ToF = true;
	
	public String obtenerTipo(){
		
		return TIPO;
		
	}
	
	public UnidadÉlite(){
		
		vida=100;
		daño=20;
	
	}

	public boolean ataqueEfectivo() {
	
		return ToF;
	}
}