package chapter07;

public class Test_Burcu {

	public static void main(String[] args) {
	
	int x=1;
	int[] y=new int[10];
	System.out.println("x before applying the method: " + x + "\nand array y[0] before applying the method: " + y[0]);
	System.out.println();
	method(x,y);
	System.out.println("x after applying the method: " + x + "\nand y[0] after applying the method: " + y[0]);
	
	}

	public static void method(int x_m, int[] y_m) {
		x_m=2;
		y_m[0]= 555;
	}
}
