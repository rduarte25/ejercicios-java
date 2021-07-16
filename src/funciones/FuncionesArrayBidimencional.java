/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author user
 */
public class FuncionesArrayBidimencional {
    
    //Declaración de la función generaArrayInt.
    public static int[][] generaArrayBiInt(int tamagnoY, int tamagnoX, int intervalo_min, int intervalo_max) {
        int [][] array_int = new int [tamagnoY][tamagnoX];
        for (int y = 0; y < array_int.length; y++) {
                for (int x = 0; x < array_int[0].length; x++) {
                array_int[y][x] = (int) (Math.random() * (intervalo_max-intervalo_min)) + intervalo_min;
            }
        }
        return array_int;
    }
    
    //Declaracion de la funcion filaDeArrayBiInt.
    public static int[] filaDeArrayBiInt(int[][] array_int, int fila) {
        int[] array_int_aux = new int[array_int[0].length];
        for (int i = 0; i < array_int[0].length; i++) {
            array_int_aux[i] = array_int[fila][i];
        }
        return array_int_aux;
    }
    
    //Declaracion de la funcion columnaDeArrayBiInt.
    public static int[][] columnaDeArrayBiInt(int[][] array_int, int columna) {
        int[][] array_int_aux = new int[array_int.length][1];
        for (int y = 0; y < array_int.length; y++) {
            array_int_aux[y][0] = array_int[y][columna];
        }
        return array_int_aux;
    }
    
    //Declaracion de la funcion coordenadasEnArrayBiInt.
    public static String coordenadasEnArrayBiInt(int[][] array_int, int numero) {
        String coordenada = "";
        for (int y = 0; y < array_int.length; y++) {
            for (int x = 0; x < array_int[0].length; x++) {
                if (array_int[y][x] == numero) {
                    coordenada = "{" + y + ", " + x +"}";
                    break;
                } else {
                    coordenada = "{ -1, -1}";
                }            
            }
        }
        return coordenada;
    }
    
  //Declaracion de la funcion esPuntoDeSilla.
    public static String esPuntoDeSilla(int[][] array_int) {
        int min_fila = 0;
        int max_columna = 0;
        int cont_min_fila = 0;
        int cont_max_columna = 0;
        boolean min_fila_aux = false;
        boolean max_columna_aux = false;
        for (int y = 0; y < array_int.length; y++) {
            for (int x = 0; x < array_int[0].length; x++) {            	
            	min_fila = array_int[y][x];
                for (int i = 0; i < array_int[0].length; i++ ) {
                	if (min_fila < array_int[y][i]) {
                		cont_min_fila++;
                	}
                }
                
                if (cont_min_fila == (array_int[0].length-1)) {
                	min_fila_aux = true;
                }
                
                max_columna = array_int[y][x];
                for (int i = 0; i < array_int.length; i++ ) {
                	if (max_columna > array_int[i][x]) {
                		cont_max_columna++;
                	}
                }
                
                if (cont_max_columna == (array_int.length-1)) {
                	max_columna_aux = true;
                }
                             
                if (min_fila_aux && max_columna_aux) {
                	return "El número " + array_int[y][x] + " es punto de silla" + "{ " + y + " ," + x + "}";
                }
                min_fila_aux = false;
                max_columna_aux = false;
                cont_min_fila = 0;
                cont_max_columna = 0;   
            }
        }
        return "No se encontro ningún punto de silla";
    }
    
    //Declaracion de la funcion coordenadasEnArrayBiInt.
    public static int[] diagonal(int[][] array_int, int fila, int columna, String direccion) {
    	int[] array_int_aux = new int[array_int.length];
    	
    	switch(direccion) {
    	case "nose":
    		for (int i = columna; i < array_int.length; i++) {
    			if (fila != (array_int.length -1)) {
    				array_int_aux[(i-columna)] = array_int[(columna+i)][(fila+i)];
    			}        		
        	}
    		break;
    	case "neso":
    		for (int i = columna; i < array_int.length; i++) {
    			if (fila != 0) {
    				array_int_aux[(i-columna)] = array_int[(columna-i)][(fila-i)];
    			}        		
        	}
    		break;
    	default:
    	}
    	return array_int_aux;
    }
}
