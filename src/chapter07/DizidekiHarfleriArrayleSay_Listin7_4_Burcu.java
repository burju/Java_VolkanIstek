package chapter07;

public class DizidekiHarfleriArrayleSay_Listin7_4_Burcu {
	private static final int FINAL_SAYI = 100;

	public static void main(String[] args) {
		
		//100luk bir char array olustur 
		// 100'luk char array'in icine ratsgele harfler koy
		
		//100luk bir char array olustur 
		char[] dizi= new char[FINAL_SAYI];
		
		// 100'luk char array'in icine ratsgele harfler koy & yazdir
		// bunu metoda koyduk
		arrayeRassalHarfYazdir(dizi);
		
		// count the occurance of each letters
		countEachLetter(dizi);

		System.out.println();
		}
	
	
	public static void arrayeRassalHarfYazdir(char[] dizi) {
		
		for(int i=0; i< FINAL_SAYI; i++) {
			dizi[i]=(char)((int)((Math.random()*('z'-'a'+1))+'a'));
			System.out.print(dizi[i]+ " ");
			if( (i+1)%20==0) {
				System.out.println();
			}
}}

	public static int[] countEachLetter(char[] dizi) {
		int [] count=new int[26];
		
		for (int i = 0; i < dizi.length; i++) {
				count[dizi[i]- 'a']++;
		}
		
		return count;
		}
		

}
