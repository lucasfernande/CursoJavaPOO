package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Conversor;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o pre�o do d�lar?");
		double precoDolar = sc.nextDouble();
		System.out.print("Quantos d�lares voc� vai comprar?");
		double compra = sc.nextDouble();
		
		double result = Conversor.dolarToReal(compra, precoDolar);
		System.out.printf("Compra a ser paga em reais: %.2f%n", result);
        
		sc.close();
	}

}
