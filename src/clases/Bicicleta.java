package clases;

public class Bicicleta extends Vehiculo{
	
	Tiempo tiempo = new Tiempo();
	public String hacerCaballito () {
		if (this.isAndando()) {
			return "Estas andando sobre la ruda tracera";
		} else {
			return "No estas andando";
		}		
	}
	
	@Override
	public String andarVehiculo(){		
		this.setKilometrosRecorridos(this.getKilometrosRecorridos() + 5 /*kmPorTiempo ()*/);
		super.setKilometrosTotales(this.getKilometrosRecorridos());
		return super.andarVehiculo();
	}
	
	@Override
	public String pararVehiculo(){
		tiempo.Detener();
		return super.pararVehiculo();
	}
	
	double kilometros = 0;
	public int kmPorTiempo () {
		tiempo.Contar();
		kilometros = 1 * tiempo.getSegundos();
		System.out.println(tiempo.getSegundos());
		return (int) kilometros;
	}
}
