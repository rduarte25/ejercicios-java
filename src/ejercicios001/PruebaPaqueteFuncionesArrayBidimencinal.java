/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios001;

import funciones.FuncionesArrayBidimencional;

/**
 *
 * @author user
 */
public class PruebaPaqueteFuncionesArrayBidimencinal {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array_int = FuncionesArrayBidimencional.generaArrayBiInt(6, 10, 100, 150);
		for (int y = 0; y < array_int.length; y ++) {
                    for (int x = 0; x < array_int[0].length; x ++) {
                        System.out.print(array_int[y][x] + " ");
                    }
                    System.out.println();
		}
		
		System.out.println();
                int[] array_int_1 = FuncionesArrayBidimencional.filaDeArrayBiInt(array_int, 2);
                for (int i = 0; i < array_int_1.length; i++) {
                    System.out.print(array_int_1[i] + " ");
                }
		System.out.println();
                
                System.out.println();
                int[][] array_int_2 = FuncionesArrayBidimencional.columnaDeArrayBiInt(array_int, 2);
                for (int y = 0; y < array_int_2.length; y++) {
                     for (int x = 0; x < array_int_2[0].length; x++) {
                        System.out.println(array_int_2[y][x] + " ");
                    }
                }
		System.out.println();
                
                System.out.println();
                System.out.println(FuncionesArrayBidimencional.coordenadasEnArrayBiInt(array_int, 118));
                System.out.println();
                
                System.out.println();
                int [][] array_int_3 = new int [][] {
                	{60,70,80,90,100},
                	{50,51,52,53,54},
                	{40,41,42,43,44},
                	{30,31,32,33,34},
                	{20,21,22,23,24},
                };
                String esPuntoDeSilla = FuncionesArrayBidimencional.esPuntoDeSilla(array_int_3);
                System.out.println(esPuntoDeSilla);
                System.out.println();
                
                System.out.println();
                int[] diagonal = FuncionesArrayBidimencional.diagonal(array_int, 0,0, "nose");
                for (int x = 0; x < diagonal.length; x++) {
                	System.out.print(diagonal[x] + " ");
                }
                System.out.println();
                
                

	}
}
