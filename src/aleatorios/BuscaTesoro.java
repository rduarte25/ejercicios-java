package aleatorios;

import java.util.Scanner;

public class BuscaTesoro {
	
	static final int VACIO = 0;
	static final int MINA = 1;
	static final int TESORO = 2;
	static final int INTENTO = 3;
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int x;
		int y;
		int [][] cuadrante = new int [5][4];
		
		for (x = 0; x < 4; x++) {
			for (y = 0; y < 3; y++) {
				cuadrante[x][y] = VACIO;
			}
		}
		
		int minaX = (int)(Math.random()*4);
		int minaY = (int)(Math.random()*3);
		cuadrante[minaX][minaY] = MINA;
		
		int tesoroX;
		int tesoroY;
		
		do {
			tesoroX = (int)(Math.random()*4);
			tesoroY = (int)(Math.random()*4);
		} while ((minaX == tesoroX) && (minaY == tesoroY));
		cuadrante[tesoroX][tesoroY] = TESORO;
		
		System.out.println("Busca el tesoro!");
		boolean salir = false;
		String c = "";
		do {
			for (y = 3; y >= 0; y--) {
				System.out.print(y + "|");
				for (x = 0; x < 5; x++) {
					if (cuadrante[x][y] == INTENTO) {
						System.out.print("X ");
					} else{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			System.out.println("---------\n 0 1 2 3 4\n");
			System.out.print("Coordenada x: ");
			x = entrada.nextInt();
			System.out.print("Coordenada y: ");
			y = entrada.nextInt();
			
			switch(cuadrante[x][y]) {
			case VACIO:
				cuadrante[x][y] = INTENTO;
				break;
			case MINA:
				System.out.println("Lo siento haz perdido.");
				salir = true;
				break;
			case TESORO:
				System.out.println("Enbuenahora, haz encontrado el tesoro.");
				salir = true;
				break;
			default:
			}
		} while (!salir);
		
		for (y = 3; y >= 0; y--) {
			System.out.println(y + " ");
			for (x = 0; x < 5; x++) {
				switch(cuadrante[x][y]) {
				case VACIO:
					c = " ";
					break;
				case MINA:
					c = "* ";
					break;
				case TESORO:
					c = "$ ";
					break;
				case INTENTO:
					c = "x ";
					break;
				default:
				}
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println("---------\n 0 1 2 3 4\n");
	}
}