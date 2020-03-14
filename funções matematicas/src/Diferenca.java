import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, dif;
		
		System.out.println("Digite o primeiro valor:");
		a = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		b = sc.nextInt();
		System.out.println("Digite o terceiro valor:");
		c = sc.nextInt();
		System.out.println("Digite o quarto valor:");
		d = sc.nextInt();
		
		dif = (a * b - c * d);
		
		System.out.printf("A diferença dos valores é: %d", dif);
		
		
		sc.close();
	}

}
