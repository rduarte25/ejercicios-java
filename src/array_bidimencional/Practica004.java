package array_bidimencional;

public class Practica004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array_numero = new int[5][6];
		for (int y = 0; y < (array_numero.length-1); y++) {
			for (int x = 0; x < (array_numero[0].length-1); x++) {
				array_numero[y][x] = (int)(Math.random()*900)+100;
			}			
		}
		int total_fila = 0;
		int[] total_columna = new int[array_numero[0].length];
		int total_total = 0;
		for (int y = 0; y < array_numero.length; y++) {
			for (int x = 0; x < array_numero[0].length; x++) {
				if (x < (array_numero[0].length-1)) {
					total_fila += array_numero[y][x];
					total_columna[x] += array_numero[y][x];
				} else if (x < array_numero[0].length) {
					array_numero[y][x] = total_fila;					
				} 
				
				if (y == (array_numero.length-1)) {
					array_numero[y][x] = total_columna[x];
				}
				
				if (y == (array_numero.length-1) && x == (array_numero[0].length-1)) {
					array_numero[y][x] = total_total;
				}
				
				System.out.print("|" + array_numero[y][x] + "|");
				
			}
			total_total += total_fila;
			total_fila = 0;
			System.out.println();
			
		}
	}

}
