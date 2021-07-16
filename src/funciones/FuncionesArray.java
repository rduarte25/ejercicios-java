package funciones;

public class FuncionesArray {

    //Declaración de la función generaArrayInt.
    public static int[] generaArrayInt(int tamagno, int intervalo_min, int intervalo_max) {
            int [] array_int = new int [tamagno];
            for (int i = 0; i < array_int.length; i++) {
                    array_int[i] = (int) (Math.random() * (intervalo_max-intervalo_min)) + intervalo_min;
            }
            return array_int;
    }

    //Declaración de la función minimoArrayInt
    public static int minimoArrayInt(int[] array_int) {
            int num_min = array_int[0];
            for (int i = 0; i < array_int.length; i++) {
                    if (num_min > array_int[i]) {
                            num_min = array_int[i];
                    }
            }

            return num_min;
    }

    //Declaración de la función maximoArrayInt
    public static int maximoArrayInt(int[] array_int) {
            int num_max = array_int[0];
            for (int i = 0; i < array_int.length; i++) {
                    if (num_max < array_int[i]) {
                            num_max = array_int[i];
                    }
            }

            return num_max;
    }

    //Declaración de la función mediaArrayInt
    public static int mediaArrayInt(int[] array_int) {
            int media_num = 0;
            for (int i = 0; i < array_int.length; i++) {
                    media_num += array_int[i];
            }

            media_num = media_num / array_int.length;
            return media_num;
    }

    //Declaración de la función estaEnArrayInt
    public static boolean estaEnArrayInt(int[] array_int, int numero) {
            boolean estaEn = false;
            for (int i = 0; i < array_int.length; i++) {
                    if (array_int[i] == numero) {
                            estaEn = true;
                    }
            }
            return estaEn;
    }

    //Declaración de la función posicionEnArray
    public static int posicionEnArray(int[] array_int, int numero) {
            int posicion = 0;
            for (int i = 0; i < array_int.length; i++) {
                    if (array_int[i] == numero) {
                            posicion = i;
                    }
            }
            return posicion;
    }

    //Declaración de la función volteaArrayInt
    public static int[] volteaArrayInt(int[] array_int) {
            int[] array_int_aux = new int [array_int.length];
            for (int i = (array_int.length -1); i >= 0; i--) {
                    array_int_aux[((array_int.length -1) - i)] = array_int[i];
            }
            return array_int_aux;
    }

    //Declaración de la función rotaDerachaArrayInt
    public static int[] rotaDerechaArrayInt(int[] array_int, int posiciones) {
        int cont = 1;	
        while (cont <= posiciones) {
            int aux_1 = array_int[(array_int.length -1)];
            for (int i = (array_int.length -1); i >= 0; i--) {
                if (i >= 1) {
                    array_int[i] = array_int[(i-1)];
                } else if (i == 0) {
                    array_int[0] = aux_1;
                }                   
            }
            cont++;
        }
        return array_int;
    }
    
    //Declaración de la función rotaDerachaArrayInt
    public static int[] rotaIzquierdaArrayInt(int[] array_int, int posiciones) {
        int cont = 1;	
        while (cont <= posiciones) {
            int aux_1 = array_int[0];
            for (int i = 0; i <= (array_int.length -1); i++) {
                if (i < (array_int.length-1)) {
                    array_int[i] = array_int[(i+1)];
                } else if (i == (array_int.length-1)) {
                    array_int[i] = aux_1;
                }                   
            }
            cont++;
        }
        return array_int;
    }
}
