package aleatorios;

import java.util.Scanner;

public class ProgramaAdivino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num_alea = 0;
		Scanner entrada = new Scanner(System.in);
		String respuesta = "";
		int cont = 5;
		boolean logrado = false;
		while (logrado || cont >= 0) {
			cont--;
			System.out.println("Piensa el numero que voy a adivinar");
			num_alea = (int) (Math.random() * 101);
			System.out.println("El numero " + num_alea +" es mayor, menor o igual al que pensaste?, escribe tu respuesta como mayor, menor o igual");
			respuesta = entrada.nextLine();
			
			if (cont >= 0) {
				if (respuesta.equalsIgnoreCase("menor")) {
					System.out.println("Intentare de otra vez");
				} else if (respuesta.equalsIgnoreCase("mayor")) {
					System.out.println("Intentare de otra vez");
				} else if (respuesta.equalsIgnoreCase("igual")) {
					System.out.println("Si, lo logre");
				} else {
					System.out.println("Respuesta invalida");
				} 
			} else {
				System.out.println("Me jodi");
			}
			System.out.println(cont);
		}
	}

}
