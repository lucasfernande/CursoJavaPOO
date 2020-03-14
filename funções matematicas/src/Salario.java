import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numfunc;
		double horast, valorh, salario;

		System.out.println("Digite seu número de funcionário:");
		numfunc = sc.nextInt();
		System.out.println("Digite as horas trabalhadas: ");
		horast = sc.nextDouble();
		System.out.println("Digite o valor das horas trabalhadas:");
		valorh = sc.nextDouble();

		salario = horast * valorh;

		System.out.printf("\nNúmero de Funcionário: %d%nSalario:  R$%.2f%n", numfunc, salario);
		sc.close();
	}

}
