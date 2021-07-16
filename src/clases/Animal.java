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
public abstract class Animal {
	private Sexo sexo;
	
	public Animal() {
		sexo = Sexo.MACHO;
	}
	
	public Animal(Sexo s) {
		sexo = s;
	}
	public Sexo getSexo () {
		return sexo;
	}
	
	public String toString() {
		return "Sexo: " + this.sexo + "\n";
	}
	
	public void duerme() {
		System.out.println("Zzzzzz");
	}
    
}
