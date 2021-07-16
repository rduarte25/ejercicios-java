package aleatorios;

public class NmerosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0;
		int num_alea = 0;
		do {
			num_alea = (int) (Math.random()* 101);
			cont++;
			System.out.println(num_alea + " ");
		} while (num_alea != 24);
		System.out.println("El programa arrojo " + cont + " numeros.");
		
	}

}
