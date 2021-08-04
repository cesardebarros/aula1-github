package application;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa para exercitar matrizes");
		System.out.println();
		
		System.out.print("Numero de linhas: ");
		int qtLin = sc.nextInt();
		System.out.print("Numero de colunas: ");
		int qtCol = sc.nextInt();
		
		int[][] matriz = new int[qtLin][qtCol];
		
		for (int lin = 0; lin < matriz.length; lin++) {
			System.out.print("Valores para a linha " + (lin + 1) + ": ");
			for (int col = 0; col < matriz[lin].length; col++) {
				matriz[lin][col] = sc.nextInt();
			}
		}
		System.out.println("qtd linhas = " + matriz.length);
		System.out.println("qtd colunas = " + matriz[0].length);
		
		System.out.print("informe o nro a ser pesquisado: ");
		int num = sc.nextInt();
		
		for (int lin = 0; lin < matriz.length; lin++) {
			for (int col = 0; col < matriz[lin].length; col++) {
				if (matriz[lin][col] == num) {
					System.out.println("posição: " + lin + ", " + col);
					
					//valor da esquerda
					int x = col - 1;
					if (x >= 0) {
						System.out.println("esquerda: " + matriz[lin][x]);
					}
					//valor da direita
					x = col + 1;
					if (x < matriz[lin].length) {
						System.out.println("direita: " + matriz[lin][x]);
					}
					//valor de cima
					x = lin - 1;
					if (x >= 0) {
						System.out.println("cima: " + matriz[x][col]);
					}
					//valor da baixo
					x = lin + 1;
					if (x < matriz.length) {
						System.out.println("baixo: " + matriz[x][col]);
					}
				}
			}
		}
		
		sc.close();
	}

}
