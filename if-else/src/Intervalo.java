import java.util.Locale;
import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		System.out.println("Digite um valor qualquer:");
		x = sc.nextDouble();
		
		if (x >= 0 && x <= 25) {
			System.out.println("O valor está no intervalo de 0 a 25");
		}
		else if (x >= 25 && x <= 50) {
			System.out.println("O valor está no intervalo de 25 a 50");
		}
		else if (x >= 50 && x <= 75) {
			System.out.println("O valor está no intervalo de 50 a 75");
		}
		else if (x >= 75 && x <= 100) {
			System.out.println("O valor está no intervalo de 75 a 100");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();

	}

}
