package chapter07;

public class ArrayiTersCevir_Burcu {
	public static void main(String[] args) {
		int[] list1 = new int[5];
		System.out.print("the list is:");
		for (int i = 0; i < 5; i++) {
			list1[i] = i;
			System.out.printf("%2d", i);
		}
		System.out.print("\nthe reverse of the list is: ");
		int[] list2= reverseList(list1);
		for( int j=0; j<list1.length; j++) {
			
			System.out.print(list2[j]+ " ");
		}
		
	}

	private static int[] reverseList(int[] list) {
		int[] reverseList = new int[list.length];

		for (int i = 0, j = list.length -1; i < reverseList.length-1; i++, j--) {
			reverseList[i] = list[j];
		}
		return reverseList; 
	}

}
