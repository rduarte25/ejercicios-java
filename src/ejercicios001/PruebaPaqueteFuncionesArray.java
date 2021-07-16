package ejercicios001;

import funciones.FuncionesArray;

public class PruebaPaqueteFuncionesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array_int = FuncionesArray.generaArrayInt(10, 100, 150);
		for (int i = 0; i < array_int.length; i ++) {
			System.out.println(array_int[i]);
		}
		
		System.out.println();
		System.out.println(FuncionesArray.minimoArrayInt(array_int));
		
		System.out.println();
		System.out.println(FuncionesArray.maximoArrayInt(array_int));
		
		System.out.println();
		System.out.println(FuncionesArray.mediaArrayInt(array_int));
		
		System.out.println();
		System.out.println(FuncionesArray.estaEnArrayInt(array_int, 110));
		
		System.out.println();
		System.out.println(FuncionesArray.posicionEnArray(array_int, 110));
		
		System.out.println();
		int[] array_int_1 = FuncionesArray.volteaArrayInt(array_int);
		
		for (int i = 0; i < array_int_1.length; i ++) {
			System.out.println(array_int_1[i]);
		}
                
                System.out.println();
		int[] array_int_2 = FuncionesArray.rotaDerechaArrayInt(array_int, 5);
		
		for (int i = 0; i < array_int_2.length; i ++) {
			System.out.println(array_int_2[i]);
		}
                
                System.out.println();
		int[] array_int_3 = FuncionesArray.rotaIzquierdaArrayInt(array_int, 5);
		
		for (int i = 0; i < array_int_3.length; i ++) {
			System.out.println(array_int_3[i]);
		}
	}

}
