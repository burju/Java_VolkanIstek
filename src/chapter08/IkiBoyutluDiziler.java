package chapter08;

public class IkiBoyutluDiziler {
	public static void main(String[] args) {
		int[][] volkan = null; 
		
		System.out.println(volkan);
		
		volkan = new int[5][5];
		
		volkan[3][4] = 7;
		
		for (int i = 0; i < volkan.length; i++) {
			for (int j = 0; j < volkan[i].length; j++) {
				System.out.print(volkan[i][j] + " ");
			}
			System.out.println();
		}
		
		
		int[][] x;
		
		x = new int[3][];
		
		x[0] = new int[4];
		x[1] = x[0];
		x[2] = x[0];
		
		x[2][2] = 5;
		System.out.println(x[1][2]);
		
	}

}
