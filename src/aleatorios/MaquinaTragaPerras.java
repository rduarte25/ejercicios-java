package aleatorios;

public class MaquinaTragaPerras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String figura_1 = figura (((int) (Math.random() * 5) +1));
		String figura_2 = figura (((int) (Math.random() * 5) +1));
		String figura_3 = figura (((int) (Math.random() * 5) +1));
		System.out.println(figura_1 + " " + figura_2 + " " + figura_3);
		if (figura_1.equals(figura_2) && figura_2.equals(figura_3)) {
			System.out.println("Enhorabuena, ha ganado 10 monedas");
		} else if (figura_1.equals(figura_2) || figura_1.equals(figura_3) || figura_2.equals(figura_3)) {
				System.out.println("Bien a recuperado su moneda");
		} else {
			System.out.println("Lo siento a perdido");
		}
		
	}
	
	public static String figura (int figura_alea) {
		switch (figura_alea) {
		case 1:
			return "Corazón";

		case 2:
			return "Diamante";

		case 3:
			return "Herradura";

		case 4:
			return "Campana";

		case 5:
			return "Limón";
		default:
			return null;
		}
	}

}
