package arrays;

public class Practica004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		
		for (int i = 0; i < 20; i++) {
			numero[i] = (int) (Math.random()*101);
			cuadrado[i] = (int) (Math.pow(numero[i], 2));
			cubo[i] = (int) (Math.pow(numero[i], 3));
		}
		
		for (int j = 0; j < numero.length; j++) {
			System.out.println("Nemero " + numero[j] +" Cuadrado " + cuadrado[j] +" Cubo " + cubo[j]);
		}
		
		
	}

}
