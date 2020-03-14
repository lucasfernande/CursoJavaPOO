import java.util.Locale;
import java.util.Scanner;

public class Preco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorp1, valorp2, total;
		int codp1, codp2, qtdp1, qtdp2;
		System.out.println("Digite o código do produto 1: ");
		codp1 = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		qtdp1 = sc.nextInt();
		System.out.println("Digite o preço do produto 1: ");
		valorp1 = sc.nextDouble();
		
		System.out.println("Digite o código do produto 2: ");
		codp2 = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		qtdp2 = sc.nextInt();
		System.out.println("Digite o preço do produto 2: ");
		valorp2 = sc.nextDouble();
		
		total = (qtdp1 * valorp1) + (qtdp2 * valorp2);
		
		System.out.printf("\nValor a pagar: R$%.2f", total);
		
		sc.close();
	}

}
