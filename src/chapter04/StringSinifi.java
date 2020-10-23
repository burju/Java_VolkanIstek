package chapter04;

public class StringSinifi {
	public static void main(String[] args) {

		String yazi = "Merhaba Java!";

		System.out.println("volkan".length());

		System.out.println(yazi.length());

		System.out.println(yazi.charAt(0));
		System.out.println(yazi.charAt(11));

		String yazi2 = "Java cok guzel!";
		String yazi3 = yazi.concat(yazi2);
		System.out.println(yazi3);

		char ch = yazi.charAt(yazi.length() - 1);
		System.out.println(" ch: " + "" + ch);
	}

}
