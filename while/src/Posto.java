import java.util.Scanner;

public class Posto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod, alc = 0, gas = 0, die = 0;
		
		System.out.println("Digite o código do combustível:");
		cod = sc.nextInt();
		
		while (cod != 4) {
			switch (cod) {
			case 1:
				alc++;
				break;
			case 2:
				gas++;
				break;
			case 3:
				die++;
				break;
			}
	    cod = sc.nextInt();			
		}
		
		System.out.println("Obrigado!");
		System.out.println("Alcool: " + alc);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + die);
		sc.close();

	}

}
