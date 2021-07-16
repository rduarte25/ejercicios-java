package funciones;

public class Matematicas {
	
	public static boolean esCapicua (int numero) {
		int aux = numero;
		int inverso = 0;
		int cifra = 0;
		boolean esCapicua = false;
		while(aux != 0) {
			cifra = aux % 10;
			inverso = inverso * 10 + cifra;
			aux = aux / 10;
		}
		
		if (numero == inverso) {
			esCapicua = true;
		}
		
		return esCapicua;
	}
	
	public static boolean esPrimo(int numero) {
		int cont = 0;
		boolean esPrimo = false;
		for(int i = 1; i <=numero; i++) {
			if ((numero % i) == 0) {
				cont++;				
			}		
		}
		
		if (cont <= 2) {
			esPrimo = true;
		}
		return esPrimo;		
	}
	
	public static int siguientePrimo(int numero) {
		int siguiente_numero = numero + 1;
		while (!esPrimo(siguiente_numero)) {
			siguiente_numero++;
		}
		return siguiente_numero;
	}
	
	public static int potencia (int base, int exponente) {
		if (exponente == 0) {
			base = 0;
		} else {
			int[] array_aux = new int[exponente];
			for (int i = 0; i < array_aux.length; i++) {
				array_aux[i] = base;
			}
			for (int i = 1; i <= array_aux.length; i++) {
				if (exponente == 1) {
					base = base * 1;
				} else {
					if (i == 1) {
						base = array_aux[(i-1)] * array_aux[(i)];
					} else if (i <= (array_aux.length-1)) {
						base = base * array_aux[i];
					}
				}				
			}
		}		
		return base;		
	}
	
	public static int digitos (int numero) {
		return Integer.toString(numero).length();
	}
	
	public static int voltea (int numero) {
		int aux = numero;
		int inverso = 0;
		int cifra = 0;
		while(aux != 0) {
			cifra = aux % 10;
			inverso = inverso * 10 + cifra;
			aux = aux / 10;
		}
		return inverso;
	}
	
	public static int digitoN (int numero, int posicion) {
		String numero_aux = Integer.toString(numero);
		char numero_aux_1 = numero_aux.charAt(posicion);
		
		return Integer.parseInt(numero_aux_1+"");
	}
	
	public static int posicionDeDigito (int numero, int digito) {
		String numero_aux = Integer.toString(numero);
		String digito_aux = Integer.toString(digito);
		int posicion = 0;
		for (int i = 0; i < numero_aux.length(); i++) {
			if (digito_aux.equalsIgnoreCase(""+numero_aux.charAt(i))) {
				posicion = i;
			}
		}
		return posicion;
	}
	
	public static int quitaPorDetras(int numero) {
		String numero_aux = Integer.toString(numero);
		String numero_aux_1 = "";
		for (int i = 0; i < (numero_aux.length() -1); i++) {
			numero_aux_1 += numero_aux.charAt(i);
		}
		return Integer.parseInt(numero_aux_1);
	}
	
	public static int quitaPorDelante(int numero) {
		String numero_aux = Integer.toString(numero);
		String numero_aux_1 = "";
		for (int i = 0; i < (numero_aux.length() -1); i++) {
			numero_aux_1 += numero_aux.charAt(i +1);
		}
		return Integer.parseInt(numero_aux_1);
	}
	
	public static int pegaPorDetras(int numero, int digito) {
		String numero_aux = Integer.toString(numero);
		String digito_aux = Integer.toString(digito);
		return Integer.parseInt(numero_aux+digito_aux);
	}
	
	public static int pegaPorDelante(int numero, int digito) {
		String numero_aux = Integer.toString(numero);
		String digito_aux = Integer.toString(digito);
		return Integer.parseInt(digito_aux + numero_aux);
	}
	
	public static int trozoDeNumero (int numero, int posicion_inicial, int posicion_final) {
		String numero_aux = Integer.toString(numero);
		String numero_aux_1 = numero_aux.substring(posicion_inicial, posicion_final);
		return Integer.parseInt(numero_aux_1);
	}
	
	public static int juntaNumeros (int numero_1, int numero_2) {
		String numero_1_aux = Integer.toString(numero_1);
		String numero_2_aux = Integer.toString(numero_2);
		return Integer.parseInt(numero_1_aux + numero_2_aux);
	}
}
