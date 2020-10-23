package chapter08;

import java.util.Scanner;

public class EnYakinIkiNoktayiBulmaca {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("Kac nokta gireceksiniz:");
		int noktaSayisi = klavye.nextInt();

		double[][] noktalar = new double[noktaSayisi][2];
		for (int i = 0; i < noktaSayisi; i++) {
			noktalar[i][0] = klavye.nextDouble();
			noktalar[i][1] = klavye.nextDouble();
		}

		double enKucukMesafe = Double.MAX_VALUE;

		int p1 = -1;
		int p2 = -1;
		for (int i = 0; i < noktalar.length - 1; i++) {
			for (int j = i + 1; j < noktalar.length; j++) {
				double mesafe = mesafeHesapla(noktalar[i][0], noktalar[i][1], noktalar[j][0], noktalar[j][1]);
				if (enKucukMesafe > mesafe) {
					enKucukMesafe = mesafe;
					p1 = i;
					p2 = j;
				}
			}
		}

		System.out.println("Birbirine en yakin iki nokta: (" + noktalar[p1][0] + ", " + noktalar[p1][1] + ") ile ("
				+ noktalar[p2][0] + ", " + noktalar[p2][1] + ") dir");
	}

	public static double mesafeHesapla(double x1, double y1, double x2, double y2) {
		System.out.println("Mesafe hesapla metodu cagirildi");
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}

}
