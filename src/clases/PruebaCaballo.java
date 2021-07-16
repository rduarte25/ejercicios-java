/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author user
 */
public class PruebaCaballo {
    public static void main(String [] args){
        Caballo miCaballo = new Caballo(Sexo.MACHO, "marron", 15, true, 1.60, "TORNADO", "Rafael Duarte", "Mestizo");
        
        System.out.println(miCaballo.toString());
    }
}