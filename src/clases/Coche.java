package clases;

public class Coche extends Vehiculo{
	
	Tiempo tiempo = new Tiempo();
	public String quemaRueda() {
		if (this.isAndando()) {
			return "Estas quemando ruda";
		} else {
			return "No estas andando ";
		}
	}
	
	@Override
	public String andarVehiculo(){		
		this.setKilometrosRecorridos(this.getKilometrosRecorridos() + 20 /*kmPorTiempo ()*/);
		super.setKilometrosTotales(this.getKilometrosRecorridos());
		return super.andarVehiculo();
	}
	
	@Override
	public String pararVehiculo(){
		tiempo.Detener();
		return super.pararVehiculo();
	}
	
	public int kmPorTiempo () {
		double kilometros = 0;
		tiempo.Contar();
		kilometros = 0.010 * tiempo.getSegundos();
		return (int) kilometros;
	}
}
