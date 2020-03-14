package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Hospede;

public class ExemploVetor2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Hospede [] vect = new Hospede [10];
		
		int n;
		System.out.printf("Quantos quartos vão ser alugados? ");
		n = sc.nextInt();
		

        
        for(int i=1;i<=n;i++) {
        	sc.nextLine();
        	System.out.println("Hóspede #"+ i + ":");
        	System.out.printf("Nome: ");
        	String name = sc.nextLine();
        	System.out.printf("Email: ");
        	String email = sc.nextLine();
        	System.out.printf("Quarto: ");
        	int room = sc.nextInt();
        	vect[room] = new Hospede(name,email);
        }
        System.out.println("Quartos alugados\n\n");
        for(int i=0;i<10;i++) {
        	if(vect[i] != null) {
        		System.out.println(i + ":" + vect[i]);
        	}
        }
		
		sc.close();
}

}