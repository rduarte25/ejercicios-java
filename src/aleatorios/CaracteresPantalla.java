package aleatorios;

public class CaracteresPantalla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int caracter = 0;
		char letra = ' ';
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				caracter = (int) (Math.random() * 94) + 32;
				letra = (char) caracter;
				System.out.print(letra);
			}
			System.out.println();
		}
	}

}
