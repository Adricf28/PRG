
public class DadosSinPoo {
	//DECLARACION DE VARIABLES ESTATICAS
	static final int RANGO = 6;
	static final String GANA1 = "Ha ganado el jugador 1";
	static final String GANA2 = "Ha ganado el jugador 2";
	static final String EMPATE = "Han empatado";
	
	public static void main(String[] args) {
		//DECLARACION DE VARIABLES
		int valor1, valor2, valor3, valor4, suma1, suma2;
		int i = 0;
		int numJuegos = (int)(Math.random() * 10 + 1);

		//BUCLE PARA JUGAR UN NUMERO DE VECES RANDOM ENTRE 1 Y 10
		System.out.printf("VAMOS A JUGAR %d VECES.\n", numJuegos);
		while (i < numJuegos)
		{
			//ASIGNACION DE VARIABLES
			valor1 = (int)(Math.random() * RANGO + 1);
			valor2 = (int)(Math.random() * RANGO + 1);
			valor3 = (int)(Math.random() * RANGO + 1);
			valor4 = (int)(Math.random() * RANGO + 1);
			
			suma1 = valor1 + valor2;
			suma2 = valor3 + valor4;

			System.out.printf("Valor1: %d\nValor2: %d\nValor3: %d\nValor4: %d\n", valor1, valor2, valor3, valor4);

			//COMPROBACIONES
			if ((valor1 == 6 || valor2 == 6) && (valor3 != 6 && valor4 != 6)) { //J1 tiene algun 6 y J2 no, gana J1
				System.out.println(GANA1 + "\n");
			} 
			else if ((valor1 != 6 && valor2 != 6) && (valor3 == 6 || valor4 == 6)) { //J2 tiene algun 6 y J1 no, gana J2
				System.out.println(GANA2 + "\n");
			}
			else if (suma1 > suma2) { //Si J1 tiene mas puntos totales gana J1
				System.out.println(GANA1 + "\n");
			} 
			else if (suma1 < suma2) { //Si J2 tiene mas puntos totales gana J2
				System.out.println(GANA2 + "\n");
			} 
			else { //Si nada de lo de arriba se cumple, es porque han empatado
				System.out.println(EMPATE + "\n");
			}

			i++;
		}
	}
}