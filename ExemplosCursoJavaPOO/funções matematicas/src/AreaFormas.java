import java.util.Locale;
import java.util.Scanner;

public class AreaFormas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, pi = 3.14159;
		double tr, circ, trap, quad, ret;

		System.out.println("Digite o valor A: ");
		a = sc.nextDouble();
		System.out.println("Digite o valor B: ");
		b = sc.nextDouble();
		System.out.println("Digite o valor C: ");
		c = sc.nextDouble();

		tr = (a * c) / 2;
		circ = pi * Math.pow(c, 2);
		trap = (a + b) * c / 2;
		quad = Math.pow(b, 2);
		ret = a * b;

		System.out.println("\nÁreas\n\n");
		System.out.printf("Triângulo: %.3f%nCirculo: %.3f%nTrapézio: %.3f%nQuadrado: %.3f%nRetângulo: %.3f%n", tr, circ, trap, quad, ret);
        
		sc.close();
	}

}
