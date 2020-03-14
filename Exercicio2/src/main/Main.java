package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Salario;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salario res = new Salario();
		
		System.out.println("Nome: ");
		res.name = sc.nextLine();
		System.out.println("Salario bruto: ");
		res.salbruto = sc.nextDouble();
		System.out.println("Imposto: ");
		res.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Salário: " + res);
		System.out.println("Qual a porcentagem para incrementar salário?");
		double percentage = sc.nextDouble();
		res.bonussalario(percentage);
		
		System.out.println();
		System.out.printf("Updated data: " +  res);
		sc.close();
	}

}
