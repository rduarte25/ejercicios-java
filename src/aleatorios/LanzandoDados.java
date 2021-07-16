package aleatorios;

public class LanzandoDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dado_1 = 0;
		int dado_2 = 0;
		do {
			dado_1 = (int) (Math.random() * 6) +1;
			dado_2 = (int) (Math.random() * 6) +1;
			System.out.println("El dado 1 arrajo" + dado_1);
			System.out.println("El dado 2 arrajo" + dado_2);
		} while(dado_1 != dado_2);
	}

}
