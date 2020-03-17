import java.util.Locale;
import java.util.Scanner;

public class ImpRenda {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, imposto;

		System.out.println("Informe seu salário com duas casas decimais:");
		salario = sc.nextDouble();

		if (salario <= 2000.00) {
			imposto = 0.0;
		} else if (salario <= 3000.00) {
			imposto = (salario - 2000.00);
		} else if (salario <= 4500.00) {
			imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
		} else {
			imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
		}
		if (imposto == 0.0) {
			System.out.println("Isento de imposto");
		} else {
			System.out.printf("O imposto será de: R$%.2f%n", imposto);
		}
		sc.close();
	}

}
