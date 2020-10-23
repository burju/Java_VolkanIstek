package chapter08;

public class SudokuCozumuKontrol {

	public static void main(String[] args) {
		int[][] sudoku = {
				{5, 3, 4, 6, 7, 8, 9, 1, 2},
				{6, 7, 2, 1, 9, 5, 3, 4, 8},
				{1, 9, 8, 3, 4, 2, 5, 6, 7},
				{8, 5, 9, 7, 6, 1, 4, 2, 3},
				{4, 2, 6, 8, 5, 3, 7, 9, 1},
				{7, 1, 3, 9, 2, 4, 8, 5, 6},
				{9, 6, 1, 5, 3, 7, 2, 8, 4},
				{2, 8, 7, 4, 1, 9, 6, 3, 5},
				{3, 4, 5, 2, 8, 6, 1, 7, 9}};
		
		if (gecerliBirSudouCozumumu(sudoku)) {
			System.out.println("Gecerli bir sudoku cozumudur");
		} else {
			System.out.println("Gecerli bir sudoku cozumu degildir");
		}
	}

	private static boolean gecerliBirSudouCozumumu(int[][] sudoku) {
		if (gecerliSayiKontrolu(sudoku) == false) {
			return false;
		}
		
		if (satirKontrolu(sudoku) == false) {
			return false;
		}
		
		if (sutunKontrolu(sudoku) == false) {
			return false;
		}
		
		// TODO kutucuklari kontrol et
		
		return true;
	}

	public static boolean gecerliSayiKontrolu(int[][] sudoku) {
		for (int satir = 0; satir < sudoku.length; satir++) {
			for (int sutun = 0; sutun < sudoku.length; sutun++) {
				if (sudoku[satir][sutun] < 1 || sudoku[satir][sutun] > 9) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean satirKontrolu(int[][] sudoku) {
		for (int satir = 0; satir < sudoku.length; satir++) {
			boolean[] kontrol = new boolean[9];
			for (int sutun = 0; sutun < sudoku.length; sutun++) {
				kontrol[sudoku[satir][sutun] - 1] = true;
			}
			for (boolean b : kontrol) {
				if (b == false) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean sutunKontrolu(int[][] sudoku) {
		for (int sutun = 0; sutun < sudoku.length; sutun++) {
			boolean[] kontrol = new boolean[9];
			for (int satir = 0; satir < sudoku.length; satir++) {
				kontrol[sudoku[satir][sutun] - 1] = true;
			}
			for (boolean b : kontrol) {
				if (b == false) {
					return false;
				}
			}
		}
		return true;
	}

}
