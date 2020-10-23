package chapter04;

public class Snippet {
	public static void main(String[] args) {
			char ch = 'A';
			int i = ch;
			ch++;
			
			System.out.println(i);
			
			System.out.println(ch++);
			
			char ch2 = '4';
			
			System.out.println(ch2);
			System.out.println((int)ch2);
			
			char ch3 = 0x0041;
			System.out.println(ch3);
			
			System.out.println("\\Merhaba \"java\" sinifi");
			
			System.out.println("Merhaba \n java sinifi");
			
			

			
			char ch4 = '\u0041'; // charachter literal
			System.out.println(ch4);

			ch4 = 65; // sayi literali
			System.out.println(ch4);

			byte b = (byte) '\uFF04'; // bytein hexadecimal yazilisi,ASCII karsiligi 4
			System.out.println(b);

			i = '2' + '3'; // (int)'2' is 50 and (int)'3' is 51
			System.out.println("i is " + i); // i is 101

			i = 2 + '3'; // 2 is 2 and (int)'3' is 51 System.out.println("i is " + i); // i is 101
			System.out.println("i is " + i);

			System.out.println("Merhaba " + 'R');

			for (int j = 0; j < 300; j++) {
				System.out.printf("%2c", j);
				if ((j + 1) % 60 == 0) {
					System.out.println();
				}
			}

		}
	}
	


