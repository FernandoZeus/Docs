package FZO327Ejercicio2;

public interface IRobot {
	
	int vida = 100;
	
	public String getNombre();
	
	public int CalcularAtaque();
	
	public void RecibirAtaque(int DañoTotal);
	
	
	
}
