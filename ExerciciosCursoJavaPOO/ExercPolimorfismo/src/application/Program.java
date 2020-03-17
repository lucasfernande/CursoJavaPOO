package application;

import java.text.*;
import java.util.*;

import entities.ImportedProducts;
import entities.Product;
import entities.UsedProducts;


public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList <>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported? (c/u/i): ");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(type == 'c') {
				list.add(new Product(name, price));
			}
			else if(type == 'u') {
				System.out.print("Manufactura date (DD/MM/YYYY): ");
				Date manufactureDate = data.parse(sc.next());
				list.add(new UsedProducts(name, price, manufactureDate));
			}
			else {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProducts(name, price, customsFee));
			}
			
		}
		
		System.out.println("PRICE TAGS");
		
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		
		
		sc.close();

	}

}
