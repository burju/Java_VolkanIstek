package chapter07;
/*
 * The problem is to create a program that will randomly select four cards from a deck
of cards.
Say you want to write a program that will pick four cards at random from a deck of 52 cards.
All the cards can be represented using an array named deck , filled with initial values 0 to 51 ,
as follows:
int[] deck = new int[52];
// Initialize cards
for (int i = 0; i < deck.length; i++)
deck[i] = i;
Card numbers 0 to 12 , 13 to 25 , 26 to 38 , and 39 to 51 represent 13 Spades, 13 Hearts,
13 Diamonds, and 13 Clubs, respectively, as shown in Figure 7.2. cardNumber / 13 deter-
mines the suit of the card and cardNumber % 13 determines the rank of the card, as shown
in Figure 7.3. After shuffling the array deck , pick the first four cards from deck . The program
displays the cards from these four card numbers
 */
public class IskambilKagitlari_CaseStudy_7_4_Burcu {
public static void main(String[] args) {
	// the first step is to create the deck using arrays
	// determine the rank( spades, hearts, diamond, clubs using %13
	// shuffle cards
	// pick & display the first 4 cards from the deck. 

	
	// step 1 create the deck using arrays.there are 52 cards in a deck
	int [] deck= new int[52]; //including 0
	for( int i =0 ; i<deck.length; i++) {
		deck[i]= i;
		}
	
	// shuffle the cards in the deck. to do that: randomly assign array numbers 
	
	for( int i=0; i<deck.length; i++) {
		int random= (int)(Math.random()*52);
		//swap algoritmasi: 
		int temp= deck[random]; // gecici degiskene rastgele cagirdigimiz arrayi atiyoruz
		deck[random]= deck[i]; // rastgele arraya deck[i] yi atiyoruz
		deck[i]= temp; // deck[i] ye atanan deck[random] daki degerin de kaybolmamsi icin tempten geri aliyoruz. 
		}
	
	// kartin tipini %13 ile bulup atayalim ( ilk 13 kart sinek,sonraki 13 kupa, sonraki...
	String[] cardType= { "Spades", "Hearts", "Diamonds", "Clubs"};
	// kartin sayisini yazdiralim, As, 2, 3,4,5, vale, kiz, papaz..
	String[] cardNumber= { "As", "2", "3" , "4", "5", "6", "7", "8", "9", "10", "Vale", "Kiz", "Papaz"};
	
	// Shuffle edildikten sonra secilen ilk 4 kartin tipini ve sayisini yazdiralim.
	
	for(int i=0; i<4; i++) {
		String cardType_str= cardType[deck[i]/13];
		String cardNumber_str= cardNumber[deck[i]%13];
		System.out.println(cardNumber_str+ " " + cardType_str);
		
	}
	
	
}
}
