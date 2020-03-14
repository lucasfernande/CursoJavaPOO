package Area;

import java.util.Locale;
import java.util.Scanner;

import Entities.AreaRet;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AreaRet res = new AreaRet();
		System.out.println("Enter the width of rectangle: ");
		res.width = sc.nextDouble();
		System.out.println("Enter the height of retangle: ");
		res.height = sc.nextDouble();
	   
		System.out.println();
		System.out.printf("\nArea: %.2f%n", res.area());
	    System.out.printf("Perimetro: %.2f%n", res.perimetro());
	    System.out.printf("Diagonal: %.2f%n", res.diag());
		
		sc.close();

	}

}
