package aleatorios;

public class CartaAzar2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generación de palos de las cartas al azar.
		int palo = (int) (Math.random() *3 ) +1;
		String palo_carta = "0";
		//Determinación de cual palo es.
		switch (palo) {
		case 1:
			palo_carta = "Picas";
			break;
		case 2:
			palo_carta = "Corazones";
			break;
		case 3:
			palo_carta = "Diamantes";
			break;
		case 4:
			palo_carta = "Tréboles";
			break;
		default:
		}
		//Generación de carta al azar.
		int carta = (int) (Math.random() * 9) +1;
		//Deteminación de literales.
		String carta_literal;
		switch(carta) {
		case 1:
			carta_literal = "A";
			break;
		case 8:
			carta_literal = "Sota";
			break;
		case 9:
			carta_literal = "Caballo";
			break;
		case 10:
			carta_literal = "Rey";
			break;
		default:
			carta_literal = "" + carta;
		}
		
		System.out.println("Tu carta es: " + carta_literal + " de " + palo_carta);
		
	}
}
