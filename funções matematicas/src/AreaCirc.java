import java.util.Locale;
import java.util.Scanner;

public class AreaCirc {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double r, a, pi = 3.14159;

		System.out.println("Digite o valor do raio:");
		r = sc.nextDouble();

		a = pi * Math.pow(r, 2.0);

		System.out.printf("A area do circulo é: %.4f%n", a);

		sc.close();

	}

}
