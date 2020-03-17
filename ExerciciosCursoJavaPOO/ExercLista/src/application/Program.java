package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Entities;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Entities> list = new ArrayList<>();
		
		System.out.printf("Quantos funcion�rios ser�o registrados? ");
		int n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.println();
			System.out.println("Funcion�rio #" + i + ":");
			System.out.printf("ID: ");
			int id = sc.nextInt();
			System.out.printf("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Sal�rio: ");
			double salary = sc.nextDouble();
			list.add(new Entities(id, name, salary));
		}
		
		System.out.printf("Digite o id do funcion�rio que ter� o sal�rio aumentado: ");
		int id = sc.nextInt();
		
		Entities emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("Esse id n�o ecxiste!");
		} else {
			System.out.printf("Digite a porcentagem a ser incrementada: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("Lista dos funcion�rios");
		for(Entities x : list) {
			System.out.println(x);
		}
		
		sc.close();

	}

}
