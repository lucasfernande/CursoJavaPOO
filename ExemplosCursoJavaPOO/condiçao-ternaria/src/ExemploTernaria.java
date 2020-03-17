import java.util.Locale;
import java.util.Scanner;

public class ExemploTernaria {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco;
		double desconto;
		
		System.out.println("Digite o preço: ");
		preco = sc.nextDouble();
		
		desconto = (preco < 20.00) ? preco * 0.01 : preco * 0.05;
		
		System.out.printf("Valor a ser descontado: R$%.2f%n", desconto);
		sc.close();
	}

}
