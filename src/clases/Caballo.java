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
public class Caballo extends Animal implements Carrera{
    
    private String color;
    private int edad;
    private boolean herradura;
    private double altura;
    private String nombre;
    private String duegno;
    private String raza;

    public Caballo () {
        
    }
    
    public Caballo (Sexo sexo, String nombre)  {
        super(sexo);
        this.nombre = nombre;        
    }
    
    public Caballo (Sexo sexo,String color, int edad, boolean herradura, double altura, String nombre, String duegno, String raza) {
        super(sexo);
        this.color = color;
        this.edad = edad;
        this.herradura = herradura;
        this.altura = altura;
        this.nombre = nombre;
        this.duegno = duegno;
        this.raza = raza;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHerradura(boolean herradura) {
        this.herradura = herradura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuegno(String duegno) {
        this.duegno = duegno;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isHerradura() {
        return herradura;
    }

    public double getAltura() {
        return altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDuegno() {
        return duegno;
    }
    
    public String getRaza() {
    	return raza;
    }

    @Override
    public String toString() {
        return "Caballo{" + "color=" + color + ", edad=" + edad + ", herradura=" + herradura + ", altura=" + altura + ", nombre=" + nombre + ", duegno=" + duegno + '}';
    }    

    @Override
    public String corre(double velocidad_maxima, double velocidad_minima, double metros_corridos) {
        double tiempo_corrido = (Math.random()*10);
        double velocidad_maxima_aux = (Math.random() * velocidad_maxima) + velocidad_minima;
        String corre = "El caballo " + this.nombre + " corrio " + metros_corridos + " a una velocidad de " + velocidad_maxima_aux + "km en " + tiempo_corrido;
        return corre;
    }
    
    
    
}
