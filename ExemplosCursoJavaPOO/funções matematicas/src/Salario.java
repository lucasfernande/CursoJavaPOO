import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numfunc;
		double horast, valorh, salario;

		System.out.println("Digite seu n�mero de funcion�rio:");
		numfunc = sc.nextInt();
		System.out.println("Digite as horas trabalhadas: ");
		horast = sc.nextDouble();
		System.out.println("Digite o valor das horas trabalhadas:");
		valorh = sc.nextDouble();

		salario = horast * valorh;

		System.out.printf("\nN�mero de Funcion�rio: %d%nSalario:  R$%.2f%n", numfunc, salario);
		sc.close();
	}

}
