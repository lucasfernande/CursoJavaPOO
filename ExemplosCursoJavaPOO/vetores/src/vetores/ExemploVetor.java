package vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Digite o quantidade de pessoas a serem medidas:");
		n = sc.nextInt();
		double [] vect = new double [n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite a altura: ");
			vect [i] = sc.nextDouble();
		}
		
		double soma = 0;
		for(int i=0; i<n; i++) {
			soma += vect[i];
			}
		double avg = soma / n;
		
		System.out.printf("Média de altura: %.2f", avg);
		
		sc.close();
}

}
