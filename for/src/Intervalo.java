import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, in = 0, out = 0;
		int x;

		System.out.println("Digite a quantidade de números: ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número inteiro: ");
			x = sc.nextInt();

			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println("Dentro do intervalo: " + in);
		System.out.println("Fora do intervalo: " + out);

		sc.close();
	}

}
