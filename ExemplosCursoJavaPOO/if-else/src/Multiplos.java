import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite um n�mero inteiro:");
		a = sc.nextInt();
		
		System.out.println("Digite outro n�mero inteiro:");
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
		    System.out.println("S�o multiplos");
		}
		else {
			System.out.println("N�o s�o multiplos");
		}
		
		sc.close();
	}

}
