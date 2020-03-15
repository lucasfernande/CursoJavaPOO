package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("End of program");

	}

	public static void method1() {
		System.out.println("Method1 start");
		method2();
		System.out.println("Method1 end");
	}
	
	public static void method2() {
		
		System.out.println("Method2 start\n");
		
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace(); // mostra todos os metodos chamados que acarretaram o erro
			sc.next();

		} catch (InputMismatchException e) {
			System.out.println("Input error");
			e.printStackTrace();
			sc.next();
		}
		
		sc.close();
		System.out.println("Method2 end");
	}
}