import java.util.Scanner;

public class Negativo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um número inteiro: ");
		x = sc.nextInt();
		
		if(x < 0) {
			System.out.println("Negativo");
		}
		else if (x > 0) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Não negativo");
		}
		
		sc.close();
	}

}
