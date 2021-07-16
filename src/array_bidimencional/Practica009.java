package array_bidimencional;

public class Practica009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array_numero = new int [12][12];
		for (int i = 0; i < array_numero.length; i++) {
			for (int j = 0; j < array_numero.length; j++) {
				array_numero[i][j] = (int)(Math.random()*101);
			}
		}
		
		for (int i = 0; i < array_numero.length; i++) {
			for (int j = 0; j < array_numero.length; j++) {
				System.out.print(array_numero[i][j] + " ");
			}
			System.out.println();
		}
		
		int [][] array_numero_aux_1 = new int[12][12];
		int aux_1 = 0;
		for (int i = (array_numero_aux_1.length-1); i >= 0; i--) {
			for (int j = (array_numero_aux_1[0].length-1); j >= 0; j--) {				
				if (i == (array_numero_aux_1.length-1) && j == (array_numero_aux_1[0].length-1)) {					
					aux_1 = array_numero[i][j];
					array_numero_aux_1[i][j] = array_numero[i][j-1];
				} else {
					if (j > 0 && j < (array_numero_aux_1.length)) {
						array_numero_aux_1[i][j] = array_numero[i][j-1];												
					}
					if (j == 0 && i != 0) {
						array_numero_aux_1[i][j] = array_numero[(i-1)][(array_numero[0].length-1)];
					}
					
					if (i == 0 && j == 0) {
						array_numero_aux_1[i][j] = aux_1;
					}
				}				
			}
		}
		
		System.out.println();
		System.out.println();		
		
		for (int i = 0; i < array_numero_aux_1.length; i++) {
			for (int j = 0; j < array_numero_aux_1.length; j++) {
				System.out.print(array_numero_aux_1[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
