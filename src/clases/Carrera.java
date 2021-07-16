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
public interface Carrera {
    public double velocidad_maxima = 120.0;
    
    public double velocidad_minima = 60.0;
    
    public double metros_corridos = 100;
    
    public String corre (double velocidad_maxima, double velocidad_minima, double metros_corredos);
}
