package bolum06;

public class Arttir2 {
	public static void main(String[] args) {
		int x=0;
		System.out.println("the value of x before getting into method: " + x);
		incrementMethod(x);
		System.out.println("the value of x after getting into the method: " + x);
		
	}

	 static void incrementMethod(int n) {
		n++;
		System.out.println("the value of n in the method:" + n);
		
	}

}
