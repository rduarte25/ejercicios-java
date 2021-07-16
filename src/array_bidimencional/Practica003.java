package array_bidimencional;

public class Practica003 {

	public static void main(String[] args) {
		int[][] array_numero = new int[4][5];
		for (int y = 0; y < array_numero.length; y++) {
			for (int x = 0; x < array_numero[0].length; x++) {
				array_numero[y][x] = (int)(Math.random()*900)+100;
			}			
		}
		for (int y = 0; y < array_numero.length; y++) {
			for (int x = 0; x < array_numero[0].length; x++) {
				System.out.print("|" + array_numero[y][x] + "|");
			}
			System.out.println();
		}
	}

}
