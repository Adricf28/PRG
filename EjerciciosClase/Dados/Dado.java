
public class Dado {
	//Atributos
	private int	iValor;
	private int	iRango;
	
	//Metodos
	
	//Constructor
	public Dado () {
		
		iValor = 1;
		iRango = 6;
		
	}
	
	//Resto de metodos
	public int getValor() {
		return iValor;
	}
	
	public void lanzar() {
		iValor = (int)(Math.random()*iRango + 1);
	}
}
