package aleatorios;

public class LineaAleatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			char caracter = ' ';
			int caract = (int) (Math.random() * 6) +1;
			switch (caract) {
			case 1:
				caracter = '*';
				break;
			case 2:
				caracter = '-';
				break;
			case 3:
				caracter = '=';
				break;
			case 4:
				caracter = '.';
				break;
			case 5:
				caracter = '|';
				break;
			case 6:
				caracter = '@';
				break;
			}
			
			int longitud = (int) (Math.random() *40) +1;
			for (int j = 0; j <= longitud; j++) {
				System.out.print(caracter);
			}
			System.out.println();
		}
	}

}
