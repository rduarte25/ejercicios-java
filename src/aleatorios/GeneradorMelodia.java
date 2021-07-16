package aleatorios;

public class GeneradorMelodia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota;
		String nota_musical = "";
		int cont = 0;
		int longitud_melodia;
		String nota_final = "";
		do {
			longitud_melodia = (int) (Math.random()*24) + 4;
		} while ((longitud_melodia % 4) != 0);
		
		for (int j = 1; j <= longitud_melodia; j++) {
			nota = (int) (Math.random()*7) +1;
			cont++;
			switch (nota) {
			case 1:
				nota_musical = "DO";
				break;
			case 2:
				nota_musical = "RE";
				break;
			case 3:
				nota_musical = "MI";
				break;
			case 4:
				nota_musical = "FA";
				break;
			case 5:
				nota_musical = "SOL";
				break;
			case 6:
				nota_musical = "LA";
				break;
			case 7:
				nota_musical = "SI";
				break;
			default:
			}
			
			if (cont == 1) {
				nota_final = nota_musical;
			} else if (cont == longitud_melodia) {
				nota_musical = nota_final;
			}
			
			System.out.print(nota_musical + " ");
			if ((cont % 4) == 0) {
				System.out.print("|");
				if (longitud_melodia == cont) {
					System.out.print("|");
				}
			}
			
			
		}
		System.out.print(" ");
		
	}

}
