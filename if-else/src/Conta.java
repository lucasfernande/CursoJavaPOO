import java.util.Locale;
import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod, qtd;
		double preco1 = 4.00, preco2 = 4.50, preco3 = 5.00, preco4 = 2.00, preco5 = 1.50, total;
		
		System.out.println("            Tabela de Preços\n");
		System.out.println("código          produto         preço");
		System.out.printf("  1             Hot Dog         R$%.2f%n", preco1);
		System.out.printf("  2             X-Salada        R$%.2f%n", preco2);
		System.out.printf("  3             X-Bacon         R$%.2f%n", preco3);
		System.out.printf("  4             Torrada         R$%.2f%n", preco4);
		System.out.printf("  5             Refri           R$%.2f%n%n", preco5);
		
		System.out.println("Digite o código do produto desejado:");
		cod = sc.nextInt();
		System.out.println("Digite a quantidade desejada:");
		qtd = sc.nextInt();
		
		if (cod == 1) {
			total = qtd * preco1;
			System.out.printf("Valor a pagar: R$%.2f", total);
		}
		else if (cod == 2) {
			total = qtd * preco2;
			System.out.printf("Valor a pagar: R$%.2f", total);
		}
		else if (cod == 3) {
			total = qtd * preco3;
			System.out.printf("Valor a pagar: R$%.2f", total);
		}
		else if (cod == 4) {
			total = qtd * preco4;
			System.out.printf("Valor a pagar: R$%.2f", total);
		}
		else {
			total = qtd * preco5;
			System.out.printf("Valor a pagar: R$%.2f", total);
		}
		
		sc.close();

	}

}
