package arrays;

public class Practica010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_1 = new int[20];
		int cont_par = 0;
		int cont_impar = 0;
		for (int i = 0; i < array_1.length; i++) {
			array_1[i] = (int)(Math.random()*101);
		}
		for (int j = 0; j < array_1.length; j++) {
			if ((array_1[j] % 2) == 0) {
				cont_par++;
			} else {
				cont_impar++;
			}
		}
		int[] array_2 = new int[cont_par];
		int[] array_3 = new int[cont_impar];
		int cont_par_while = 0;
		int cont_impar_while = 0;
		
		for (int j = 0; j < array_1.length; j++) {			
			if ((array_1[j] % 2) == 0) {
				//System.out.println(" Resto" + (array_1[j] % 2));
				
				while (cont_par_while < array_2.length){					
					array_2[(cont_par_while)] = array_1[j];
					break;
				};
				cont_par_while++;
			}
		}
		
		for (int k = 0; k < array_1.length; k++) {
			
			if ((array_1[k] % 2) != 0) {
				//System.out.println(" Resto" + (array_1[k] % 2));
				while (cont_impar_while < array_3.length){					
					array_3[(cont_impar_while)] = array_1[k];
					break;
				};
				cont_impar_while++;
			}
		}
		
		for (int m = 0; m < array_2.length; m++) {
			array_1[m] = array_2[m];
		}
		
		for (int n = array_2.length; n < array_1.length; n++){
			array_1[n] = array_3[(n- array_2.length)];
		}
		
		for (int num: array_1) {
			System.out.println(num);
		}
	}

}
