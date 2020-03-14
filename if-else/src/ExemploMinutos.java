import java.util.Locale;
import java.util.Scanner;

public class ExemploMinutos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minutos;
		double conta = 50.00;

		System.out.println("Digite o tempo usado em minutos:");
		minutos = sc.nextInt();

		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("Valor a pagar: R$%.2f%n", conta);

		sc.close();

	}

}
