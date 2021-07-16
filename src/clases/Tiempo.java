package clases;

import java.util.Timer;
import java.util.TimerTask;

public class Tiempo {
	
	private Timer timer = new Timer();
	private int segundos = 0;
	
	class Contador extends TimerTask {

		@Override
		public void run() {
			segundos++;
			//System.out.println("segundos" + segundos);			
		}
		
	}
	
	public void Contar(){
		this.segundos = 0;
		timer = new Timer();
		timer.schedule(new Contador(), 0, 1000);
	}
	
	public void Detener() {
		timer.cancel();
	}
	
	public int getSegundos() {
		return this.segundos;
	}
}
