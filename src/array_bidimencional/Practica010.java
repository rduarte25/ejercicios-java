package array_bidimencional;

import java.util.Scanner;

public class Practica010 {

	static final int VACIO = 0;	
	static final int X = 1;
	static final int O = 2;
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int x;
		int y;
		int [][] cuadrante = new int [3][3];
		
		for (x = 0; x < 3; x++) {
			for (y = 0; y < 3; y++) {
				cuadrante[x][y] = VACIO;
			}
		}
		
		System.out.println("Busca el tesoro!");
		boolean salir = false;
		String c = "";
		int cont_lleno = 0;
		
		do {
			for (y = 2; y >= 0; y--) {
				System.out.print(y + "|");
				for (x = 0; x < 3; x++) {
					if (cuadrante[x][y] == X) {
						System.out.print("X ");
						cont_lleno++;
						if (cont_lleno == 9) {
							salir = true;
						}
					} else if (cuadrante[x][y] == O) {
						System.out.print("O ");
						cont_lleno++;
						if (cont_lleno == 9) {
							salir = true;
						}
					}else{
						System.out.print("  ");
					}
				}
				System.out.println();
			}			
			System.out.println("---------\n 0 1 2\n");
			System.out.println("Truno de las X");
			System.out.print("Coordenada x: ");
			x = entrada.nextInt();
			System.out.print("Coordenada y: ");
			y = entrada.nextInt();
			
			switch(cuadrante[x][y]) {
			case VACIO:
				cuadrante[x][y] = X;
				break;
			case X:
				System.out.println("Lo siento la casilla tiene una: " + X);
				break;
			case O:
				System.out.println("Lo siento la casilla tiene una: " + O);
				break;
			default:
			}
			
			for (y = 2; y >= 0; y--) {
				System.out.print(y + "|");
				for (x = 0; x < 3; x++) {
					if (cuadrante[x][y] == X) {
						System.out.print("X ");
						cont_lleno++;
						if (cont_lleno == 9) {
							salir = true;
						}
					} else if (cuadrante[x][y] == O) {
						System.out.print("O ");
						cont_lleno++;
						if (cont_lleno == 9) {
							salir = true;
						}
					}else{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			
			for (y = (cuadrante.length-1); y >= 0; y--) {
				for (x = 0; x < (cuadrante[0].length-1); x++) {
					if (y == 0 && x == 0) {
						if (cuadrante[y][x] == X) {
							if (cuadrante[y+1][x+1] == X) {
								if (cuadrante[y+2][x+2] == X) {
									System.out.println("En linea diagonal");
									System.out.println("X gano");
									salir = true;
								}
							} else if (cuadrante[y+1][x] == X) {
								if (cuadrante[y+2][x] == X) {
									System.out.println("En linea vertical");
									System.out.println("X gano");
									salir = true;
								}
							} else if (cuadrante[y][x+1] == X) {
								if (cuadrante[y][x+2] == X) {
									System.out.println("En linea horizontal");
									System.out.println("X gano");
									salir = true;
								}
							}
						} else if (cuadrante[y][x] == O) {
							if (cuadrante[y+1][x+1] == O) {
								if (cuadrante[y+2][x+2] == O) {
									System.out.println("En linea diagonal");
									System.out.println("O gano");
									salir = true;
								}
							} else if (cuadrante[y+1][x] == O) {
								if (cuadrante[y+2][x] == O) {
									System.out.println("En linea vertical");
									System.out.println("O gano");
									salir = true;
								}
							} else if (cuadrante[y][x+1] == O) {
								if (cuadrante[y][x+2] == O) {
									System.out.println("En linea horizontal");
									System.out.println("O gano");
									salir = true;
								}
							}
						}
					}else if (y == 0 && x != 0) {
						if (cuadrante[y][x] == X) {
							if (cuadrante[y+1][x] == X) {
								if (cuadrante[y+2][x] == X) {
									System.out.println("En linea vertical");
									System.out.println("X gano");
									salir = true;
								}
							}
						} else if (cuadrante[y][x] == O) {
							if (cuadrante[y+1][x] == O) {
								if (cuadrante[y+2][x] == O) {
									System.out.println("En linea vertical");
									System.out.println("O gano");
									salir = true;
								}
							}
						}
					} else if (y == 0 && x == (cuadrante[0].length -1)) {
						if (cuadrante[y][x] == X) {
							if (cuadrante[y+1][x-1] == X) {
								if (cuadrante[y+2][x-1] == X) {
									System.out.println("En linea vertical");
									System.out.println("X gano");
									salir = true;
								}
							}
						} else if (cuadrante[y][x] == O) {
							if (cuadrante[y+1][x-1] == O) {
								if (cuadrante[y+2][x-1] == O) {
									System.out.println("En linea vertical");
									System.out.println("O gano");
									salir = true;
								}
							}
						}
					} else if (y != 0 && x == 0) {
						if (cuadrante[y][x+1] == X) {
							if (cuadrante[y][x+2] == X) {
								System.out.println("En linea horizontal");
								System.out.println("X gano");
								salir = true;
							}
						} else if (cuadrante[y][x+1] == O) {
							if (cuadrante[y][x+2] == O) {
								System.out.println("En linea horizontal");
								System.out.println("O gano");
								salir = true;
							}
						}
					}
				}
			}
			
			if (!salir) {
				System.out.println("Truno de las O");
				System.out.println("---------\n 0 1 2\n");
				System.out.print("Coordenada x: ");
				x = entrada.nextInt();
				System.out.print("Coordenada y: ");
				y = entrada.nextInt();
				
				switch(cuadrante[x][y]) {
				case VACIO:
					cuadrante[x][y] = O;
					break;
				case X:
					System.out.println("Lo siento la casilla tiene una: " + X);
					break;
				case O:
					System.out.println("Lo siento la casilla tiene una: " + O);
					break;
				default:
				}
			}			
			
		} while (!salir);
		entrada.close();
		
		for (y = 2; y >= 0; y--) {
			System.out.print(y + " ");
			for (x = 0; x < 3; x++) {
				switch(cuadrante[x][y]) {
				case VACIO:
					c = " ";
					break;
				case X:
					c = "X ";
					break;
				case O:
					c = "O ";
					break;
				default:
				}
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println("---------\n 0 1 2\n");
	}

}
