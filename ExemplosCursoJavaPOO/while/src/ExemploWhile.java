import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, soma = 0;
		
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
        
		System.out.println("Soma = " + soma);
		sc.close();
	}

}
