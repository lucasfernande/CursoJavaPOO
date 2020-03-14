package Estoque;

import java.util.Locale;
import java.util.Scanner;

import Entities.Produto;

public class ProdEstoque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		
		System.out.println("Enter the product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
        
		Produto product = new Produto(name, price);
		product.setName("Computer");
		System.out.println("Updated data: " + product.getName());
		System.out.println("\nProduct data: " + product);

		System.out.println("\nEnter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProduct(quantity);

		System.out.println("Updated data: " + product);

		System.out.println("\nEnter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println("Updated data: " + product);

		sc.close();

	}

}
