import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		int soma;
		
		System.out.println("Digite o primeiro n�mero: ");
		x = sc.nextInt(); // entrada de dados
		System.out.println("Digite o segundo n�mero: ");
		y = sc.nextInt(); // entrada de dados
		
		soma = x + y; // processamento
		
		System.out.println(x + " + " + y + " � igual a: "+ soma); // sa�da de dados
		 
		sc.close();
	}
}