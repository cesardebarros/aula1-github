package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class RegistraFuncionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> listFunc = new ArrayList<>();
		
		System.out.println("Programa para registro de funcionários");
		System.out.print("Quantos funcionarios serão registrados?: ");
		int qtdFunc = sc.nextInt();

		for (int i = 1; i <= qtdFunc; i++) {
			System.out.println("Funcionario #" + i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while (hasId(listFunc, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			Funcionario func = new Funcionario(id, nome, salario);
			listFunc.add(func);
		}

		System.out.println("Lista de Funcionarios");
		for (Funcionario x : listFunc) {
			System.out.println(x.getId() + ", " + x.getNome() + ", " + x.getSalario());
		}

		System.out.println();

		System.out.print("Informe o id do funcionario que terá aumento: ");
		int idAumento = sc.nextInt();

		Funcionario funcAumento = listFunc.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
		// System.out.println("id encontrado = " + funcAumento.getId());

		int index = listFunc.indexOf(funcAumento);
		// System.out.println(index);

		if (index != -1) {
			System.out.print("Informe o percentual: ");
			Double percent = sc.nextDouble();
			listFunc.get(index).aumentaSalario(percent);
		} else {
			System.out.println("Este Id não existe!");
		}

		System.out.println("Lista de Funcionarios Atualizada");
		for (Funcionario x : listFunc) {
			System.out.println(x.getId() + ", " + x.getNome() + ", " + x.getSalario());
		}

		sc.close();

	}

	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
