package application;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte>  list = new ArrayList<>();
		
		System.out.print("Digite o número de contribuintes: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Contribuinte #" + i + ":");
			System.out.print("Pessoa física ou jurídica? (f/j): ");
			char type = sc.next().charAt(0);
			
			if(type == 'f') {
			System.out.print("Nome: ");
			sc.nextLine();
		    String nome = sc.nextLine();
		    
		    System.out.print("Renda anual: ");
		    double rendaAnual = sc.nextDouble();
		    
		    System.out.print("Gastos com saúde: ");
		    double gastoSaude = sc.nextDouble();
		    
		    list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			}   
			
			else {
				System.out.print("Nome: ");
				sc.nextLine();
			    String nome = sc.nextLine();
			    
			    System.out.print("Renda anual: ");
			    double rendaAnual = sc.nextDouble();
			    
			    System.out.print("Número de funcionários: ");
			    int numFunc = sc.nextInt();
			    
			    list.add(new PessoaJuridica(nome, rendaAnual, numFunc));
			}
		}
		
		double soma = 0.0;
		System.out.println();
		System.out.println("Contribuintes");
		for(Contribuinte con : list) {
			double imposto = con.imposto();
			System.out.printf (con.getNome() + ": $" +  String.format("%.2f", imposto) + "\n");
			soma += imposto;
		}
		
		System.out.println();
		System.out.println("Soma total: " + String.format("%.2f", soma));
		
		sc.close();
		
	}

}
