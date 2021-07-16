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
public class Vehiculo {
	
	private int num_rudas = 0;
	private int vehiculosCreados = 0;
	private static double kilometrosTotales = 0;
	private double kilometrosRecorridos = 0;
	private boolean  andando = false;
	
	public boolean isAndando() {
		return andando;
	}

	public void setAndando(boolean andando) {
		this.andando = andando;
	}

	public String andarVehiculo () {
		andando = true;
		return "El vehiculo esta andando";
	}
	
	public String pararVehiculo () {
		andando = false;
		return "El vehiculo esta parado";
	}

	public int getNum_rudas() {
		return num_rudas;
	}

	public void setNum_rudas(int num_rudas) {
		this.num_rudas = num_rudas;
	}

	public int getVehiculosCreados() {
		return vehiculosCreados;
	}

	public void setVehiculosCreados(int vehiculosCreados) {
		this.vehiculosCreados = vehiculosCreados;
	}

	public static double getKilometrosTotales() {
		return kilometrosTotales;
	}

	public void setKilometrosTotales(double kilometrosTotales) {
		Vehiculo.kilometrosTotales = kilometrosTotales;
	}

	public double getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	public void setKilometrosRecorridos(double kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}
}
