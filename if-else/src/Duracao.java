import java.util.Scanner;

public class Duracao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horai, horaf;
		int duracao;
		
		System.out.println("Digite a hora inicial do jogo:");
		horai = sc.nextInt();
		
		System.out.println("Digite a hora final do jogo:");
		horaf = sc.nextInt();
		
		if(horai < horaf) {
		   duracao = horaf - horai;
		}
		else {
			duracao = 24 - horai + horaf;
		}
		
		System.out.println("O jogo durou " + duracao + " Hora(s)");
		sc.close();

	}

}
