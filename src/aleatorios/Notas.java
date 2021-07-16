package aleatorios;

public class Notas {
	
	public static void main (String[] args) {
		int nota = 0;
		int cont_suspenso = 0;
		int cont_suficiente = 0;
		int cont_bien = 0;
		int cont_notable = 0;
		int cont_sobresaliente = 0;
		for (int i = 1; i <= 20; i++) {
			nota = (int) (Math.random() * 5) +1;
			switch (nota) {
			case 1:
				System.out.println("Suspenso");
				cont_suspenso++;
				break;
			case 2:
				System.out.println("Sufieciente");
				cont_suficiente++;
				break;
			case 3:
				System.out.println("Bien");
				cont_bien++;
				break;
			case 4:
				System.out.println("Notable");
				cont_notable++;
				break;
			case 5:
				System.out.println("Sobresaliente");
				cont_sobresaliente++;
				break;
			default:
			}
		}
		System.out.println("Los suspenso fueron " + cont_suspenso);
		System.out.println("Los suficiente fueron " + cont_suficiente);
		System.out.println("Los bien fueron " + cont_bien);
		System.out.println("Los notable fueron " + cont_notable);
		System.out.println("Los sobresaliente fueron " + cont_sobresaliente);
	}
	
}
