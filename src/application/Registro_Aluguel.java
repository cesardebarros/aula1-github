package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluguel;

public class Registro_Aluguel {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] aluguel = new Aluguel[10];
		
		System.out.println("Sistema para registro de Aluguel");
		System.out.print("Informe a quantidade de algueis: ");
		int qtd = sc.nextInt();
		
		for (int i=0; i <qtd; i++) {
			int x = i + 1;
			System.out.println();
			System.out.println("Alguel #" + x +":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Numero do quarto: ");
			x = sc.nextInt();
			while (x<0 || x>9) {
				System.out.println("Nro quarto invalido. Favor informar de 0 a 9: ");
				x = sc.nextInt();
			}
			
			while (aluguel[x] != null) {
				System.out.println("Quarto ocupado. Favor escolher outro: ");
				x = sc.nextInt();
			}
			
			aluguel[x] = new Aluguel(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		
		for (int i=0; i<aluguel.length; i++) {
			if (aluguel[i] != null) {
				System.out.println(i + ": " + aluguel[i]);
			}
		}
		
		// teste com for each
		System.out.println("------------------");
		for (Aluguel lista : aluguel) {
			System.out.println(aluguel.length + ": " + lista);
		}
		
		sc.close();
	}

}
