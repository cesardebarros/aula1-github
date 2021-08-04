package application;

import java.util.Locale;
import java.util.Scanner;

public class Media_Alturas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de pessoas: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		for (int i = 0; i < n; i++) {
			int x = i + 1;
			System.out.print("Digite a altura da pessoa " + x + ": " );
			vect[i] = sc.nextDouble();
		}
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		sc.close();
	}
}