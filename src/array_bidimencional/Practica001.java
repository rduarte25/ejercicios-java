package array_bidimencional;

public class Practica001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = new int[3][6];
		num[0][0] = 0;
		num[1][0] = 75;
		num[0][1] = 30;
		num[0][2] = 2;
		num[2][2] = -2;
		num[2][3] = 9;
		num[1][4] = 0;
		num[0][5] = 5;
		num[2][5] = 11;
		for (int y = 0; y < num.length; y++) {
			for (int x = 0; x < num[0].length; x++) {
				System.out.print("|" + num[y][x] + "|");
			}
			System.out.println();
		}
		
	}

}
