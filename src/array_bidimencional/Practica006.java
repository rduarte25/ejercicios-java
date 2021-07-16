package array_bidimencional;

public class Practica006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int[][] array_numero = new int [6][10];
		for (int y = 0; y < array_numero.length; y++) {
			for (int x = 0; x < array_numero[0].length; x++) {
				array_numero[y][x] = (int)(Math.random()*1001);
				for (int i = 0; i < array_numero.length; i++) {
					for (int j = 0; j < array_numero[0].length; j++) {
						if (array_numero[i][j] != 0) {
							if (array_numero[i][j] == array_numero[y][x]) {
								array_numero[y][x] = (int)(Math.random()*1001);
							}
						}
						
					}
				}
				
			}
		}
		int min = 0;
		int max = 0;
		for (int y = 0; y < array_numero.length; y++) {
			for (int x = 0; x < array_numero[0].length; x++) {
				if (min == 0) {
					min = array_numero[y][x];
				}
				if (max == 0) {
					min = array_numero[y][x];
				}
				
				if (min >  array_numero[y][x]) {
					min = array_numero[y][x];
				}
				
				if (max <  array_numero[y][x]) {
					max = array_numero[y][x];
				}
				
			}
		}
		
		String posicion_min = "";
		String posicion_max = "";
		for (int y = 0; y < array_numero.length; y++) {
			for (int x = 0; x < array_numero[0].length; x++) {
				System.out.print(array_numero[y][x] + " ");
				if (min == array_numero[y][x]) {
					posicion_min = "El minimo esta en la posición: " + y + "-" + x;
				}
				
				if (max == array_numero[y][x]) {
					posicion_max = "El maximo esta en la posición: " + y + "-" + x;
				}
				
			}
			System.out.println();
		}
		
		System.out.println(posicion_min);
		System.out.println(posicion_max);
	}

}
