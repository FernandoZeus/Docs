package FZO327Ejercicio2;

public class CampoBatalla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	IRobot  uno = new CrearRobot("fulano");
	
	IRobot dos = new CrearRobot(" mengano ");
	
	
	dos.RecibirAtaque(uno.CalcularAtaque());
	

	
	uno.RecibirAtaque(dos.CalcularAtaque());
	}

}
