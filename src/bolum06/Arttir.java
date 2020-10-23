package bolum06;

public class Arttir {

	public static void main(String[] args) {
		int x = 5;
		
		System.out.println("x in arttir metoduna gonderilmeden onceki degeri: " + x);
		
		arttir(x);
		
		System.out.println("x in arttir metoduna gonderildikten sonraki degeri: " + x);
	}

	
	
	
	
	
	
	
	static void arttir(int x) {
		x++;
		System.out.println("Arttir metodunun icinde n nin degeri: " + x);
		
	}

}
