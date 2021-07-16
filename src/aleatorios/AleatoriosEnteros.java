package aleatorios;

public class AleatoriosEnteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		for (int i = 0; i<=50; i++) {
			int num_alea = (int)(Math.random() * 100)+100;
			int num_min = 0;
			int num_max = 0;
			if (num_min > num_alea) {
				num_min = num_alea;
			} else if (num_min == 0) {
				num_min = num_alea;
			}
			
			if (num_max < num_alea) {
				num_min = num_alea;
			} else if (num_min == 0) {
				num_min = num_alea;
			}
			
			total += num_alea;
			
			System.out.print(num_alea + " ");
		}
		
		System.out.println("La media es: " + (total / 50));
	}

}
