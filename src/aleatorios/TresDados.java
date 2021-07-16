package aleatorios;

public class TresDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dado_1 = (int) (Math.random() * 6) +1;
		int dado_2 = (int) (Math.random() * 6) +1;
		int dado_3 = (int) (Math.random() * 6) +1;
		
		System.out.println("El dado 1 arrojo el: " + dado_1);
		System.out.println("El dado 2 arrojo el: " + dado_2);
		System.out.println("El dado 3 arrojo el: " + dado_3);
		System.out.println("La suma de todos los dados es: " + (dado_1 + dado_2 + dado_3));
	}

}
