package clases;

import java.util.Scanner;

public class PruebaVehiculos {

	public static void main(String[] args) {
		
		Coche miCoche = new Coche();
		Bicicleta miBicicleta = new Bicicleta();
		Scanner entrada = new Scanner(System.in);
		int seleccion = 0;
		do {			
			System.out.println("1. Anda con la bicicleta");
			System.out.println("2. Haz el caballito con la bicicleta");
			System.out.println("3. Anda con el coche");
			System.out.println("4. Quema rueda con el coche");
			System.out.println("5. Ver kilometraje de la bicicleta");
			System.out.println("6. Ver kilometraje del coche");
			System.out.println("7. Ver kilometraje total");
			System.out.println("8. Salir");
			System.out.println("Elige una opción (1 - 8)");
			seleccion = entrada.nextInt();
			System.out.println();
			System.out.println();
			
			switch(seleccion) {
			case 1:
				System.out.println(miBicicleta.andarVehiculo());
				break;
			case 2:
				System.out.println(miBicicleta.hacerCaballito());
				break;
			case 3:
				System.out.println(miCoche.andarVehiculo());
				break;
			case 4:
				System.out.println(miCoche.quemaRueda());
				break;
			case 5:
				System.out.println(miBicicleta.getKilometrosRecorridos());
				break;
			case 6:
				System.out.println(miCoche.getKilometrosRecorridos());
				break;
			case 7:
				System.out.println(Vehiculo.getKilometrosTotales());
				break;
			default:
				
			}
		} while (seleccion != 8);
		entrada.close();
	}

}
