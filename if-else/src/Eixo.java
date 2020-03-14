import java.util.Locale;
import java.util.Scanner;

public class Eixo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y;

		System.out.println("Digite o valor do x:");
		x = sc.nextDouble();

		System.out.println("Digite o valor do y:");
		y = sc.nextDouble();

		if (x > 0.0 && y > 0.0) {
			System.out.println("O ponto está no quadrante 1");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("O ponto está no quadrante 2");
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("O ponto está no quadrante 3");
		} else if (x > 0.0 && y < 0.0) {
			System.out.println("O ponto está no quadrante 4");
		} else if (y == 0) {
			System.out.println("O ponto está no eixo X");
		} else if (x == 0) {
			System.out.println("O ponto está no eixo Y");
		} else {
			System.out.println("O ponto está na origem");
		}
		sc.close();
	}

}
