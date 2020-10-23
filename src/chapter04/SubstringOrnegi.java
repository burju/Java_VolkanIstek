package chapter04;

public class SubstringOrnegi {
	public static void main(String[] args) {

		String s1 = "Merhaba Java Sinifi";
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(0, 3));

		System.out.println(s1.indexOf('M'));
		System.out.println(s1.indexOf('J', 7));
		System.out.println(s1.lastIndexOf('M'));
		System.out.println(s1.lastIndexOf('M', 2));
		System.out.println("-------------------------------------");
		System.out.println("Burcu Kanyilmaz".substring(0, 5));

		String girdi = "Burcu Kanyilmaz";
		int bosluk = girdi.indexOf(' ');

		
		System.out.println(bosluk);

		String name = girdi.substring(0, bosluk);
		String lastname = girdi.substring(bosluk + 1);
		System.out.println(" name is: " + name + ", last name is: " + lastname);

	}

}
