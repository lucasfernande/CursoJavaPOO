import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, y;

		System.out.println("Digite o valor de x:");
		x = sc.nextInt();

		System.out.println("Digite o valor de Y");
		y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0.0 && y > 0.0) {
				System.out.println("O ponto está no quadrante 1");
			} else if (x < 0.0 && y > 0.0) {
				System.out.println("O ponto está no quadrante 2");
			} else if (x < 0.0 && y < 0.0) {
				System.out.println("O ponto está no quadrante 3");
			} else if (x > 0.0 && y < 0.0) {
				System.out.println("O ponto está no quadrante 4");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		System.out.println("Nulo");
		sc.close();
	}

}
