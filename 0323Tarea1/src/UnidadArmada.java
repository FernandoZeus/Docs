public abstract class UnidadArmada{
	
	int vida;
	int daño;

	public abstract String obtenerTipo();
	
	public String toString(){
		
		return obtenerTipo() + " v: " + vida;
	
	}
	
	public abstract boolean ataqueEfectivo();
	
	public void atacar (Object unidadAtacada ){//fulanito.atacar(batallon); estamos diciendo que fulanito ataque a batallon (unidadAtacada)
		
		//unidadAtacada llama a metodo toString
		unidadAtacada.toString();
		
	}
	
	public boolean  estaViva( int vida ){
		
			if (vida > 0 ){
				
				return true;
			
			}else {
				
				return false;
				
			}
	
	}
}